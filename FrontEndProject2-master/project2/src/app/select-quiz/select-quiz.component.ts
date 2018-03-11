import { Component, OnInit } from '@angular/core';
import { QuestionsService } from '../questions.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-select-quiz',
  templateUrl: './select-quiz.component.html',
  styleUrls: ['./select-quiz.component.css']
})
export class SelectQuizComponent implements OnInit {

  constructor(private questionsService: QuestionsService, private router: Router) { }

  ngOnInit() {
  }

  select(id:number){
      this.questionsService.setQuiz(id);

  }

}
