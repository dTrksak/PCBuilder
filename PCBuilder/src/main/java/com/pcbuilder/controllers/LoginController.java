package com.pcbuilder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/login")
 	public String loginForm(Model model) {
	 	 										//adds a th:object="${user}" in login.html
		model.addAttribute("user", new User());	//th:object="${user}" in login.html is a User entity. 
	 											//th:fields="*{email}" is the instance variable in the User entity
		return "login"; //=login.html in src/main/resources/templates
  	}

	@PostMapping("/login")
  	public String userCredentialValidation(@ModelAttribute User input, Model model) {
		//Find user with email
		User user = userRepo.findByEmail(input.getEmail());
		
		//if has user with same email
		if(user != null) {
			//if user with same email has same password has the entered password
			if(user.getPassword().equals(input.getPassword())) {
				//pass some variables firstName and lastName to loginSuccess.html
				//firstName = user.getFirstName(), lastName = user.getLastName
		  		model.addAttribute("firstName", user.getFirstName());
		  		model.addAttribute("lastName", user.getLastName());
		  		
		  		//return loginSuccess.html page on the same url /login
		  		return "login_success"; //=login_success.html
			}
		}
		return "login_fail"; //=login_fail.html
  	}
}