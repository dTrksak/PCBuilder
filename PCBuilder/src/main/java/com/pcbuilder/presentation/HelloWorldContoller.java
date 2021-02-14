package com.pcbuilder.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldContoller {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "helloWorld.html";
	}
}
