import { AfterViewInit, Component, Inject, PLATFORM_ID } from '@angular/core';
import { HeaderComponent } from '../../margins/header/header.component';
import { FooterComponent } from '../../margins/footer/footer.component';
import { RouterModule } from '@angular/router';
import gsap from 'gsap';
import { CommonModule } from '@angular/common';

import ScrollTrigger from 'gsap/ScrollTrigger';
import { isPlatformBrowser } from '@angular/common';
import { BackToTopComponent } from '../../margins/back-to-top/back-to-top.component';


@Component({
  selector: 'app-homepage',
  imports: [HeaderComponent, FooterComponent, RouterModule, BackToTopComponent, CommonModule],
  standalone:true,
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent implements AfterViewInit {
  
  client = localStorage.getItem('authToken');
  estConnecte = this.client ? true : false;
  nomClient = this.client ? JSON.parse(this.client).email : '';
  
  admin = localStorage.getItem('authAdminToken');
  estAdmin = this.admin ? true : false;


  constructor(@Inject(PLATFORM_ID) private platformId:Object){
  }
  
  ngAfterViewInit(): void {
    gsap.registerPlugin(ScrollTrigger);
  
    if (isPlatformBrowser(this.platformId)) {
      // animation pour ".jaune"
      gsap.to(".jaune h1", {
        x: "-15vw",
        y: 0,
        opacity: 1,
        duration: 2,
       
      });
  
      gsap.to(".jaune .description-container", {
        x: "+10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        
      });
  
      gsap.to(".jaune .description-container2", {
        x: "-10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        
      });
  
      gsap.to(".jaune .description-container3", {
        x: "+10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".jaune .description-container3",
          start: "top 101%",
          end: "bottom 95%",
          toggleActions: "restart continue none none",
        },
      });

  
      // animation pour ".vertFonce"
      gsap.to(".vertFonce .description-container", {
        x: "-10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".vertFonce .description-container",
          start: "top 101%",
          end: "bottom 95%",
          toggleActions: "restart continue none none",
        },
      });
  
      gsap.to(".vertFonce .environnement-container", {
        x: "10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".vertFonce .environnement-container",
          start: "top 101%",
          end: "bottom 60%",
          toggleActions: "restart continue none none",
        },
      });
  
      gsap.to(".vertFonce .environnement-container2", {
        x: "-10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".vertFonce .environnement-container2",
          start: "top 101%",
          end: "bottom 60%",
          toggleActions: "restart continue none none",
        },
      });

      gsap.to(".vertFonce .environnement-container3", {
        x: "10vw",
        y: 0,
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".vertFonce .environnement-container3",
          start: "top 101%",
          end: "bottom 60%",
          toggleActions: "restart continue none none",
        },
      });
  
      gsap.to(".bubble .container", {
        x: 0,
        y: "7vw",
        opacity: 1,
        duration: 2,
        scrollTrigger: {
          trigger: ".bubble .container",
          start: "top 101%",
          end: "bottom 60%",
          toggleActions: "restart continue none none",
        },
      });
    }
  }
  
  
}
