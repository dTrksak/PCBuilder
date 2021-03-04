package com.pcbuilder.controllers;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pcbuilder.entities.CpuCooler;
import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.CpuCoolerRepository;

@Controller
@RequestMapping("/cpucoolers")
public class CpuCoolerController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "helloWorld.html";
	}
	
	@Autowired
	private CpuCoolerRepository cpuCoolerRepo;
	
	@GetMapping("/hi")
	@ResponseBody
	public List<CpuCooler> list() {
		List<CpuCooler> cpuList = cpuCoolerRepo.findAll();
		for(CpuCooler cpu: cpuList) {
			//Hibernate.initialize(cpu.getProduct().getCaseAccessories());
			//cpu.getProduct().get
			//Hibernate.initialize(cpu.getProduct());
		}
		return cpuList;
	}
}