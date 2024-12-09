import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { ClientService, QuestionnaireDetail, QuestionRepondus } from '../../services/client.service';

@Component({
  selector: 'app-questionnaire-manager',
  imports: [],
  templateUrl: './questionnaire-manager.component.html',
  styleUrl: './questionnaire-manager.component.css'
})
export class QuestionnaireManagerComponent implements OnInit {
  public static questionnaireDetail: QuestionnaireDetail[] = [];
  public static questionnaireParCategories : Map<string, Map<string, QuestionRepondus[]>> = new Map<string, Map<string, QuestionRepondus[]>>();
  constructor(private clientService: ClientService) { 
  }

  ngOnInit(): void {
    const user = localStorage.getItem('authToken');
    const id = user ? JSON.parse(user).id : '';
    this.clientService.getQuestionnairesByClientId(id).subscribe({
      next: (data) => {
        QuestionnaireManagerComponent.questionnaireDetail.push(data[0]);
        for(let i = 0; i < data[0].questionsRepondues.length; i++) {
          const question = data[0].questionsRepondues[i];
          if(QuestionnaireManagerComponent.questionnaireParCategories.has(question.enjeuxPrincipal)) {
            const categoriePrincipale = QuestionnaireManagerComponent.questionnaireParCategories.get(question.enjeuxPrincipal);
            if(categoriePrincipale === undefined) continue;
            if(categoriePrincipale.has(question.enjeuxSecondaire)) {
              categoriePrincipale.get(question.enjeuxSecondaire)?.push(question);
            } else {
              categoriePrincipale.set(question.enjeuxSecondaire, [question]);
            }
          } else {
            QuestionnaireManagerComponent.questionnaireParCategories.set(question.enjeuxPrincipal, new Map<string, QuestionRepondus[]>());
            QuestionnaireManagerComponent.questionnaireParCategories.get(question.enjeuxPrincipal)?.set(question.enjeuxSecondaire, [question]);
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
}
