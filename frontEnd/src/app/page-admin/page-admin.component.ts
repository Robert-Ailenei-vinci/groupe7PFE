import { Component, OnInit } from '@angular/core';
import { ClientService, Client } from '../services/client.service';
import { Router } from '@angular/router';
import { HeaderComponent } from '../header/header.component';
import { FooterComponent } from '../footer/footer.component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-page-admin',
  standalone: true,
  imports: [HeaderComponent, FooterComponent, CommonModule, FormsModule],
  templateUrl: './page-admin.component.html',
  styleUrls: ['./page-admin.component.css']
})
export class PageAdminComponent implements OnInit {
  clients: Client[] = [];
  isLoading: boolean = true;
  error: string = '';
  searchTerm: string = '';
  currentPage: number = 1;
  itemsPerPage: number = 10;

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

  viewQuestionnaires(clientId: string): void {
    // Vérifiez que clientId est une chaîne non vide
    if (clientId && typeof clientId === 'string') {
      this.router.navigate(['/admin/questionnaires', clientId]);
    } else {
      console.error(`Client ID invalide : ${clientId}`);
    }
  }

  get paginatedClients(): Client[] {
    const start = (this.currentPage - 1) * this.itemsPerPage;
    return this.filteredClients.slice(start, start + this.itemsPerPage);
  }

  get filteredClients(): Client[] {
    const term = this.searchTerm.toLowerCase();
    return this.clients.filter(client =>
      (client.nom?.toLowerCase() || '').includes(term) ||
      (client.prenom?.toLowerCase() || '').includes(term) ||
      (client.nomEntreprise?.toLowerCase() || '').includes(term) ||
      (client.numEntreprise?.toLowerCase() || '').includes(term) ||
      (client.email?.toLowerCase() || '').includes(term)
    );
  }

  totalPages(): number {
    return Math.ceil(this.filteredClients.length / this.itemsPerPage);
  }

  goToPage(page: number): void {
    if (page >= 1 && page <= this.totalPages()) {
      this.currentPage = page;
    }
  }
}
