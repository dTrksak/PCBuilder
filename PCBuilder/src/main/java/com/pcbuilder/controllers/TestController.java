package com.pcbuilder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.ProductRepository;

/*
 * Use for various testing purposes
 * 
 */
@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("")
	public Page<Product> test(){
	    Pageable paging = PageRequest.of(0, 100, Sort.by("productName").ascending());
	    //Page<Product> temp = productRepo.findByProductPrice(0, paging);
	    Page<Product> temp = productRepo.findAll(paging);
	    System.out.println("tempSize= " + temp.getSize());
		return temp;
	}
}
