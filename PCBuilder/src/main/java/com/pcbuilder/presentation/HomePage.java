package com.pcbuilder.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

	@RequestMapping("/")
	public String index() {
		//replace "blank.html" with homepage html file name
		//"blank.html" located in src/main/resources/templates
		return "blank.html";
	}
	
	//this can be removed once a homepage has been created
	@RequestMapping("/index")
	public String index2() {
		return "blank.html";
	}
}