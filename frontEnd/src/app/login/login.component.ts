import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from "../header/header.component";
import { Router } from '@angular/router';




@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule,HeaderComponent ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginData = { email: '', password: '' };

  constructor(private http: HttpClient, private router: Router) {}

  isLoading = false;

  onSubmit() {
    this.isLoading = true;
    console.log(this.loginData.email);

    if (!this.loginData.email || !this.loginData.password) {
      alert('Please fill in all fields.');
      this.isLoading = false;
      return;
    }
    
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(this.loginData.email)) {
      alert('Please enter a valid email address.');
      this.isLoading = false;
      return;
    }
  
    const url = 'http://localhost:8080/clients/login'; // URL du backend
    this.http.post(url, this.loginData).subscribe({
      next: (response) => {
        this.isLoading = false;
        console.log("Login succeful",response);
        this.router.navigate(['/homepage']);

      },
      error: (error) => {
        console.error('Login failed', error);
        this.isLoading = false;
        if (error.status === 401) {
          alert('Invalid email or password.');
        } else if (error.status === 500) {
          alert('Server error, please try again later.');
        } else {
          alert('Login failed. Please check your connection.');
        }
      }
    });
  }
}