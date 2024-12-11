import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { ClientService, QuestionnaireDetail, QuestionRepondus, Score } from '../../services/client.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-questionnaire-manager',
  imports: [],
  templateUrl: './questionnaire-manager.component.html',
  styleUrl: './questionnaire-manager.component.css'
})
export class QuestionnaireManagerComponent implements OnInit {
  public static questionnaireDetail: QuestionnaireDetail[] = [];
  public static questionnaireParCategories : Map<string, Map<string, QuestionRepondus[]>> = new Map<string, Map<string, QuestionRepondus[]>>();
  private static clientServiceStatic: ClientService;

  constructor(private clientService: ClientService) { 
    QuestionnaireManagerComponent.clientServiceStatic = clientService;
  }

  ngOnInit(): void {
    QuestionnaireManagerComponent.questionnaireDetail = [];
    QuestionnaireManagerComponent.questionnaireParCategories = new Map<string, Map<string, QuestionRepondus[]>>();

    const user = localStorage.getItem('authToken');
    const id = user ? JSON.parse(user).id : '';
    this.clientService.getQuestionnairesByClientId(id).subscribe({
      next: (data) => {
        QuestionnaireManagerComponent.questionnaireDetail.push(data[0]);
        for(let i = 0; i < data[0].questionsRepondues.length; i++) {
          const question = data[0].questionsRepondues[i];
          const enjeuxPrincipal = this.capitalizeWords(question.enjeuxPrincipal.toLowerCase());
          const enjeuxSecondaire = this.capitalizeWords(question.enjeuxSecondaire.toLowerCase());
          if(QuestionnaireManagerComponent.questionnaireParCategories.has(enjeuxPrincipal)) {
            const categoriePrincipale = QuestionnaireManagerComponent.questionnaireParCategories.get(enjeuxPrincipal);
            if(categoriePrincipale === undefined) continue;
            if(categoriePrincipale.has(enjeuxSecondaire)) {
              categoriePrincipale.get(enjeuxSecondaire)?.push(question);
            } else {
              categoriePrincipale.set(enjeuxSecondaire, [question]);
            }
          } else {
            QuestionnaireManagerComponent.questionnaireParCategories.set(enjeuxPrincipal, new Map<string, QuestionRepondus[]>());
            QuestionnaireManagerComponent.questionnaireParCategories.get(enjeuxPrincipal)?.set(enjeuxSecondaire, [question]);
        }
      }
      },
      error: (err) => {
        console.error(err);
      }
    });
  }

  public static getQuestionnaireDetail(): QuestionnaireDetail[] {
    return QuestionnaireManagerComponent.questionnaireDetail;
  }

  public static getQuestionnaireParCategories(): Map<string, Map<string, QuestionRepondus[]>> {
    return QuestionnaireManagerComponent.questionnaireParCategories;
  }

  capitalizeWords(str: string): string {
    return str.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1)).join(' ');
  }

  public static finishQuestionnaire() {
  this.clientServiceStatic.finishQuestionnaire(QuestionnaireManagerComponent.questionnaireDetail[0].id).subscribe({
        next: (response) => {
          console.log('Questionnaire finished successfully', response);
        },
        error: (err) => {
          console.error('Error finishing questionnaire', err);
        }
      });
    }

  public static getPourcentageScore(): Observable<Score> {
    return this.clientServiceStatic.getPoucentageScore(QuestionnaireManagerComponent.questionnaireDetail[0].id);
  }
}
