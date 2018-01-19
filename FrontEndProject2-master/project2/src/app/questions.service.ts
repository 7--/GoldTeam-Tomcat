import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class QuestionsService {
  
  constructor(private http: HttpClient) { }
  public questions;
  public quiz: number = 1;
  public observe: Observable<any>;
  public quizComponent;

  getQuestions(obj): Observable<any> {
      this.quizComponent=obj;
      console.log("set")
      return this.observe
      //this.http.get(`http://54.198.14.22:8090/api/questionslist?quiz=1`);
  }

  setQuestions() {
      this.observe = this.http.get(`http://54.198.14.22:8090/api/questionslist?quiz=${this.quiz}`);
  }

  setQuiz(quizNo : number) {
      this.quiz = quizNo;
      this.setQuestions();
      this.quizComponent.update();
      console.log(this.quiz);
  }
  
}

export class Question {

    constructor(question: string, option1: string, option2: string, option3: string, option4: string, answer: number) {
    this.question = question;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.answer = answer;
    }
    question: string;
    option1: string;
    option2: string;
    option3: string;
    option4: string;
    answer: number;
}
