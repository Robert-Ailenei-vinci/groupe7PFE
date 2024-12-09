import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from '../../margins/footer/footer.component';
import { ClientService, ClientWithoutId } from '../../services/client.service';

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
  };

  password: string= '';

  constructor(private clientService: ClientService) {}

  onSubmit() {
    const dataToSend = {
      ...this.registrationData,
      password: this.password
    };
    this.clientService.addClient(dataToSend).subscribe((response: any) => {
      console.log('Client added successfully', response);
    });
  }
}