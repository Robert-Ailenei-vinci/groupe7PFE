import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from "../header/header.component";


@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule,HeaderComponent ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginData = { email: '', password: '' };

  constructor(private http: HttpClient) {}

  onSubmit() {
    console.log(this.loginData.email);
    
    const url = 'http://localhost:8080/clients/login'; // URL du backend
    this.http.post(url, this.loginData).subscribe({
      next: (response) => {
        console.log('add user successful!', response);
      },
      error: (error) => {
        console.error('add user failed', error);
        alert('add user failed');
      }
    });
  }
}