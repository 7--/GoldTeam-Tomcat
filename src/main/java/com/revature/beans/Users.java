package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
	@SequenceGenerator(allocationSize = 1, name = "userSeq", sequenceName = "SQ_USERS_PK")
	@Column(name = "USERID")
	private int userid;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "UPASSWORD")
	private String password;

	@Column(name = "CORRECTANSWERS")
	private int correctAnswers;

	@Column(name = "WRONGANSWERS")
	private int wrongAnswers;

	@Column(name = "FIRSTNAME")
	private String fname;

	@Column(name = "LASTNAME")
	private String lname;

	public int getUserId() {
		return userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Users [id=" + userid + ", email=" + email + ", password=" + password + ", correctAnswers="
				+ correctAnswers + ", wrongAnswers=" + wrongAnswers + ", fname=" + fname + ", lname=" + lname + "]";
	}

	public Users(String email, String password, int correctAnswers, int wrongAnswers, String fname, String lname) {
		super();
		// this.userId = GeneratedValue;
		this.email = email;
		this.password = password;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
		this.fname = fname;
		this.lname = lname;
	}

	public Users() {
		super();
	}

}
