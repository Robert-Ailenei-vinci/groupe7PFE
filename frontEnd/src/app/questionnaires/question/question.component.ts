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
    let indexOfCurrentQuestion = this.questionnaire[0].questionsRepondues.indexOf(this.question);
    indexOfCurrentQuestion++;
    if (indexOfCurrentQuestion >= this.questionnaire[0].questionsRepondues.length) {
      indexOfCurrentQuestion = 0;
    }
    this.questionnaire[0].questionsRepondues[indexOfCurrentQuestion]
    this.saveQuestionAndSwitchToQuestion(question, this.questionnaire[0].questionsRepondues[indexOfCurrentQuestion]);
  }


  saveQuestionAndSwitchToQuestion(question: QuestionRepondus, nextQuestion : QuestionRepondus): void {
    // sauvegarder
    if(question.reponseRepondus.length === 0) {
      from(question.commentaire).pipe(
        concatMap(() => this.clientservice.changerCommentaireQuestion(question.id.toString(), question.commentaire )),
      ).subscribe({
        next: (data) => {
          console.log('Commentaire modifié avec succès pour', data.id, data.intitule);
        },
        error: (err) => {
          console.error('Erreur lors de la modification du commentaire :', err);
        },
        complete: () => {
          this.router.navigate(['/esg/question/', nextQuestion.id])
          .then(() => {
            window.location.reload();
          });
        }
      });
    }
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
        this.router.navigate(['/esg/question/', nextQuestion.id])
        .then(() => {
          window.location.reload();
        });
      }
    });
  }

  selectAnswer(reponse : ReponseRepondue): void {
    reponse.selectionne = !reponse.selectionne;
  }

  nombreDeQuestions(): number {
    let nombreDeQuestions = 0;
    for (const subCategories of this.questionnaireParCategories.values()) {
      for (const questions of subCategories.values()) {
        nombreDeQuestions += questions.length;
      }
    }
    return nombreDeQuestions;
  }

  nombreDeQuestionsRepondues(): number {
    let nombreDeQuestionsRepondues = 0;
    for (const subCategories of this.questionnaireParCategories.values()) {
      for (const questions of subCategories.values()) {
        nombreDeQuestionsRepondues += questions.filter(this.isAnswered).length;
      }
    }
    return nombreDeQuestionsRepondues;
  }


  selectEngagement(reponse : ReponseRepondue, event: Event): void {
    if(reponse.estEngageForce) {
      event.preventDefault();
      event.stopImmediatePropagation();
      (event.target as HTMLInputElement).checked = true;
      return;
    }
    reponse.estEngage = true;
  } 

    // Renvoie true si une question a été répondue
    isAnswered(question: QuestionRepondus): boolean {
      return question.reponseRepondus.some(reponse => reponse.selectionne) || question.commentaire !== '';
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