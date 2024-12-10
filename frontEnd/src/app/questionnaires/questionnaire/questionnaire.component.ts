import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { QuestionnaireManagerComponent } from '../questionnaire-manager/questionnaire-manager.component';
import { CommonModule } from '@angular/common';
import { QuestionRepondus } from '../../services/client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-questionnaire',
  imports: [HeaderComponent, FooterComponent, QuestionnaireManagerComponent, CommonModule],
  templateUrl: './questionnaire.component.html',
  styleUrls: ['./questionnaire.component.css']
})
export class QuestionnaireComponent implements OnInit {
  questionnaireParCategories: Map<string, Map<string, QuestionRepondus[]>> = new Map();
  isLoading = true; // Variable pour l'état de chargement

  constructor(private router: Router) {}

  ngOnInit(): void {
    // Simuler un chargement des données pour vérifier leur disponibilité
    setTimeout(() => {
      this.questionnaireParCategories = QuestionnaireManagerComponent.getQuestionnaireParCategories();
      if (this.questionnaireParCategories.size === 0) {
        console.error('Aucune donnée disponible');
      } else {
        console.log('Données chargées :', this.questionnaireParCategories);
      }
      this.isLoading = false; // Indique que les données sont prêtes
    }, 700);
  }

  // Compte le total des questions dans une catégorie
  getTotalQuestions(category: Map<string, QuestionRepondus[]>): number {
    let totalQuestions = 0;
    category.forEach(subCategory => {
      totalQuestions += this.getQuestionsCount(subCategory);
    });
    return totalQuestions;
  }

  // Compte le total des questions répondus dans une catégorie
  getAnsweredTotalQuestions(category: Map<string, QuestionRepondus[]>): number {
    let totalQuestions = 0;
    category.forEach(subCategory => {
      totalQuestions += this.getAnsweredQuestionsCount(subCategory);
    });
    return totalQuestions;
  }

  // Compte le nombre de questions dans une sous-catégorie
  getQuestionsCount(questions: QuestionRepondus[]): number {
    return questions.length;
  }

  // Compte le nombre de questions répondus dans une sous-catégorie
  getAnsweredQuestionsCount(questions: QuestionRepondus[]): number {
    let answeredQuestions = 0;
    questions.forEach(question => {
      if (this.isAnswered(question)) {
        answeredQuestions++;
      }
    });
    return answeredQuestions;
  }

  // Renvoie true si une question a été répondue
  isAnswered(question: QuestionRepondus): boolean {
    return question.reponseRepondus.some(
      reponse => (reponse.selectionne && question.reponseRepondus.length > 0) || question.commentaire !== ''
    );
  }

  // Renvoie la première question non répondue du questionnaire
  getNextNonAnsweredQuestion(
    questionnaireParCategories: Map<string, Map<string, QuestionRepondus[]>>
  ): QuestionRepondus | null {
    for (const subCategories of questionnaireParCategories.values()) {
      for (const questions of subCategories.values()) {
        for (const question of questions) {
          if (!this.isAnswered(question)) {
            return question;
          }
        }
      }
    }
    return null;
  }

  navigateToNextNonAnsweredQuestion(
    questionnaireParCategories: Map<string, Map<string, QuestionRepondus[]>>
  ): void {
    const nextQuestion = this.getNextNonAnsweredQuestion(questionnaireParCategories);
    if (nextQuestion) {
      this.router.navigate(['/esg/question/', nextQuestion.id]);
    }
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
}
