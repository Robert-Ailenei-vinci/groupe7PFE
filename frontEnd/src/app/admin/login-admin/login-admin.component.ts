import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from "../../margins/header/header.component";
import { Router } from '@angular/router';
import { FooterComponent } from '../../margins/footer/footer.component';

@Component({
  selector: 'app-login-admin',
  imports: [FormsModule,CommonModule,HeaderComponent , FooterComponent],
  templateUrl: './login-admin.component.html',
  styleUrl: './login-admin.component.css'
})
export class LoginAdminComponent {

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
  
    const url = 'http://localhost:8080/consultants/login'; // URL du backend
    this.http.post(url, this.loginData).subscribe({
      next: (response) => {
        this.isLoading = false;
        console.log("Login succeful",response);
        localStorage.setItem('authAdminToken', JSON.stringify(response));
        this.router.navigate(['/pageAdmin']);

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
