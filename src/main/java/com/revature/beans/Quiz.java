package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUIZ")
public class Quiz {
	private int id;
	private String name;

	@Id
	@Column(name = "QUIZ_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "QUIZ_NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + "]";
	}

	public Quiz(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

}
