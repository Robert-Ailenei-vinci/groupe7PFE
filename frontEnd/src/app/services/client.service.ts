import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// Interfaces avec IDs de type string
export interface ReponseRepondue {
  _id: string;
  idReponse: string;
  idQuestionReponddu: string;
  estEngage: boolean;
  nombrePointObtenu?: number;
  commentaire?: string;
  score?: number;
}

export interface QuestionRepondus {
  _id: string;
  idQuestion: string;
  idQuestionnaireRepondu: string;
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

export interface Questionnaire {
  id: string; // Changement de number à string
  clientId: string; // Changement de number à string
  title: string;
  questions: string[];
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
