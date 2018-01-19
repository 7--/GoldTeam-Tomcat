import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectQuizComponent } from './select-quiz.component';

describe('SelectQuizComponent', () => {
  let component: SelectQuizComponent;
  let fixture: ComponentFixture<SelectQuizComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelectQuizComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SelectQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
