import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  ngOnInit(){
    let docWidth = document.documentElement.offsetWidth;
    
    [].forEach.call(
      document.querySelectorAll('*'),
      function(el) {
        if (el.offsetWidth > docWidth) {
          //console.log(el);
        }
      }
    );
  }
}


