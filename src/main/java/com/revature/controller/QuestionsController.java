package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Questions;
import com.revature.repository.QuestionsDao;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class QuestionsController {

	@Autowired
	QuestionsDao questionsDao;

	@GetMapping(value = "/questions", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Questions> getQuestions() {
		List<Questions> Questions = questionsDao.findAll();
		return Questions;
	}

	@GetMapping(value = "/question", produces = MediaType.APPLICATION_JSON_VALUE)
	public Questions getQuestion(@RequestParam(value = "questionid", required = true) int questionid) {
		Questions question = questionsDao.findByQuestionid(questionid);
		return question;
	}
	
	@GetMapping(value = "/questionslist", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Questions> getQuestionsByQuiz(@RequestParam(value = "quiz", required = true) int quizid) {
		List<Questions> questions = questionsDao.findByQuiz(quizid);
		
		return questions;
	}

	/*
	@GetMapping(value = "/addQuestions/{quiz}/{question}/{choice1}/{choice2}/{choice3}/{choice4}/{answer}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addQuestions(@PathVariable("quiz") int quiz,
			@PathVariable("question") String question, 
			@PathVariable("choice1") String choice1, 
			@PathVariable("choice2") String choice2, 
			@PathVariable("choice3") String choice3, 
			@PathVariable("choice4") String choice4, 
			@PathVariable("answer") int answer) {

		Questions questions = new Questions(quiz, question, choice1, choice2, choice3, choice4, answer);
		questionsDao.save(questions);
	}

	@GetMapping(value = "/updateQuestions/{questions_id}/{quiz}/{question}/{choice1}/{choice2}/{choice3}/{choice4}/{answer}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void update_Questions(@PathVariable("questions_id") int questions_id,
			@PathVariable("quiz") int quiz,
			@PathVariable("question") String question,
			@PathVariable("choice1") String choice1, 
			@PathVariable("choice2") String choice2,
			@PathVariable("choice3") String choice3, 
			@PathVariable("choice4") String choice4,
			@PathVariable("answer") int answer) {

		Questions questions = questionsDao.findByQuestionsid(questions_id);
		questions.setQuiz(quiz);
		questions.setQuestion(question);
		questions.setChoice1(choice1);
		questions.setChoice2(choice2);
		questions.setChoice3(choice3);
		questions.setChoice4(choice4);
		questions.setAnswer(answer);
		questionsDao.save(questions);
	}

	@GetMapping(value = "/deleteQuestions/{questions_id}/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete_Questions(@PathVariable("questions_id") int questions_id) {

		Questions questions = questionsDao.findByQuestionsid(questions_id);
		questionsDao.delete(questions);
	}
	*/
}
