import { AfterViewInit, Component, Inject, PLATFORM_ID } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { FooterComponent } from '../footer/footer.component';
import gsap from 'gsap';
import ScrollTrigger from 'gsap/ScrollTrigger';
import { isPlatformBrowser } from '@angular/common';


@Component({
  selector: 'app-homepage',
  imports: [HeaderComponent, FooterComponent],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent implements AfterViewInit {
  
  constructor(@Inject(PLATFORM_ID) private platformId:Object){
  }
  
  ngAfterViewInit(): void {
    gsap.registerPlugin(ScrollTrigger);
    if(isPlatformBrowser(this.platformId)){
      gsap.to(".jaune h1", {
        scrollTrigger:{
          trigger:".jaune h1",
          start:"14px 20%",
          scrub:1.5,
          markers:true,
          toggleActions:"restart resume reverse pause"
        },   
    
        x:"-15vw",
        y:0,
        opacity:1,
        duration:2, 
       
      })
    }
    


  
  }
  
  
}
