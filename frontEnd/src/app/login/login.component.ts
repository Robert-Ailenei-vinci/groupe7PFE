import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  imports: [FormsModule,CommonModule ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginData = { username: '', password: '' };

  constructor(private http: HttpClient) {}

  onSubmit() {
    const url = 'http://localhost:8080/api/login'; // URL du backend
    this.http.post(url, this.loginData).subscribe({
      next: (response) => {
        console.log('Login successful!', response);
        alert('Login successful!');
      },
      error: (error) => {
        console.error('Login failed', error);
        alert('Invalid username or password');
      }
    });
  }
}