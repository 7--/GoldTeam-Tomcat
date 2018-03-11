package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionSeq")
	@SequenceGenerator(allocationSize = 1, name = "questionSeq", sequenceName = "SQ_QUESTION_PK")
	@Column(name = "QUESTIONID")
	private int questionid;

	@Column(name = "QUIZ")
	private int quiz;

	@Column(name = "QUESTION")
	private String question;

	@Column(name = "CHOICE1")
	private String choice1;

	@Column(name = "CHOICE2")
	private String choice2;

	@Column(name = "CHOICE3")
	private String choice3;

	@Column(name = "CHOICE4")
	private String choice4;

	@Column(name = "ANSWER")
	private int answer;

	public int getId() {
		return questionid;
	}

	public void setId(int id) {
		this.questionid = id;
	}

	public int getQuiz() {
		return quiz;
	}

	public void setQuiz(int quiz) {
		this.quiz = quiz;
	}

	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Questions [questions_id=" + questionid + ", quiz=" + quiz + ", question=" + question + ", choice1="
				+ choice1 + ", choice2=" + choice2 + ", choice3=" + choice3 + ", choice4=" + choice4 + ", answer="
				+ answer + "]";
	}

	public Questions(int quiz, String question, String choice1, String choice2, String choice3, String choice4,
			int answer) {
		super();
		this.quiz = quiz;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.answer = answer;
	}

	public Questions() {
		super();
	}

}
