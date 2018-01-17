package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.beans.Users;
import com.revature.repository.QuestionsDao;
import com.revature.repository.QuizDao;
import com.revature.repository.UsersDao;

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
			Users myUser = usersDao.findByEmail("regop412@gmail.com");
			//System.out.println(users.toString());
			System.out.println(myUser.toString());
		};
	}

}
