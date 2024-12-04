import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginData = { email: '' };

  constructor(private http: HttpClient) {}

  onSubmit() {
    console.log(this.loginData);
    
    const url = 'http://localhost:8080/api/users'; // URL du backend
    this.http.post(url, this.loginData).subscribe({
      next: (response) => {
        console.log('add user successful!', response);
        alert('add user successful!');
      },
      error: (error) => {
        console.error('add user failed', error);
        alert('add user failed');
      }
    });
  }
}