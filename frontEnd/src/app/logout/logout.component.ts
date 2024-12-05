import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-logout',
  imports: [],
  templateUrl: './logout.component.html',
  styleUrl: './logout.component.css'
})
export class LogoutComponent {
  constructor(private router: Router) {}

  logout(): void {
    // Nettoyer le localStorage
    localStorage.clear();

    // Rediriger vers la page de connexion (ou d'accueil)
    this.router.navigate(['/login']);
  }
}
