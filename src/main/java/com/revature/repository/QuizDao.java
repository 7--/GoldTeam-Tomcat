package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}