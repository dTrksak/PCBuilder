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
public class RegisterController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/register")
 	public String registerForm(Model model) {
	 	 										//adds a th:object="${user}" in login.html
		model.addAttribute("user", new User());	//th:object="${user}" in register.html is a User entity. 
	 											//th:fields="*{email}" is the instance variable in the User entity
		return "register"; //=register.html in src/main/resources/templates
  	}

	@PostMapping("/register")
  	public String registerValidation(@ModelAttribute User input, Model model){
		//Find user with email
		User user = userRepo.findByEmail(input.getEmail());
		
		//if has user with same email
		if(user != null) {
		  	return "register_fail"; //=register_fail.html
		}
		
		userRepo.save(input);
		model.addAttribute("email", input.getEmail());
		model.addAttribute("firstName", input.getFirstName());
		model.addAttribute("lastName", input.getLastName());
	
		return "register_success"; //=register_success.html
  	}
}