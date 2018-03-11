package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.revature.repository.QuestionsDao;
import com.revature.repository.QuizDao;
import com.revature.repository.UsersDao;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

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
        	
        };
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }

}
