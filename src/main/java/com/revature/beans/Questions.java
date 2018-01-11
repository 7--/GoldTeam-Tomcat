package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTIONS")
public class Questions {
	private int id;
	private int quiz;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private int answer;

	@Id
	@Column(name = "QUESTIONS_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "QUESTIONS_QUIZ")
	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	@Column(name = "QUESTIONS_CHOICE1")
	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	@Column(name = "QUESTIONS_CHOICE2")
	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	@Column(name = "QUESTIONS_CHOICE3")
	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	@Column(name = "QUESTIONS_CHOICE4")
	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	@Column(name = "QUESTIONS_ANSWER")
	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", quiz=" + quiz + ", choice1=" + choice1 + ", choice2=" + choice2 + ", choice3="
				+ choice3 + ", choice4=" + choice4 + ", answer=" + answer + "]";
	}

	public Questions(int id, int quiz, String choice1, String choice2, String choice3, String choice4, int answer) {
		super();
		this.id = id;
		this.quiz = quiz;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.answer = answer;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

}
