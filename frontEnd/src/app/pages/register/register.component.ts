import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from '../../margins/footer/footer.component';
import { ClientService, ClientWithoutId } from '../../services/client.service';
import { Router } from '@angular/router';
import { catchError, switchMap } from 'rxjs/operators';
import { of } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  standalone:true,
  styleUrls: ['./register.component.css'],
  imports: [FormsModule, FooterComponent]
})
export class RegisterComponent {
  registrationData: ClientWithoutId = {
    prenom: '',
    nom: '',
    email: '',
    fonction: '',
    nomEntreprise: '',
    numEntreprise: '',
    formeJuridique: '',
    adresseSiegeSocial: '',
    adresseSiteWeb: '',
    codeNace: '',
    activitePrincipale: '',
    dernierChiffreDAffaire: 0,
    estFranchise: false,
    nbTravailleur: 0,
    estDansUnLitige: false,
    demandeDeLabel: false,
    partenaire: '',
    commentaire: '',
    estProprietaire: false,
    vendProduit: false,
    vendService: false
  };

  password: string= '';

  constructor(private clientService: ClientService, private router: Router) {}

  onSubmit() {
    const dataToSend = {
      ...this.registrationData,
      password: this.password
    };

    this.clientService.addClient(dataToSend).pipe(
      switchMap((response: any) => {
        console.log('Client added successfully', response);
        const loginData = {
          email: this.registrationData.email,
          password: this.password
        };
        console.log(loginData);
        return this.clientService.login(loginData);
      }),
      catchError((error: any) => {
        console.error('Error during registration or login', error);
        return of(null); // Return an observable with a null value to handle the error
      })
    ).subscribe(
      (response: any) => {
        if (response) {
          console.log('Logged in successfully', response);
          localStorage.setItem('authToken', JSON.stringify(response));

          // Redirect to the desired page after login
          this.router.navigate(['/homepage']);
        }
      }
    );
  }

}