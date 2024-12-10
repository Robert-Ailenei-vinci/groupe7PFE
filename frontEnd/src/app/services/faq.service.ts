import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface FaqItem {
  id: string;
  intitule: string;
}

@Injectable({
  providedIn: 'root',
})
export class FaqService {
  private apiUrl = 'http://localhost:8080/questionsPlusPose/getAll'; 

  constructor(private http: HttpClient) {}

  // Méthode pour récupérer toutes les FAQ
  getFaqs(): Observable<FaqItem[]> {
        return this.http.get<FaqItem[]>(this.apiUrl);
  }
}
