package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.CaseAccessory;
import com.pcbuilder.entities.Cpu;
import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.CaseAccessoryRepository;
import com.pcbuilder.repositories.CaseFanRepository;
import com.pcbuilder.repositories.CategoryRepository;
import com.pcbuilder.repositories.CpuCoolerRepository;
import com.pcbuilder.repositories.CpuRepository;
import com.pcbuilder.repositories.MotherboardRepository;
import com.pcbuilder.repositories.ProductRepository;

@Controller
@RequestMapping("/partslistMobo")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	

	@Autowired
	private CaseAccessoryRepository caseAccessoryRepo;
	@Autowired
	private CaseFanRepository caseFanRepo;
	@Autowired
	private CpuCoolerRepository cpuCoolerRepo;
	@Autowired
	private CpuRepository cpuRepo;
	/*
	 * missing other repositories
	 */
	@Autowired
	private MotherboardRepository motherboardRepo;
	/*
	 * missing other repositories
	 */
	
	
	/* legacy code, for example
	@GetMapping("")
	@ResponseBody
	public List<Product> returnByCategory(@RequestParam(value="category", required=true) String categoryName) {
		List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName(categoryName));
		if(product == null || product.isEmpty())
			return null;
		return product;
	}*/
	
	
	@GetMapping("")  // example url - "/partslistMobo?category=motherboard" or "/partslistMobo?category=cpu+cooler"
	public String getPart(@RequestParam(value="category", required=true) String categoryName, Model model) {
		List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName(categoryName));

		//System.out.println("/partlist1example?category=" + categoryName);
		if(product == null || product.isEmpty()) {
			model.addAttribute("partlist1", null);
			model.addAttribute("partList", null);
		}else {
			model.addAttribute("productList", product);
			List<?> list = getPartInfo(categoryName);
			model.addAttribute("partList", list);
		}
		
		return "partslistMobo";
	}
	
	//unfished, need to add all the respositories
	public List<?> getPartInfo(String categoryName){
        switch(categoryName.toLowerCase())
        {
            case "case+accessory":
                return caseAccessoryRepo.findAll();
            case "case+fan":
                return caseFanRepo.findAll();
            case "cpu+cooler":
                return cpuCoolerRepo.findAll();
            case "cpu":
            	return cpuRepo.findAll();
            case "motherboard":
            	return motherboardRepo.findAll();
            default:
            	return null;
        }
	}
}
