import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor() { }

  ngOnInit() {

  }

  PresentPage(obj){
    console.log("Present Page is running");
		var everyMenuBar = document.getElementsByClassName('presentState');
		for(var i =0; i<everyMenuBar.length; i++){
			everyMenuBar[i].className ="navMenu";
		}
		obj.className = "presentState";	
		
	}
}
