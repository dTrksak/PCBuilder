package com.pcbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * This class stops the annoying
 * error resolving template [jumbotron.css.html]
 */
@Controller
public class JumbocssController {
	
    @GetMapping("jumbotron.css")
    @ResponseBody
    void returnNoFavicon() {
    	
    }
}