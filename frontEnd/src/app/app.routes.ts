import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { provideRouter } from '@angular/router';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    { path: '', redirectTo: '/homepage', pathMatch: 'full' },
    { path: 'homepage', component: HomepageComponent },
    { path: 'login', component: LoginComponent },
    
  ];
  
  export const appRoutingProviders = [
    provideRouter(routes)
  ];