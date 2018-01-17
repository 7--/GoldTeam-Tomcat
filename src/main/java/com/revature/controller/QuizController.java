package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.beans.Quiz;
import com.revature.repository.QuizDao;

public class QuizController {

	@Autowired
	QuizDao quizDao;

	@GetMapping(value = "/Quizes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> getQuizes() {
		List<Quiz> quizes = quizDao.findAll();
		return quizes;
	}

	@GetMapping(value = "/Quiz", produces = MediaType.APPLICATION_JSON_VALUE)
	public Quiz getQuiz(@PathVariable("quiz_id") int quiz_id) {
		Quiz quiz = quizDao.findByQuizid(quiz_id);
		return quiz;
	}
	
	@GetMapping(value = "/addQuiz/{name}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void register(@PathVariable("name") String name) {

		Quiz quiz = new Quiz(name);
		quizDao.save(quiz);
	}

	@GetMapping(value = "/updateQuiz/{quiz_id}/{email}/{password}/{correctAnswer}/{wrongAnswer}/{fname}/{lname}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void update_quiz(@PathVariable("quiz_id") int quiz_id, @PathVariable("name") String name) {

		Quiz quiz = quizDao.findByQuizid(quiz_id);
		quiz.setName(name);
		quizDao.save(quiz);
	}
	
	@GetMapping(value = "/deleteQuiz/{quiz_id}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete_quiz(@PathVariable("quiz_id") int quiz_id) {

		Quiz quiz = quizDao.findByQuizid(quiz_id);
		quizDao.delete(quiz);
	}
}
