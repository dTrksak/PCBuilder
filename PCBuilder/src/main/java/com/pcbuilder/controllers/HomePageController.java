package com.pcbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	
	@RequestMapping("/")
	public String index() {
		//replace "blank.html" with homepage html file name
		//"blank.html" located in src/main/resources/templates
		return "index.html";
	}
	
	//this can be removed once a homepage has been created
	@RequestMapping("/index")
	public String index2() {
		return "index.html";
	}
	
	//used to test non-mapped templates
	@RequestMapping("/{page}")
	public String getPage(@PathVariable String page) {
		return page + ".html";
	}
}
