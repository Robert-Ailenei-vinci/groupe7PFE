import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ClientService, QuestionnaireDetail } from '../services/client.service';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { CommonModule } from '@angular/common';
import { switchMap } from 'rxjs/operators';
import { of } from 'rxjs';
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
          return this.clientService.getQuestionnairesByClientId(clientIdParam);
        } else {
          this.error = 'ID du client invalide ou manquant.';
          this.isLoading = false;
          return of([]);
        }
      })
    ).subscribe({
      next: (data) => {
        this.questionnaires = data;
        this.isLoading = false;
        console.log('Questionnaires récupérés:', data);
      },
      error: (err) => {
        this.error = 'Erreur lors de la récupération des questionnaires.';
        this.isLoading = false;
        console.error('Erreur lors de la récupération des questionnaires:', err);
      }
    });
  }
}
