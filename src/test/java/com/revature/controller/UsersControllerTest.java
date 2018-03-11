package com.revature.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.revature.beans.Users;

@TestInstance(Lifecycle.PER_CLASS)
public class UsersControllerTest {
	UsersController usersController;

	@BeforeAll
	public void init() {
		this.usersController = new UsersController();
	}

	@Test
	public void register_test() {
		String email = "test@gmail.com";
		String password = "bitconnect";
		String fname = "Trevon";
		String lname = "James";
		Users newUser = usersController.register(email, password, fname, lname);
		assertEquals(newUser.getFname(), fname);
	}
}