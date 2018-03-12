package com.revature.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.revature.beans.Users;

@TestInstance(Lifecycle.PER_CLASS)
public class UsersControllerTest {

	@BeforeAll
	public void init() {
		System.out.println("init run");
	}

	@Test
	public void register_test() {
		String email = "test@gmail.com";
		String password = "password";
		String fname = "John";
		String lname = "James";

		UsersController u = new UsersController();
		Users newUser = u.register(email, password, fname, lname);
		assertEquals(newUser.getFname(), fname);
	}
}