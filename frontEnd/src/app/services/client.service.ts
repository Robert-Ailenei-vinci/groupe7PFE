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
  idQuestion: string ; 
  idQuestionnaireRepondu: string;
  intitule: string; // Intitulé de la question
  enjeuxPrincipal: string; // Propriété optionnelle
  enjeuxSecondaire: string; // Propriété optionnelle
  reponseRepondus: ReponseRepondue[];
  nombrePointObtenu: number;
  commentaire: string;
}

// Interface pour les détails du questionnaire
export interface QuestionnaireDetail {
  id: string; 
  idQuestionnaire: string;
  idClient: string;
  pourcentageQuestionRepondu: number;
  estTermine: boolean;
  estValide: boolean;
  nombreDeQuestionRepondu: number;
  dateDerniereValidation: string; 
  questionsRepondues: QuestionRepondus[];
  score: number;
}

export interface Client {
  id: string; 
  prenom: string;
  nom: string;
  email: string;
  fonction: string;
  nomEntreprise: string;
  numEntreprise: string;
  formeJuridique: string;
  adresseSiegeSocial: string;
  adresseSiteWeb: string;
  codeNaceActivitePrincipale: string;
  dernierChiffreDAffaire: number;
  estFranchise: boolean;
  nbTravailleur: number;
  estDansUnLitige: boolean;
  demandeDeLabel: boolean;
  partenaire: string;
  commentaire: string;
}


@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private clientsUrl = 'http://localhost:8080/clients'; 
  private questionnairesUrl = 'http://localhost:8080/questionnaires'; 
  private validateUrl = 'http://localhost:8080/questionnaires/validate'; 
  private questionnaireCLientUrl = 'http://localhost:8080/questionnaires/';

  constructor(private http: HttpClient) { }

  getClients(): Observable<Client[]> {
    return this.http.get<Client[]>(`${this.clientsUrl}/All`);
  }

  getQuestionnairesByClientId(clientId: string): Observable<QuestionnaireDetail[]> {
    return this.http.get<QuestionnaireDetail[]>(`${this.questionnairesUrl}/${clientId}`);
  }
  getOneClient(clientId: string): Observable<Client> {
    return this.http.get<Client>(`${this.clientsUrl}/getOne/${clientId}`);
  }

  validateQuestionnaire(questionnaireId: string): Observable<any> {
    return this.http.patch(`${this.validateUrl}/${questionnaireId}`, null);
  }

  getQuestionnaireClient(userId : string|null): Observable<QuestionnaireDetail> {
    return this.http.get<QuestionnaireDetail>(this.questionnaireCLientUrl + userId);
  }
}