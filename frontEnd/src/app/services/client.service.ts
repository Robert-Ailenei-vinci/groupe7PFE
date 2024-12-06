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

  private clientsUrl = 'http://localhost:8080/clients/All'; // Remplacez par l'URL de votre API
  private questionnairesUrl = 'http://localhost:8080/questionnaires'; // Remplacez par l'URL de votre API
  
   constructor(private http: HttpClient) { }


  getClients(): Observable<Client[]> {
    //return of(this.clients);
    return this.http.get<Client[]>(this.clientsUrl);
  }

  getQuestionnairesByClientId(clientId: string): Observable<Questionnaire[]> {
    //const clientQuestionnaires = this.questionnaires.filter(q => q.clientId === clientId);
    //return of(clientQuestionnaires);
    return this.http.get<Questionnaire[]>(`${this.questionnairesUrl}/${clientId}`);
  }
}
