package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.beans.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {
	Users findByUserId(int id);
	Users findByEmail(String email);
}