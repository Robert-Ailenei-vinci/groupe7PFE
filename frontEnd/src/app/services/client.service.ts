import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

export interface Client {
  id: number;
  name: string;
  email: string;
  // Ajoutez d'autres propriétés si nécessaire
}

export interface Questionnaire {
  id: number;
  clientId: number;
  title: string;
  questions: string[];
  // Ajoutez d'autres propriétés si nécessaire
}

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private clients: Client[] = [
    { id: 1, name: 'John Doe', email: 'john.doe@example.com' },
    { id: 2, name: 'Jane Smith', email: 'jane.smith@example.com' },
    // Ajoutez d'autres clients si nécessaire
  ];

  private questionnaires: Questionnaire[] = [
    {
      id: 101,
      clientId: 1,
      title: 'Questionnaire sur la Satisfaction',
      questions: [
        'Êtes-vous satisfait de notre service ?',
        'Recommanderiez-vous notre entreprise à un ami ?',
        'Quels aspects de notre service aimeriez-vous voir améliorés ?'
      ]
    },
    {
      id: 102,
      clientId: 1,
      title: 'Questionnaire sur les Produits',
      questions: [
        'Quel produit utilisez-vous le plus ?',
        'Êtes-vous satisfait de la qualité de nos produits ?',
        'Avez-vous des suggestions pour de nouveaux produits ?'
      ]
    },
    {
      id: 201,
      clientId: 2,
      title: 'Questionnaire de Feedback',
      questions: [
        'Comment évaluez-vous notre support client ?',
        'Quelles fonctionnalités aimeriez-vous voir ajoutées ?',
        'Avez-vous des commentaires supplémentaires ?'
      ]
    },
    // Ajoutez d'autres questionnaires si nécessaire
  ];

  /*
  private clientsUrl = 'http://localhost:8080/clientAll'; // Remplacez par l'URL de votre API
  private questionnairesUrl = 'http://localhost:8080/questionnaires'; // Remplacez par l'URL de votre API
  */
   constructor(/*private http: HttpClient*/) { }


  getClients(): Observable<Client[]> {
    return of(this.clients);
    //return this.http.get<Client[]>(this.clientsUrl);
  }

  getQuestionnairesByClientId(clientId: number): Observable<Questionnaire[]> {
    const clientQuestionnaires = this.questionnaires.filter(q => q.clientId === clientId);
    return of(clientQuestionnaires);
    //return this.http.get<Questionnaire[]>(`${this.questionnairesUrl}/${clientId}`);
  }
}
