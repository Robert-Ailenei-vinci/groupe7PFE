import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { provideRouter } from '@angular/router';

export const routes: Routes = [
    { path: '', redirectTo: '/homepage', pathMatch: 'full' },
    { path: 'homepage', component: HomepageComponent },
    //{ path: 'login', component: LoginComponent }, pour rafael ca
    
  ];
  
  export const appRoutingProviders = [
    provideRouter(routes)
  ];