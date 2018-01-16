package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Users;
import com.revature.repository.UsersDao;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsersController {

	@Autowired
	UsersDao usersDao;

	@GetMapping(value = "/Users", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers() {
		List<Users> users = usersDao.findAll();
		return users;
	}

/*	@GetMapping(value = "/login/{email}/{password}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Users login(@PathVariable("email") String email, @PathVariable("password") String password) {
		Users user = usersDao.findByLogin(email, password);
		return user;
	}
*/
	@GetMapping(value = "/register/{email}/{password}/{fname}/{lname}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void register(@PathVariable("email") String email, @PathVariable("password") String password,
			@PathVariable("fname") String fname, @PathVariable("lname") String lname) {

		Users user = new Users(email, password, 0, 0, fname, lname);

		usersDao.save(user);
	}
/*
	@GetMapping(value = "/updateUser/{userid}/{email}/{password}/{correctAnswer}/{wrongAnswer}/{fname}/{lname}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void update_user(@PathVariable("userid") int userid, @PathVariable("email") String email,
			@PathVariable("password") String password, @PathVariable("correctAnswer") int correctAnswer,
			@PathVariable("wrongAnswer") int wrongAnswer, @PathVariable("fname") String fname,
			@PathVariable("lname") String lname) {

		Users user = usersDao.findByUser_id(userid);

		user.setEmail(email);
		user.setPassword(password);
		user.setCorrectAnswers(correctAnswer);
		user.setWrongAnswers(wrongAnswer);
		user.setFname(fname);
		user.setLname(lname);

		usersDao.save(user);
	}
	
	@GetMapping(value = "/deleteUser/{userid}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete_user(@PathVariable("userid") int userid) {

		Users user = usersDao.findByUser_id(userid);

		usersDao.delete(user);
	} */
}
