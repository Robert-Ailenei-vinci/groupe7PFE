import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { FooterComponent } from '../footer/footer.component';

@Component({
  selector: 'app-homepage',
  imports: [HeaderComponent, FooterComponent],
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {

  client = localStorage.getItem('authToken');

  nomClient = this.client ? JSON.parse(this.client).email : '';
}
