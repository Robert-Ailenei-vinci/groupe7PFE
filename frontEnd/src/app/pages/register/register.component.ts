import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { FooterComponent } from '../../margins/footer/footer.component';
import { ClientService, ClientWithoutId } from '../../services/client.service';
import { Router } from '@angular/router';
import { catchError, switchMap } from 'rxjs/operators';
import { of } from 'rxjs';
import { CommonModule } from '@angular/common';

interface Field {
  name: string;
  placeholder: string;
  type: string;
  required?: boolean;
  minlength?: number;
  maxlength?: number;
  pattern?: string;
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  standalone: true,
  styleUrls: ['./register.component.css'],
  imports: [FooterComponent, ReactiveFormsModule, CommonModule]
})
export class RegisterComponent {
  signupForm: FormGroup;
  validatorCheck: Field[] = [
    { name: 'prenom', placeholder: '', type: 'text', required: true, minlength: 2 },
    { name: 'nom', placeholder: '', type: 'text', required: true, minlength: 2 },
    { name: 'email', placeholder: '', type: 'email',required: true, pattern: '^\\S+@\\S+\\.\\S+$' },
    { name: 'fonction', placeholder: '', type: 'text', required: true },
    { name: 'nomEntreprise', placeholder: '', type: 'text', required: true, minlength: 2 },
    { name: 'numEntreprise', placeholder: '', type: 'text', required: true, pattern: '^(BE)?\\d{10}$' },
    { name: 'formeJuridique', placeholder: '', type: 'text', required: true, minlength: 2 },
    { name: 'adresseSiegeSocial', placeholder: '', type: 'text', required: true, minlength: 3 },
    { name: 'adresseSiteWeb', placeholder: '', type: 'text', required: true, pattern: '^(https?:\\/\\/)?([\\w-]+\\.)+[\\w-]+(\\/\\w*)*\\/?$' },
    { name: 'codeNace', placeholder: '', type: 'text', required: true, minlength: 4, maxlength: 6 },
    { name: 'activitePrincipale', placeholder: '', type: 'text', required: true },
    { name: 'dernierChiffreDAffaire', placeholder: '', type: 'number', required: true },
    { name: 'estFranchise', placeholder: '', type: 'text', required: true, pattern: '^(oui|non)$' },
    { name: 'nbTravailleur', placeholder: '', type: 'number', required: true, pattern: '^\\d+$' },
    { name: 'estDansUnLitige', placeholder: '', type: 'text', required: true, pattern: '^(oui|non)$' },
    { name: 'honnete', placeholder: '', type: 'text', required: true, pattern: '^(oui|non)$' },
    { name: 'demandeLabel', placeholder: '', type: 'text', required: true, pattern: '^(oui|non)$' },
    { name: 'partenaire', placeholder: '', type: 'text', required: true, minlength: 2 },
    { name: 'commentaire', placeholder: '', type: 'text', required: false },
    { name: 'mdp', placeholder: '', type: 'password', required: true, minlength: 6 },
    { name: 'estProprietaire', placeholder: '', type: 'text', required: true },
    { name: 'vendProduit', placeholder: '', type: 'text', required: true },
    { name: 'vendService', placeholder: '', type: 'text', required: true },
  ];

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

  password: string = '';

  constructor(private fb: FormBuilder, private clientService: ClientService, private router: Router) {
    this.signupForm = this.fb.group(
      this.validatorCheck.reduce((acc: Record<string, any>, field: Field) => {
        acc[field.name] = ['', [
          field.required ? Validators.required : null,
          field.minlength ? Validators.minLength(field.minlength) : null,
          field.maxlength ? Validators.maxLength(field.maxlength) : null,
          field.pattern ? Validators.pattern(field.pattern) : null,
        ].filter(Boolean)];
        return acc;
      }, {})
    );
  }

  getErrorMessage(fieldName: string): string {
    const control = this.signupForm.get(fieldName);
    if (control?.hasError('required')) {
      return 'Ce champ est requis.';
    }
    if (control?.hasError('minlength')) {
      return `Minimum ${control.errors?.['minlength'].requiredLength} caractères requis.`;
    }
    if (control?.hasError('maxlength')) {
      return `Maximum ${control.errors?.['maxlength'].requiredLength} caractères autorisés.`;
    }
    if (control?.hasError('pattern')) {
      return `Format invalide.`;
    }
    return '';
  }

  onSubmit(): void {
    if (this.signupForm.valid) {
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
          this.router.navigate(['/homepage']);
        }
      }
    );
  }
}