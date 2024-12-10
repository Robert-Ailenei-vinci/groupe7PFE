import { Component } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { ClientService, Score } from '../../services/client.service';
import { ActivatedRoute } from '@angular/router';
import { catchError, forkJoin, of, switchMap } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-detailscore',
  imports: [HeaderComponent, FooterComponent,CommonModule],
  templateUrl: './detailscore.component.html',
  styleUrl: './detailscore.component.css'
})
export class DetailscoreComponent {
  idQuestionnaire: string | null = null;
  error: string = '';
  tableauScore: Score | undefined;


  constructor(
    private clientService: ClientService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.route.paramMap.pipe(
      switchMap(params => {
        const idQuestionnaireParam = params.get('idQuestionnaire');
        console.log('Retrieved idQuestionnaireParam:', idQuestionnaireParam);
        if (idQuestionnaireParam && idQuestionnaireParam.trim() !== '') {
          this.idQuestionnaire = idQuestionnaireParam;
          console.log('ID du questionnaire:', this.idQuestionnaire);
          
          return this.clientService.getPoucentageScore(this.idQuestionnaire);

        } else {
          this.error = 'ID du client invalide ou manquant.';
          return of({ questionnaires: [], client: null });
        }
      }),
      catchError(err => {
        this.error = 'Erreur lors de la récupération des données.';
        console.error('Erreur lors de la récupération des données:', err);
        return of({ questionnaires: [], client: null });
      })
    ).subscribe({ 
      next: (data) => {
        console.log('Score récupéré:', data);
      },
    });
  }
}
