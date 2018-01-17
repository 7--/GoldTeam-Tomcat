package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Users;
import com.revature.repository.UsersDao;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class UsersController {

	@Autowired
	UsersDao usersDao;

	@GetMapping(value = "/Users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers() {
		List<Users> users = usersDao.findAll();
		return users;
	}

	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = false) String password) {
		Users myUser = usersDao.findByEmail(email);
		if (myUser == null) {
			return "{\"validuser\":\"false\"}";
		}
		String myPassword = myUser.getPassword();
		if (myPassword.equals(password)) {
			return "{\"validuser\":\"true\"}";
		} else {
			return "{\"validuser\":\"false\"}";
		}

	}

	@GetMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
	public void register(Users newuser) {

		System.out.println(newuser.toString());

		newuser = usersDao.save(newuser);

		System.out.println(newuser.toString());
	}

	@GetMapping(value = "/updateUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public void update_user(@RequestParam("userid") int userid,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "correctAnswer", required = false) int correctAnswer,
			@RequestParam(value = "wrongAnswer", required = false) int wrongAnswer,
			@RequestParam(value = "fname", required = false) String fname,
			@RequestParam(value = "lname", required = false) String lname) {

		Users user = usersDao.findByUserid(userid);
		user.setEmail(email);
		user.setPassword(password);
		user.setCorrectAnswers(correctAnswer);
		user.setWrongAnswers(wrongAnswer);
		user.setFname(fname);
		user.setLname(lname);

		usersDao.save(user);
	}

	@GetMapping(value = "/deleteUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete_user(@RequestParam(value = "userid", required = true) int userid) {

		Users user = usersDao.findByUserid(userid);
		usersDao.delete(user);
	}

}
