package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Questions;

@Repository
public interface QuestionsDao extends JpaRepository<Questions, Integer> {
	
	Questions findByQuestionid(int questionid);
	List<Questions> findByQuiz(int quiz);
}
