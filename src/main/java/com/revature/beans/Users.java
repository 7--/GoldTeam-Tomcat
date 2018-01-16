package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users {
	private int userId;
	private String email;
	private String password;
	private int correctAnswers;
	private int wrongAnswers;
	private String fname;
	private String lname;

	@Id
	@Column(name = "USERID")
	@GeneratedValue
	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "CORRECTANSWERS")
	public int getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	@Column(name = "WRONGANSWERS")
	public int getWrongAnswers() {
		return wrongAnswers;
	}

	public void setWrongAnswers(int wrongAnswers) {
		this.wrongAnswers = wrongAnswers;
	}

	@Column(name = "FIRSTNAME")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name = "LASTNAME")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Users [id=" + userId + ", email=" + email + ", password=" + password + ", correctAnswers=" + correctAnswers
				+ ", wrongAnswers=" + wrongAnswers + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public Users(String email, String password, int correctAnswers, int wrongAnswers, String fname,
			String lname) {
		super();
		this.email = email;
		this.password = password;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
		this.fname = fname;
		this.lname = lname;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

}
