import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

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
  // Ajoutez d'autres propriétés si nécessaire
}

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private clientsUrl = 'http://localhost:8080/clientAll'; // Remplacez par l'URL de votre API
  private questionnairesUrl = 'http://localhost:8080/questionnaires'; // Remplacez par l'URL de votre API

  constructor(private http: HttpClient) { }

  getClients(): Observable<Client[]> {
    return this.http.get<Client[]>(this.clientsUrl);
  }

  getQuestionnairesByClientId(clientId: number): Observable<Questionnaire[]> {
    return this.http.get<Questionnaire[]>(`${this.questionnairesUrl}/${clientId}`);
  }
}
