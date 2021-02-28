package com.pcbuilder.presentation.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseTest {
	
	@RequestMapping("/data")
	public String allUsers() {
		return "All users from database pc_builder: " + new ConnectionTest().getUsers();
	}
}
