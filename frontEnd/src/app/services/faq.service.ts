import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface FaqItem {
  id: string;
  intitule: string;
  reponse: string;
}

export interface FaqItemForm {
  intitule: string;
  reponse: string;
}

@Injectable({
  providedIn: 'root',
})
export class FaqService {
  
  private apiUrl = 'http://localhost:8080/questionsPlusPose'; 

  constructor(private http: HttpClient) {}

  // Récupérer toutes les FAQ
  getFaqs(): Observable<FaqItem[]> {
    return this.http.get<FaqItem[]>(`${this.apiUrl}/getAll`);
  }

  // Ajouter une nouvelle FAQ
  addFaqs(faqItem: FaqItemForm): Observable<FaqItemForm> {
    return this.http.post<FaqItemForm>(`${this.apiUrl}/add`, faqItem);
  }
}
