import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule } from '@angular/common';
import { QuestionnaireManagerComponent } from '../questionnaire-manager/questionnaire-manager.component';
import { QuestionnaireDetail, QuestionRepondus } from '../../services/client.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-question',
  imports: [HeaderComponent, FooterComponent, CommonModule, QuestionnaireManagerComponent],
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})
export class QuestionComponent implements OnInit {
  questionnaire: QuestionnaireDetail[] = [];
  question!: QuestionRepondus;
  isLoading = true;

  constructor(private route: ActivatedRoute, private router : Router) {}

  ngOnInit(): void {
    const questionId = this.route.snapshot.paramMap.get('id');
    setTimeout(() => {
      this.questionnaire = QuestionnaireManagerComponent.getQuestionnaireDetail();
    
      if (this.questionnaire.length === 0) {
        console.error('Questionnaire vide ou non chargé');
        this.isLoading = false;
        return;
      }
    
      const questions = this.questionnaire[0].questionsRepondues;
      const foundQuestion = questions.find((q) => q.id === questionId);
    
      if (!foundQuestion) {
        console.error('Aucune question trouvée pour cet ID');
        this.isLoading = false;
        return;
      }
      
      this.question = foundQuestion;
      // On remplace les XXX par le nom de l'entreprise
      const user = localStorage.getItem('authToken');
      const entreprise = user ? JSON.parse(user).nomEntreprise : '';
      this.question.intitule = this.question.intitule.replace(/XXX/g, entreprise ?? '');
      
      this.isLoading = false;
    }, 700);
  }

  navigateToNextQuestion(): void {
    let indexOfCurrentQuestion = this.questionnaire[0].questionsRepondues.indexOf(this.question);
    indexOfCurrentQuestion++;
    if (indexOfCurrentQuestion >= this.questionnaire[0].questionsRepondues.length) {
      indexOfCurrentQuestion = 0;
    }
    this.router.navigate(['/esg/question/', this.questionnaire[0].questionsRepondues[indexOfCurrentQuestion].id]);
  }
  
}