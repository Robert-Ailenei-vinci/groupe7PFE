import { Component, Inject, OnInit, PLATFORM_ID } from '@angular/core';
import { FaqService } from '../../services/faq.service';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { CommonModule, isPlatformBrowser } from '@angular/common';
import gsap from 'gsap';

@Component({
  selector: 'app-faq-page',
  imports: [HeaderComponent, FooterComponent, CommonModule],
  templateUrl: './faq-page.component.html',
  styleUrl: './faq-page.component.css'
})

export class FaqPageComponent implements OnInit {

  isAdmin: boolean = localStorage.getItem('authAdminToken') ? true : false;

  faqItems = [
    {
      id: '',
      intitule: 'Chargement des question',
      reponse: 'Veuillez patienter...'
    }
  ];

  constructor(private faqService: FaqService) {
  }

  ngOnInit() {
    console.log(this.loadFaqs())
    this.loadFaqs();
  }

  loadFaqs() {
    this.faqService.getFaqs().subscribe((data) => {
      console.log(data)
      this.faqItems = data.map(item => ({ ...item }));
    });
  }  

  toggle(id: string) {
    this.faqItems = this.faqItems.map(item =>
      item.id === id ? { ...item } : item
    );
  }
}