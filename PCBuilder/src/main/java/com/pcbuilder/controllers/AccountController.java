package com.pcbuilder.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class AccountController {
	
	@Autowired
	private UserRepository userRepo;

	private final String ACCOUNT_DIRECTORY = "/account";
	private User currentUser = new User();
	
	@GetMapping(ACCOUNT_DIRECTORY)
	public String account(Model model) {
		
		model.addAttribute("user", currentUser);
		
		return "account1";
	}
	
	
	/*
	 * CHANGE NAME
	 */
	@PostMapping(ACCOUNT_DIRECTORY + "/name")
	public String accountPostName(@ModelAttribute User user, Model model) {
		currentUser = userRepo.findByEmail(user.getEmail());
		
		model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_name";
	}
	
	@GetMapping(ACCOUNT_DIRECTORY + "/name")
	public String accountName() {
		//model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_name";
	}
	
	@PostMapping(ACCOUNT_DIRECTORY + "/name/submit")
	public String accountNameSubmit(@ModelAttribute User user) {
		currentUser.setFirstName(user.getFirstName());
		currentUser.setLastName(user.getLastName());
		userRepo.save(currentUser);
		
		return ACCOUNT_DIRECTORY + "/successful";
	}
	
	

	/*
	 * CHANGE EMAIL
	 */
	@PostMapping(ACCOUNT_DIRECTORY + "/email")
	public String accountPostEmail(@ModelAttribute User user, Model model) {
		currentUser = userRepo.findByEmail(user.getEmail());
		
		model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_email";
	}
	
	@GetMapping(ACCOUNT_DIRECTORY + "/email")
	public String accountEmail() {
		//model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_name";
	}
	
	@PostMapping(ACCOUNT_DIRECTORY + "/email/submit")
	public String accountEmailSubmit(@ModelAttribute User user) {
		currentUser.setEmail(user.getEmail());
		userRepo.save(currentUser);
		
		return ACCOUNT_DIRECTORY + "/successful";
	}
	
	
	/*
	 * CHANGE PASSWORD
	 */
	@PostMapping(ACCOUNT_DIRECTORY + "/password")
	public String accountPostPassword(@ModelAttribute User user, Model model) {
		currentUser = userRepo.findByEmail(user.getEmail());
		
		model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_password";
	}
	
	@GetMapping(ACCOUNT_DIRECTORY + "/password")
	public String accountPassword() {
		//System.out.println(model.getAttribute("password1"));
		return ACCOUNT_DIRECTORY + "/change_name";
	}
	
	@PostMapping(ACCOUNT_DIRECTORY + "/password/submit")
	public String accountPasswordSubmit(@ModelAttribute User user) {
		String psw1 = user.getFirstName();
		String psw2 = user.getLastName();
		
		if(psw1.equalsIgnoreCase(currentUser.getPassword())) {
			currentUser.setPassword(psw2);
			userRepo.save(currentUser);
			
			return ACCOUNT_DIRECTORY + "/successful";
		}
		return ACCOUNT_DIRECTORY + "/unsuccessful";
	}
	

	/*
	 * DELETE ACCOUNT
	 */
	@PostMapping(ACCOUNT_DIRECTORY + "/delete")
	public String accountPostDelete(@ModelAttribute User user) {
		currentUser = userRepo.findByEmail(user.getEmail());
		
		return ACCOUNT_DIRECTORY + "/delete_account";
	}
	
	@GetMapping(ACCOUNT_DIRECTORY + "/delete")
	public String accountDelete() {
		//model.addAttribute("user", currentUser);
		
		return ACCOUNT_DIRECTORY + "/change_name";
	}
	
	@PostMapping(ACCOUNT_DIRECTORY + "/delete/submit")
	public String accountDeleteSubmit(@ModelAttribute User user) {
		if(user.getFirstName().equalsIgnoreCase(currentUser.getEmail()) && user.getPassword().equalsIgnoreCase(currentUser.getPassword())) {
			userRepo.delete(currentUser);
			
			return "/logout";
		}
		
		return ACCOUNT_DIRECTORY + "/unsuccessful";
	}
}