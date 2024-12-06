import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// Interfaces avec IDs de type string
export interface ReponseRepondue {
  _id: string;
  idReponse: string;
  idQuestionReponddu: string;
  estEngage: boolean;
  intitule: string; // Intitulé de la réponse
}

export interface QuestionRepondus {
  _id: string;
  idQuestion: string;
  idQuestionnaireRepondu: string;
  intitule: string; // Intitulé de la question
  enjeu: string; // Enjeu de la question
  sousEnjeu: string; // Sous enjeu de la question
  reponseRepondus: ReponseRepondue[];
  nombrePointObtenu: number;
  commentaire: string;
}

export interface QuestionnaireDetail {
  _id: string;
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
