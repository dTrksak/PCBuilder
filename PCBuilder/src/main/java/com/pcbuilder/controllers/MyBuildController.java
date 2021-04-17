package com.pcbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyBuildController {
	
	@GetMapping("/myBuild")
	public String myBuild() {
		return "myBuilds_table";
	}
}
