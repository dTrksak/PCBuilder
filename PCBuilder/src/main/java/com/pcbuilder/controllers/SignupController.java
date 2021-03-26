package com.pcbuilder.controllers;

import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.UserRepository;

@Controller
public class SignupController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/signup")
 	public String signupForm(Model model) {
	 	 										//adds a th:object="${user}" in login.html
		model.addAttribute("user", new User());	//th:object="${user}" in login.html is a User entity. 
	 											//th:fields="*{email}" is the instance variable in the User entity
		return "signup"; //=login.html in src/main/resources/templates
  	}

	@PostMapping("/signup")
  	public String signupValidation(@ModelAttribute User input, Model model){
		//Find user with email
		User user = userRepo.findByEmail(input.getEmail());
		
		//if has user with same email
		if(user != null) {
		  	return "signup_fail"; //=signup_fail.html
		}
		
		userRepo.save(input);
		model.addAttribute("email", input.getEmail());
		model.addAttribute("firstName", input.getFirstName());
		model.addAttribute("lastName", input.getLastName());
	
		return "signup_success"; //=signup_success.html
  	}
}