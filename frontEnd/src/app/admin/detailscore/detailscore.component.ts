import { Component } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { ClientService, Score } from '../../services/client.service';
import { ActivatedRoute } from '@angular/router';
import { catchError, forkJoin, map, of, Subject, switchMap, takeUntil } from 'rxjs';
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

  private destroy$ = new Subject<void>();

  ngOnInit(): void {
    this.route.paramMap.pipe(
      map(params => params.get('idQuestionnaire')?.trim() || ''),
      switchMap(idQuestionnaire => {
        if (idQuestionnaire) {
          this.idQuestionnaire = idQuestionnaire;
          return this.clientService.getPoucentageScore(idQuestionnaire);
        } else {
          this.error = 'ID du client invalide ou manquant.';
          return of({ questionnaires: [], client: null });
        }
      }),
      catchError(err => {
        this.error = 'Erreur lors de la récupération des données.';
        console.error(err);
        return of({ questionnaires: [], client: null });
      }),
      takeUntil(this.destroy$)
    ).subscribe(data => {
      console.log('Score récupéré:', data);
      this.tableauScore = data as Score;
    });
  }
  
  ngOnDestroy(): void {
    this.destroy$.next();
    this.destroy$.complete();
  }
  
}
