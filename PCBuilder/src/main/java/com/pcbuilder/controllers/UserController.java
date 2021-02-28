package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@GetMapping("/all")
	public List<User> list(){
		return userRepo.findAll();
	}

	@GetMapping("/one")
	public String get() {
		return "Hello World HEllo World";
	}
	
	@GetMapping("{id}")
	public User get(@PathVariable int id) {
		return userRepo.getOne(id);
	}
}
