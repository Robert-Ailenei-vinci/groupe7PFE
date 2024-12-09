import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Client, ClientService, QuestionnaireDetail } from '../../services/client.service';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule } from '@angular/common';
import { catchError, concatMap, switchMap, timeout } from 'rxjs/operators';
import { forkJoin, from, Observable, of } from 'rxjs';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-admin-questionnaire-detail',
  standalone: true,
  imports: [HeaderComponent, FooterComponent, CommonModule, FormsModule],
  templateUrl: './admin-questionnaire-detail.component.html',
  styleUrls: ['./admin-questionnaire-detail.component.css']
})
export class AdminQuestionnaireDetailComponent implements OnInit {
  clientId: string | null = null;
  questionnaires: QuestionnaireDetail[] = [];
  client: Client | null = null;
  error: string = '';
  isLoading: boolean = true;

  constructor(
    private clientService: ClientService,
    private route: ActivatedRoute
  ) { }


  ngOnInit(): void {
    this.route.paramMap.pipe(
      switchMap(params => {
        const clientIdParam = params.get('clientId');
        console.log('Retrieved clientIdParam:', clientIdParam);
        if (clientIdParam && clientIdParam.trim() !== '') {
          this.clientId = clientIdParam;
          return forkJoin({
            questionnaires: this.clientService.getQuestionnairesByClientId(clientIdParam),
            client: this.clientService.getOneClient(clientIdParam)
          });
        } else {
          this.error = 'ID du client invalide ou manquant.';
          this.isLoading = false;
          return of({ questionnaires: [], client: null });
        }
      }),
      catchError(err => {
        this.error = 'Erreur lors de la récupération des données.';
        this.isLoading = false;
        console.error('Erreur lors de la récupération des données:', err);
        return of({ questionnaires: [], client: null });
      })
    ).subscribe({
      next: (data) => {
        this.questionnaires = data.questionnaires;
        this.client = data.client;
        this.isLoading = false;
        console.log('Questionnaires récupérés:', data.questionnaires);
        console.log('Client récupéré:', data.client);
      },
      error: (err) => {
        this.error = 'Erreur lors de la récupération des questionnaires.';
        this.isLoading = false;
        console.error('Erreur lors de la récupération des questionnaires:', err);
      }
    });
  }

  modifierReponseQuestion(id: string, questionId: string): void {
    console.log('Modifier réponse question:', id, questionId);

    const question = this.questionnaires[0].questionsRepondues.find(
      (q) => q.id.toString() === questionId
    );
    console.log(question?.intitule);
    
  
    if (!question) {
      console.error('Question non trouvée pour l\'id:', questionId);
      return;
    }

    // On crée un flux à partir du tableau de réponses
    from(question.reponseRepondus).pipe(
      // concatMap va s'assurer que chaque appel se fait après la complétion du précédent
      concatMap(reponse => this.clientService.changerReponseQuestion(
        reponse.id,
        reponse.selectionne,
        reponse.estEngage
      ))
    ).subscribe({
      next: (data) => {
        console.log('Réponse modifiée avec succès pour', data.id, data.intitule, 'en', data.selectionne);
      },
      error: (err) => {
        console.error('Erreur lors de la modification de la réponse :', err);
      },
      complete: () => {
        console.log('Toutes les réponses ont été traitées.');
      }
    });
  }

  modifierReponse(reponseId: string,selectionne: boolean, engage:boolean): void {
    this.clientService.changerReponseQuestion(reponseId,selectionne,engage).subscribe({
      next: (data) => {
        console.log('Réponse modifiée avec succès pour .',data.id, data.intitule, 'en ',data.selectionne);    
      },
      error: (err) => {
        console.error('Erreur lors de la modification de la réponse :', err);
      }
    });
  }

  validerQuestionnaire(id: string): void {
    console.log('Valider questionnaire:', id);
    this.clientService.validateQuestionnaire(id).subscribe({
      next: (data) => {
        console.log('Questionnaire validé:', data);
        
      },
      error: (err) => {
        console.error('Erreur lors de la validation du questionnaire:', err);
      }
    });
  }

  afficherDetailScore(id: string): void {
    console.log('Afficher score:', this.questionnaires.find(q => q.id === id)?.score);
  }
}

