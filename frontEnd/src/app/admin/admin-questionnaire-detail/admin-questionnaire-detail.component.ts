import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { Client, ClientService, QuestionnaireDetail, QuestionRepondus } from '../../services/client.service';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule } from '@angular/common';
import { catchError, concatMap, last, switchMap, timeout } from 'rxjs/operators';
import { forkJoin, from, Observable, of } from 'rxjs';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-admin-questionnaire-detail',
  standalone: true,
  imports: [HeaderComponent, FooterComponent, CommonModule, FormsModule,RouterModule],
  templateUrl: './admin-questionnaire-detail.component.html',
  styleUrls: ['./admin-questionnaire-detail.component.css']
})
export class AdminQuestionnaireDetailComponent implements OnInit {
  clientId: string | null = null;
  questionnaires: QuestionnaireDetail[] = [];
  client: Client | null = null;
  error: string = '';
  isLoading: boolean = true;

    // Variables pour les filtres
    searchTerm: string = '';
    selectedEnjeuxPrincipal: string = '';
    selectedEnjeuxSecondaire: string = '';

    // Listes pour les dropdowns
    enjeuxPrincipaux: string[] = [];
    enjeuxSecondaires: string[] = [];

  constructor(
    private clientService: ClientService,
    private route: ActivatedRoute,
    private router: Router
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

        // On remplace les XXX par le nom de l'entreprise
          this.questionnaires[0].questionsRepondues = this.questionnaires[0].questionsRepondues.map((questionRepondue: QuestionRepondus) => {
          
          const nouvelIntitule = questionRepondue.intitule.replace(/XXX/g, this.client?.nomEntreprise ?? '');
          
          return {
            ...questionRepondue,
            intitule: nouvelIntitule
            };
          });
        
          // Préparer la liste des enjeux
          this.prepareEnjeuxLists(this.questionnaires[0].questionsRepondues);

      },
      error: (err) => {
        this.error = 'Erreur lors de la récupération des questionnaires.';
        this.isLoading = false;
        console.error('Erreur lors de la récupération des questionnaires:', err);
      }
    });
    
  }

  prepareEnjeuxLists(questions: QuestionRepondus[]) {
    const uniqueEnjeuxPrincipaux = new Set<string>();
    const uniqueEnjeuxSecondaires = new Set<string>();
    questions.forEach(q => {
      if(q.enjeuxPrincipal && q.enjeuxPrincipal.trim() !== '') {
        uniqueEnjeuxPrincipaux.add(q.enjeuxPrincipal);
      }
      if(q.enjeuxSecondaire && q.enjeuxSecondaire.trim() !== '') {
        uniqueEnjeuxSecondaires.add(q.enjeuxSecondaire);
      }
    });
    this.enjeuxPrincipaux = Array.from(uniqueEnjeuxPrincipaux);
    this.enjeuxSecondaires = Array.from(uniqueEnjeuxSecondaires);
  }

  getFilteredQuestions(): QuestionRepondus[] {
    if (this.questionnaires.length === 0) {
      return [];
    }
    const questions = this.questionnaires[0].questionsRepondues || [];

    return questions.filter(question => {
      const matchesSearch = this.searchTerm.trim() === '' 
        || question.intitule.toLowerCase().includes(this.searchTerm.toLowerCase());

      const matchesEnjeuxPrincipal = this.selectedEnjeuxPrincipal === ''
        || (question.enjeuxPrincipal && question.enjeuxPrincipal === this.selectedEnjeuxPrincipal);

      const matchesEnjeuxSecondaire = this.selectedEnjeuxSecondaire === ''
        || (question.enjeuxSecondaire && question.enjeuxSecondaire === this.selectedEnjeuxSecondaire);

      return matchesSearch && matchesEnjeuxPrincipal && matchesEnjeuxSecondaire;
    });
  }

  modifierReponseQuestion(id: string, questionId: string,nouveauCommentaire: string): void {
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
      )),
      last(),
      concatMap(() => this.clientService.changerCommentaireQuestion(question.id.toString(), nouveauCommentaire )),
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
    this.router.navigate(['/detailscore', id]);
  }
}

