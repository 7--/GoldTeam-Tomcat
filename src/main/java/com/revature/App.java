package com.revature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.repository.*;
import com.revature.beans.*;

@SpringBootApplication
public class App {

	@Autowired
	UsersDao usersDao;
	
	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuestionsDao questionsDao;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			
			//List<Users> users =usersDao.findAll();
			//Users myUser = usersDao.findByUserId(1);
			Users myUser = usersDao.findByEmail("regop412@gmail.com", "p4ssw0rd");
			//System.out.println(users.toString());
			System.out.println(myUser.toString());
		};
	}

}
