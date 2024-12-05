import { Component, OnInit } from '@angular/core';
import { ClientService, Client } from '../services/client.service';
import { Router } from '@angular/router';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-page-admin',
  standalone: true,
  imports: [HeaderComponent, FooterComponent, CommonModule],
  templateUrl: './page-admin.component.html',
  styleUrls: ['./page-admin.component.css']
})
export class PageAdminComponent implements OnInit {
  clients: Client[] = [];
  isLoading: boolean = true;
  error: string = '';

  constructor(
    private clientService: ClientService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.clientService.getClients().subscribe({
      next: (data) => {
        this.clients = data;
        this.isLoading = false;
      },
      error: (err) => {
        this.error = 'Erreur lors de la récupération des clients.';
        this.isLoading = false;
        console.error(err);
      }
    });
  }

  viewQuestionnaires(clientId: number): void {
    this.router.navigate(['/admin/questionnaires', clientId]);
  }
}
