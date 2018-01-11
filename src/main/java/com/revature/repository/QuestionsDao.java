package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Questions;

@Repository
public interface QuestionsDao extends JpaRepository<Questions, Integer> {

}
