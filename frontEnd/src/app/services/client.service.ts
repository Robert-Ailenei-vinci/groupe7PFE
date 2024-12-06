import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface ReponseRepondue {
  id: string; // Changement de _id à id
  idReponse: string;
  idQuestionReponddu: string;
  estEngage: boolean;
  intitule: string; // Intitulé de la réponse
  estSelectionne?: boolean; // Propriété optionnelle
}

// Interface pour les questions répondues
export interface QuestionRepondus {
  id: string; // Changement de _id à id
  idQuestion: string | null; // Permettre null
  idQuestionnaireRepondu: string;
  intitule: string; // Intitulé de la question
  enjeu?: string; // Propriété optionnelle
  sousEnjeu?: string; // Propriété optionnelle
  reponseRepondus: ReponseRepondue[];
  nombrePointObtenu: number;
  commentaire: string;
}

// Interface pour les détails du questionnaire
export interface QuestionnaireDetail {
  id: string; // Changement de _id à id
  idQuestionnaire: string;
  idClient: string;
  pourcentageQuestionRepondu: number;
  estTermine: boolean;
  estValide: boolean;
  nombreDeQuestionRepondu: number;
  dateDerniereValidation: string; // Format ISO string
  questionsRepondues: QuestionRepondus[];
  score: number;
}

export interface Client {
  id: string; // Changement de number à string
  name: string;
  email: string;
  // Ajoutez d'autres propriétés si nécessaire
}


@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private clientsUrl = 'http://localhost:8080/clients/All'; // Remplacez par l'URL de votre API
  private questionnairesUrl = 'http://localhost:8080/questionnaires'; // Remplacez par l'URL de votre API

  constructor(private http: HttpClient) { }

  getClients(): Observable<Client[]> {
    return this.http.get<Client[]>(this.clientsUrl);
  }

  getQuestionnairesByClientId(clientId: string): Observable<QuestionnaireDetail[]> {
    return this.http.get<QuestionnaireDetail[]>(`${this.questionnairesUrl}/${clientId}`);
  }
}
