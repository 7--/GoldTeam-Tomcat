package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Quiz")
public class Quiz {

	@Id
	@Column(name = "QUIZID")
	@GeneratedValue
	private int quizid;

	@Column(name = "NAME")
	private String name;

	public int getId() {
		return quizid;
	}

	public void setId(int id) {
		this.quizid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + quizid + ", name=" + name + "]";
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
