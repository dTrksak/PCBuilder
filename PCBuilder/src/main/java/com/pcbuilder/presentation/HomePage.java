package com.pcbuilder.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

	@RequestMapping("/")
	public String index() {
		return "blank.html";
	}
	
	@RequestMapping("/index")
	public String index2() {
		return "blank.html";
	}
}
