import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { provideRouter } from '@angular/router';
import { QuestionComponent } from './question/question.component';

export const routes: Routes = [
    { path: '', redirectTo: '/homepage', pathMatch: 'full' },
    { path: 'homepage', component: HomepageComponent },
    //{ path: 'login', component: LoginComponent }, pour rafael ca
    { path:'esg/question/:id', component: QuestionComponent }
    
  ];
  
  export const appRoutingProviders = [
    provideRouter(routes)
  ];