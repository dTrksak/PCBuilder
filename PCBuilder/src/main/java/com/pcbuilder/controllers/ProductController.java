package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Product> list(){
		return productRepo.findAll();
	}
	
	@GetMapping("/cpuCoolers")
	@ResponseBody
	public List<Product> caseAccessories(){
		Product product = productRepo.findByProductId(280101);
		return productRepo.findAll();
	}
}
