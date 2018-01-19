import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service'
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private userService: UserService,private router: Router) { }
  email = "";
  password = "";
  first = "";
  last = "";

  ngOnInit() {
  }

  register() {
      console.log(this.email);
      console.log(this.password);
      console.log(this.first);
      console.log(this.last);
      this.userService.register(this.email,this.password,this.first,this.last).subscribe(
         res => {
             this.userService.login(this.email,this.password);
         },
         err => {
          console.log("error");
         }
    );
    
  }
}
