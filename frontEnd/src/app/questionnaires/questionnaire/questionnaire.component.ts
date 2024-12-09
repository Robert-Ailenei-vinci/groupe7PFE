import { Component } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { QuestionnaireManagerComponent } from '../questionnaire-manager/questionnaire-manager.component';
import { CommonModule } from '@angular/common';
import { QuestionRepondus } from '../../services/client.service';

@Component({
  selector: 'app-questionnaire',
  imports: [HeaderComponent, FooterComponent, QuestionnaireManagerComponent, CommonModule],
  templateUrl: './questionnaire.component.html',
  styleUrl: './questionnaire.component.css'
})
export class QuestionnaireComponent {
  questionnaireParCategories = QuestionnaireManagerComponent.getQuestionnaireParCategories();
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
        if(this.isAnswered(question)) {
          answeredQuestions++;
        }
      });
      return answeredQuestions;
    }

    // Renvoie true si une question a été répondue
    isAnswered(question: QuestionRepondus): boolean {
      for(let i = 0; i < question.reponseRepondus.length; i++) {
        if(question.reponseRepondus[i].estEngage) return true;
        if(question.reponseRepondus[i].selectionne) return true;
      }
      return false;
    }
}
