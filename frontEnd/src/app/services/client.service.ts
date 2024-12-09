import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface ReponseRepondue {
  id: string; // Changement de _id à id
  idReponse: string;
  idQuestionReponddu: string;
  estEngage: boolean;
  intitule: string; // Intitulé de la réponse
  selectionne: boolean; // Propriété optionnelle
}

// Interface pour les questions répondues
export interface QuestionRepondus {
  id: string; // Changement de _id à id
  idQuestion: string ; 
  idQuestionnaireRepondu: string;
  intitule: string; // Intitulé de la question
  enjeuxPrincipal: string; // Propriété optionnelle
  enjeuxSecondaire: string; // Propriété optionnelle
  template: string; // Propriété optionnelle
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
  codeNace: string,
  activitePrincipale: string;
  dernierChiffreDAffaire: number;
  estFranchise: boolean;
  nbTravailleur: number;
  estDansUnLitige: boolean;
  demandeDeLabel: boolean;
  partenaire: string;
  commentaire: string;
}

export interface ClientWithoutId {
  prenom: string;
  nom: string;
  email: string;
  fonction: string;
  nomEntreprise: string;
  numEntreprise: string;
  formeJuridique: string;
  adresseSiegeSocial: string;
  adresseSiteWeb: string;
  codeNace: string,
  activitePrincipale: string;
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
  private reponseUrl = 'http://localhost:8080/reponses/editReponse';
  private commentaireUrl = 'http://localhost:8080/questions/editComment';
  private questionnaireCLientUrl = 'http://localhost:8080/questionnaires/';
  private registerUrl = 'http://localhost:8080/clients/register';

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

  validateQuestionnaire(Id: string): Observable<any> {
    return this.http.patch(`${this.validateUrl}/${Id}`, null);
  }
  addClient(client: ClientWithoutId): Observable<ClientWithoutId> {
    return this.http.post<ClientWithoutId>(this.registerUrl, client);
  }
  changerReponseQuestion(idReponse: string, selectionne: boolean, engage: boolean): Observable<any> {
    console.log('Changer réponse question:', idReponse,selectionne);
    return this.http.patch(`${this.reponseUrl}`, {idReponse, selectionne,engage});
  }

  changerCommentaireQuestion(idQuestion: string, commentaire: string): Observable<any> {
    console.log('Changer commentaire question:', idQuestion,commentaire);
    return this.http.patch(`${this.commentaireUrl}`, {idQuestion, commentaire});
  }

  getQuestionnaireClient(userId : string|null): Observable<QuestionnaireDetail> {
    return this.http.get<QuestionnaireDetail>(this.questionnaireCLientUrl + userId);
  }

}
