import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FooterComponent } from '../../margins/footer/footer.component';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  standalone:true,
  styleUrls: ['./register.component.css'],
  imports: [FormsModule, FooterComponent]
})
export class RegisterComponent {
  registrationData = {
    prenom: '',
    nom: '',
    email: '',
    fonction: '',
    nomEntreprise: '',
    numEntreprise: '',
    formeJuridique: '',
    adreadresseSiegeSocial: '',
    adresseSiteWeb: '',
    codeNace: '',
    descriptionActivite: '',
    nombreTravailleurs: 0,
    chiffreAffaires: '',
    certifications: '',
    litiges: '',
    engagement: '',
    demandeSubside: '',
    autre: '',
    remarques: '',
    connaissanceShiftingPact: ''
  };

  onSubmit() {
    // Envoyer registrationData au backend
    console.log(this.registrationData);
  }
}