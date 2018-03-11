package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.beans.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {
	Users findByUserid(int id);
	Users findByEmail(String email);
	List<Users> findAllByOrderByCorrectAnswersDesc();
}