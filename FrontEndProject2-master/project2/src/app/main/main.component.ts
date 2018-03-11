import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    let jsondata = `[{"question":"Arasilly is stupid.Loream Ipsum Fataneums. AWDADWADADAWDAWDWDAWD", "option1":1,"option2":2,"option3":3,"option4":4,"answer":4},{"question":"3+2", "option1":1,"option2":2,"option3":5,"option4":4,"answer":3}]`;
    this.questions = JSON.parse(jsondata);
    this.questionAnswered(0);
    this.index=0;
    /*
    let xml = new XMLHttpRequest();
          xml.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
             let json = JSON.parse(xml.responseText);
             questions = json;
             index = 0;
             
            }
            xml.open('GET',`http://localhost:8080/Reimbursement/ManServlet?quizid=${sessionStorage.quizId}`,true);
            xml.send();
            */
  }

  public question: string;
  public option1: string;
  public option2: string;
  public option3: string;
  public option4: string;

  public questions;
  public index = 0;

  //NgStyle 
  questionAnswered(answer: number) {
      //if(this.index == 0) {
     
      console.log(this.questions)
      this.question = this.questions[this.index].question;
      this.option1 = this.questions[this.index].option1;
      this.option2 = this.questions[this.index].option2;
      this.option3 = this.questions[this.index].option3;
      this.option4 = this.questions[this.index].option4;
      this.index++;
      }
  }

