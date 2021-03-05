package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.CaseAccessory;
import com.pcbuilder.entities.CpuCooler;
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
	
	@GetMapping("/caseAccessories")
	@ResponseBody
	public List<Product> caseAccessories(){
		Product product = productRepo.findByProductId(280101);
		//System.out.println(product.getCpuCoolers().get(0).getCpuCoolerId());
		//List<CpuCooler> cpuList = product.getCpuCoolers();
		//System.out.println(cpuList.get(0));
		return productRepo.findAll();
	}
}
