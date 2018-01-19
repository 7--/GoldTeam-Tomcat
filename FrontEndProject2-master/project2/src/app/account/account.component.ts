import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service'
@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

}
