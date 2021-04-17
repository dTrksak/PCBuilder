package com.pcbuilder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pcbuilder.repositories.BuildRepository;
import com.pcbuilder.repositories.UserRepository;

@Controller
public class BuildController {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BuildRepository buildRepo;
	
	@GetMapping("/build")
	public String buildPage() {
		return "build1";
	}
}
