import { Component } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { CommonModule } from '@angular/common';

/*
{
  "intitule":"Suivez-vous la consommation d'énergie XXX ?",
  "reponses":[
      {
        "intitule":"oui",
        "point":{"$numberDouble":"3.0"}
      },
      {
        "intitule":"non","point":{"$numberDouble":"0.0"}
      }
    ],
  "nbrChoixMax":{"$numberInt":"2"},
  "estQuestionLibre":false,
  "nombrePointMax":{"$numberInt":"2"},
}
*/


interface Reponse {
  intitule: string;
  point: { $numberDouble: string };
}

interface Question {
  intitule: string;
  reponses: Reponse[];
  nbrChoixMax: { $numberInt: string };
  estQuestionLibre: boolean;
  nombrePointMax: { $numberInt: string };
}

@Component({
  selector: 'app-question',
  imports: [HeaderComponent, FooterComponent, CommonModule],
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})
export class QuestionComponent {
  progress: number = 10;

  question: Question = {
    intitule: "Suivez-vous la consommation d'énergie XXX ?",
    reponses: [
      {
        intitule: "oui",
        point: { $numberDouble: "3.0" }
      },
      {
        intitule: "non",
        point: { $numberDouble: "0.0" }
      }
    ],
    nbrChoixMax: { $numberInt: "2" },
    estQuestionLibre: false,
    nombrePointMax: { $numberInt: "2" }
  };
}