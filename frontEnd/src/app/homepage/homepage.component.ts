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
        x:"-15vw",
        y:0,
        opacity:1,
        duration:2, 
       
      }),
      gsap.to(".jaune .description-container", {
        x:"+10vw",
        y:0,
        opacity:1,
        duration:2, 
      }),
      gsap.to(".jaune .description-container2", {
        x:"-10vw",
        y:0,
        opacity:1,
        duration:2, 
      }),
      gsap.to(".jaune .description-container3", {
        x:"+10vw",
        y:0,
        opacity:1,
        duration:2, 
      })
    }  
  }
  
  
}
