import { Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { provideRouter } from '@angular/router';
import { QuestionComponent } from './question/question.component';
import { LoginComponent } from './login/login.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { PageAdminComponent } from './page-admin/page-admin.component';
import { AdminGuard } from './guards/admin.guard';
import { QuestionnaireComponent } from './questionnaire/questionnaire.component';
import { AdminQuestionnaireDetailComponent } from './admin-questionnaire-detail/admin-questionnaire-detail.component';

export const routes: Routes = [
  { path: '', redirectTo: '/homepage', pathMatch: 'full' },
  { path: 'homepage', component: HomepageComponent },
  { path: 'pageAdmin', component: PageAdminComponent, canActivate: [AdminGuard] },
  { path: 'admin/questionnaires/:clientId', component: AdminQuestionnaireDetailComponent, canActivate: [AdminGuard] },
  { path: 'login', component: LoginComponent },
  { path: 'loginAdmin', component: LoginAdminComponent },
  { path: 'esg/question/:id', component: QuestionComponent },
  { path:'esg', component: QuestionnaireComponent },
  { path : 'onboarding', component:HomepageComponent} //A changer avec le questionnaire de onboard
];

export const appRoutingProviders = [
  provideRouter(routes)
];
