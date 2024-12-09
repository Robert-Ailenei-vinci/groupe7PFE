import { Component, OnInit } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule } from '@angular/common';
import { QuestionnaireManagerComponent } from '../questionnaire-manager/questionnaire-manager.component';
import { QuestionnaireDetail, QuestionRepondus } from '../../services/client.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-question',
  imports: [HeaderComponent, FooterComponent, CommonModule, QuestionnaireManagerComponent],
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css'],
})
export class QuestionComponent implements OnInit {
  questionnaire: QuestionnaireDetail[] = [];
  question!: QuestionRepondus; // La question à afficher
  isLoading = true;

  constructor(private route: ActivatedRoute) {}

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
      console.log('Question trouvée :', this.question);
      this.isLoading = false;
    }, 700);
  }
  
}