import { Component, OnInit } from '@angular/core';
import {LeaderService} from '../leader.service';
import {Leaders} from '../leader.service';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
@Component({
  selector: 'app-leaderboard',
  templateUrl: './leaderboard.component.html',
  styleUrls: ['./leaderboard.component.css'],
})
export class LeaderboardComponent implements OnInit {
  //leader = [new Leaders('John',1000), new Leaders('Jim',900)];
  public leader;
  constructor(private leaderService: LeaderService) { }

  ngOnInit() {

    this.grabLeaders();
  }

  grabLeaders(): void {

    this.leaderService.getLeaders().subscribe(
    res => {
      this.leader = res;
      }
    );
  }
}
/*
export class Leaders {
  //public showLeaders()
  public name: string;
  public score: number;

  constructor(s: string, n: number) {
      this.name=s;
      this.score=n;
  }

}
*/