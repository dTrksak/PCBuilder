package com.pcbuilder.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mysql.ConnectionTest;

@RestController
public class DatabaseTest {
	
	@RequestMapping("/data")
	public String allUsers() {
		return "All users from database pc_builder: " + new ConnectionTest().getUsers();
	}
}
