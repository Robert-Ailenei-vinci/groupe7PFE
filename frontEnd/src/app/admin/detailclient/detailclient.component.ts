import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { FooterComponent } from '../../margins/footer/footer.component';
import { HeaderComponent } from '../../margins/header/header.component';
import { Client, ClientService } from '../../services/client.service';
import { switchMap, of, catchError } from 'rxjs';

@Component({
  selector: 'app-detailclient',
  imports: [HeaderComponent, FooterComponent, CommonModule, FormsModule,RouterModule],
  templateUrl: './detailclient.component.html',
  styleUrl: './detailclient.component.css'
})
export class DetailclientComponent {

  client: Client | null = null;

  constructor(private route: ActivatedRoute,
     private service: ClientService) { }

  ngOnInit(): void {

    this.route.paramMap.pipe(
      switchMap(params => {
        const clientIdParam = params.get('clientId');
        if (clientIdParam && clientIdParam.trim() !== '') {          
          return this.service.getOneClient(clientIdParam)

        } else {
          return of({client: null });
        }
      }),
      catchError(err => {
        console.error('Erreur lors de la récupération des données:', err);
        return of({client: null });
      })
    ).subscribe({ 
      next: (data) => {
        this.client = data as Client;
      },
    });
  }
}
