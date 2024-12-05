import { Component } from '@angular/core';
import { LogoutComponent } from '../logout/logout.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [LogoutComponent,CommonModule],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent  {

  client = localStorage.getItem('authToken');
  estConnecte = this.client ? true : false;

  nomClient = this.client ? JSON.parse(this.client).email : '';

}
