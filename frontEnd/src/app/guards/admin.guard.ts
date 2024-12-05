import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' // Assure que le guard est disponible à l'échelle de l'application
})
export class AdminGuard implements CanActivate {
  
  constructor(private router: Router) {}
  
  canActivate(): boolean | Observable<boolean> | Promise<boolean> {
    const adminToken = localStorage.getItem('authAdminToken');
    if (adminToken) {
      console.log("Utilisateur Administrateur");
      return true;
    } else {
      console.log("Accès refusé : Pas un administrateur");
      this.router.navigate(['/homepage']); // Redirection vers la page d'accueil ou une page de connexion
      return false;
    }
  }
}
