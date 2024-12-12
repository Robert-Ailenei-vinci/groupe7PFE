import { Routes } from '@angular/router';
import { HomepageComponent } from './pages/homepage/homepage.component';
import { provideRouter } from '@angular/router';
import { QuestionComponent } from './questionnaires/question/question.component';
import { LoginComponent } from './pages/login/login.component';
import { LoginAdminComponent } from './admin/login-admin/login-admin.component';
import { PageAdminComponent } from './admin/page-admin/page-admin.component';
import { AdminGuard } from './guards/admin.guard';
import { QuestionnaireComponent } from './questionnaires/questionnaire/questionnaire.component';
import { AdminQuestionnaireDetailComponent } from './admin/admin-questionnaire-detail/admin-questionnaire-detail.component';
import { FaqPageComponent } from './pages/faq-page/faq-page.component';
import { RegisterComponent } from './pages/register/register.component';
import { DetailscoreComponent } from './admin/detailscore/detailscore.component';
import { DetailclientComponent } from './admin/detailclient/detailclient.component';
import { FaqAdminComponent } from './admin/faq-admin/faq-admin.component';


export const routes: Routes = [
  { path: '', redirectTo: '/homepage', pathMatch: 'full' },
  { path: 'homepage', component: HomepageComponent },
  { path: 'pageAdmin', component: PageAdminComponent, canActivate: [AdminGuard] },
  { path: 'admin/questionnaires/:clientId', component: AdminQuestionnaireDetailComponent, canActivate: [AdminGuard] },
  { path: 'detailscore/:idQuestionnaire', component: DetailscoreComponent },
  { path: 'detailclient/:clientId', component: DetailclientComponent, canActivate: [AdminGuard] },
  { path: 'login', component: LoginComponent },
  { path: 'loginAdmin', component: LoginAdminComponent },
  { path: 'esg/question/:id', component: QuestionComponent },
  { path:'esg', component: QuestionnaireComponent },
  { path : 'onboarding', component:RegisterComponent},
  { path : 'questions', component:FaqPageComponent}, //A changer avec le questionnaire de onboard
  { path : 'questionsAdmin', component:FaqAdminComponent},
];

export const appRoutingProviders = [
  provideRouter(routes)
];
