package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.CpuCooler;
import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.CpuCoolerRepository;
import com.pcbuilder.repositories.UserRepository;
/**
 * Not Used at this moment
 * 
 * 
 * 
 * 
 */
@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@GetMapping("/account")
	public String account() {
		return "account1";
	}
	/*
	@GetMapping("/{firstName}+{lastName}")
	@ResponseBody
	public String get(@PathVariable String firstName, @PathVariable String lastName) {
		
		//demostration of springboot AND
		User user = userRepo.findByFirstNameAndLastName(firstName, lastName);
		if(user != null)
			return user.toString();
		return "\"" + firstName + " " + lastName + "\" was not found.";
	}*/
}