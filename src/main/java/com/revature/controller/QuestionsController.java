package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.revature.beans.Questions;
import com.revature.repository.QuestionsDao;

public class QuestionsController {

	@Autowired
	QuestionsDao questionsDao;

	@GetMapping(value = "/Questions", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Questions> getQuestions() {
		List<Questions> Questions = questionsDao.findAll();
		return Questions;
	}

	@GetMapping(value = "/Question", produces = MediaType.APPLICATION_JSON_VALUE)
	public Questions getQuestion(@PathVariable("questions_id") int questions_id) {
		Questions question = questionsDao.findByQuestionsid(questions_id);
		return question;
	}

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
}
