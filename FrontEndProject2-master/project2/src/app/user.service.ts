import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';

@Injectable()
export class UserService {

  constructor(private http:HttpClient) { }

  public loggedUser;
  public right = 0;
  public total = 0;
  public wrong = 0;
  login(email: string, password: string): Observable<any> {
    let observe = this.http.get(`http://54.198.14.22:8090/api/login?email=${email}&password=${password}`);
    observe.subscribe(
        res => {this.loggedUser = res;
        console.log(res);
        }
    );
    return observe;
  }
  

  register(email: string, password: string, first:string, last: string) {
    return this.http.get(`http://54.198.14.22:8090/api/register?email=${email}&password=${password}&fname=${first}&lname=${last}`);
  }

  correct() {
    this.right++;
    this.total++;
  }

  incorrect() {
    this.wrong++;
    this.total++;
  }

  getRight(): number {
    return this.right;
  }
  getWrong(): number {
    return this.wrong;
  }
  getTotal(): number {
    return this.total;
  }

  updateUser() {
      if(this.loggedUser) {
        let mail = this.loggedUser.email;
        let ui = this.loggedUser.userId;
        let ri = this.right + this.loggedUser.correctAnswers;
        let wr = this.wrong + this.loggedUser.wrongAnswers;
        console.log(this.loggedUser.email)
         console.log(this.loggedUser.userId);
         console.log(this.right);
         console.log(this.wrong);
         this.http.get(`http://54.198.14.22:8090/api/updateUser?userid=${ui}&correctAnswers=${ri}&wrongAnswers=${wr}`).subscribe(
         res => {console.log("called update");}
         );
      }
  }
}

