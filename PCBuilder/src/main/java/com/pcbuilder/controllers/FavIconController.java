package com.pcbuilder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * This class stops the annoying
 * error resolving template [favicon.ico.html]
 */
@Controller
public class FavIconController {
	
    @GetMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {
    	
    }
}
