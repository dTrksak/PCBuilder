/*
package com.pcbuilder.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pcbuilder.entities.Build;
import com.pcbuilder.entities.BuildProduct;
import com.pcbuilder.entities.Cpu;
import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.MotherboardRepository;
import com.pcbuilder.repositories.CpuRepository;
import com.pcbuilder.repositories.ProductRepository;
import com.pcbuilder.repositories.BuildProductRepository;

public class BuildFunctions {
	
	private BuildProductRepository buildProductRepo;
	private ProductRepository productRepo;
	private CpuRepository cpuRepo;
	
	//Should only be called when a part is removed
	public void SetCompatibilityVariables(Build build)
	{
		List<BuildProduct> buildList = buildProductRepo.findByBuildId(build.getBuildId());
		
		for(BuildProduct b : buildList)
		{
			Product p = b.getProduct();
			switch(p.getCategory().getCategoryName().toLowerCase())
			{
	            case "cpu":
	            	Cpu cpu = cpuRepo.findByCpuId(p.getProductId());
	            	SetCpuCompatibility(cpu, build);
	            	break;
	            case "cpu+cooler":
	                
	            case "memory":
	            	
	            case "motherboard":
	            	
	            case "os":
	            	
	            case "pc+case":
	            	
	            case "power+supply":
	            	
	            case "storage":
	            	
	            case "psu":
	            	
	            case "video+card":
	            	
	            default:
	            	
			}
		}
	}
	
	public List<Integer> CheckCompatibility(Build build)
	{
		return null;
	}
	
	private void SetCpuCompatibility(Cpu cpu, Build build)
	{
		String socketType = cpu.getSocketType();
		int tdp = cpu.getTdpWattage();
		String mode = cpu.getMode();
	}
}
*/