import { Component, OnInit } from '@angular/core';
import { FaqItem, FaqItemForm, FaqService } from '../../services/faq.service';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-faq-admin',
  standalone: true,
  imports: [HeaderComponent, FooterComponent, FormsModule, CommonModule],
  templateUrl: './faq-admin.component.html',
  styleUrls: ['./faq-admin.component.css']
})
export class FaqAdminComponent implements OnInit {

  faq: FaqItemForm = {
    intitule: '',
    reponse: ''
  };

  faqItems: FaqItem[] = [];

  constructor(private faqService: FaqService) {}

  ngOnInit() {
    this.loadFaqs();
  }

  // Charger les FAQ existantes
  loadFaqs(): void {
    this.faqService.getFaqs().subscribe((data) => {
      this.faqItems = data;
    });
  }

  // Ajouter une nouvelle FAQ
  ajouterQuestion(): void {
    if (this.faq.intitule && this.faq.reponse) {
      this.faqService.addFaqs(this.faq).subscribe(() => {
        this.loadFaqs(); // Recharge les données après l'ajout
        console.log(this.faqItems);
        this.faq = { intitule: '', reponse: '' }; // Réinitialise le formulaire
      });
    }
  }
}
