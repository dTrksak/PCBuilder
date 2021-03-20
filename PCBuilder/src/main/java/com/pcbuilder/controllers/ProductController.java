package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.CategoryRepository;
import com.pcbuilder.repositories.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Product> list(){
		return productRepo.findAll();
	}
	
	@GetMapping("/cpu")
	@ResponseBody
	public List<Product> cpu(){
		List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName("Cpu"));
		//System.out.println(product.getCpuCoolers().get(0).getCpuCoolerId());
		//List<CpuCooler> cpuList = product.getCpuCoolers();
		//System.out.println(cpuList.get(0));
		return product;
	}
	
	@GetMapping("")
	@ResponseBody
	public List<Product> returnByCategory(@RequestParam(value="category", required=true) String categoryName) {
		List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName(categoryName));
		if(product == null || product.isEmpty())
			return null;
		return product;
	}
}
