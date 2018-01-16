package com.revature;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    // @Autowired
    // UsersDao usersDao;
    //
    // @Autowired
    // QuizDao quizDao;
    //
    // @Autowired
    // QuestionsDao questionsDao;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }

    @Bean
    public CommandLineRunner runner() {

        return args -> {

            // List<Users> users = usersDao.findAll();
            // Users myUser = usersDao.findByfname("Tester");
            // System.out.println(users.toString());
            // System.out.println(myUser.toString());
        };

    }

}
