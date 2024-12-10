import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { QuestionnaireManagerComponent } from '../questionnaire-manager/questionnaire-manager.component';
import { ClientService, QuestionnaireDetail, QuestionRepondus, ReponseRepondue } from '../../services/client.service';
import { ActivatedRoute, Router } from '@angular/router';
import { concatMap, from, last } from 'rxjs';


@Component({
  selector: 'app-question',
  imports: [HeaderComponent, FooterComponent, CommonModule, QuestionnaireManagerComponent, FormsModule],
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})

export class QuestionComponent implements OnInit {
  questionnaire: QuestionnaireDetail[] = [];
  questionnaireParCategories = new Map<string, Map<string, QuestionRepondus[]>>();
  question!: QuestionRepondus;
  isLoading = true;

  constructor(private route: ActivatedRoute, private router : Router, private clientservice: ClientService) {}

  ngOnInit(): void {
    const questionId = this.route.snapshot.paramMap.get('id');
    setTimeout(() => {
      this.questionnaire = QuestionnaireManagerComponent.getQuestionnaireDetail();
    
      if (this.questionnaire.length === 0) {
        console.error('Questionnaire vide ou non chargé');
        this.isLoading = false;
        return;
      }
    
      const questions = this.questionnaire[0].questionsRepondues;
      const foundQuestion = questions.find((q) => q.id === questionId);

      if (!foundQuestion) {
        console.error('Aucune question trouvée pour cet ID');
        this.isLoading = false;
        return;
      }
      
      this.question = foundQuestion;
      // On remplace les XXX par le nom de l'entreprise
      const user = localStorage.getItem('authToken');
      const entreprise = user ? JSON.parse(user).nomEntreprise : '';
      this.question.intitule = this.question.intitule.replace(/XXX/g, entreprise ?? '');
      this.questionnaireParCategories = QuestionnaireManagerComponent.getQuestionnaireParCategories();

      this.isLoading = false;
    }, 700);
  }

  navigateToNextQuestion(question: QuestionRepondus): void {
    // sauvegarder
    from(question.reponseRepondus).pipe(
      // concatMap va s'assurer que chaque appel se fait après la complétion du précédent
      concatMap(reponse => this.clientservice.changerReponseQuestion(
        reponse.id,
        reponse.selectionne,
        reponse.estEngage
      )),
      last(),
      concatMap(() => this.clientservice.changerCommentaireQuestion(question.id.toString(), question.commentaire )),
    ).subscribe({
      next: (data) => {
        console.log('Réponse modifiée avec succès pour', data.id, data.intitule, 'en', data.selectionne);
      },
      error: (err) => {
        console.error('Erreur lors de la modification de la réponse :', err);
      },
      complete: () => {
        let indexOfCurrentQuestion = this.questionnaire[0].questionsRepondues.indexOf(this.question);
        indexOfCurrentQuestion++;
        if (indexOfCurrentQuestion >= this.questionnaire[0].questionsRepondues.length) {
          indexOfCurrentQuestion = 0;
        }
        this.router.navigate(['/esg/question/', this.questionnaire[0].questionsRepondues[indexOfCurrentQuestion].id])
        .then(() => {
          window.location.reload();
        });
      }
    });

  }

  selectAnswer(reponse : ReponseRepondue): void {
    reponse.selectionne = !reponse.selectionne;
  }

  selectEngagement(reponse : ReponseRepondue, event: Event): void {
    // TODO engagement forcé
    /* event.preventDefault();
    event.stopImmediatePropagation();
    (event.target as HTMLInputElement).checked = reponse.estEngage;
    return;
    */
    reponse.estEngage = event.target ? (event.target as HTMLInputElement).checked : false;
  } 

    // Renvoie true si une question a été répondue
    isAnswered(question: QuestionRepondus): boolean {
      return question.reponseRepondus.some(
        reponse => (reponse.selectionne && question.reponseRepondus.length > 0) || question.commentaire !== ''
      );
    }

    getClassList(question: QuestionRepondus): string {
      let classe = 'link question crop';
      if(this.isAnswered(question) && question.id !== this.question.id) {
        classe += ' answered';
      }
      else if(question.id === this.question.id) {
        classe += ' current';
      }
      return classe;
    }
}