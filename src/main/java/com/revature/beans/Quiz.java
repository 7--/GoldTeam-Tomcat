package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUIZ")
public class Quiz {
	private int quiz_id;
	private String name;

	@Id
	@Column(name = "QUIZID")
	@GeneratedValue
	public int getId() {
		return quiz_id;
	}

	public void setId(int id) {
		this.quiz_id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + quiz_id + ", name=" + name + "]";
	}

	public Quiz(String name) {
		super();
		this.name = name;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

}
