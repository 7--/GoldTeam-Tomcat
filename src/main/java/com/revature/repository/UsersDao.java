package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer> {
	Users findByfname(String name);
}