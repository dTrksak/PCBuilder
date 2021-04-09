package com.pcbuilder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pcbuilder.entities.Product;
import com.pcbuilder.repositories.CaseAccessoryRepository;
import com.pcbuilder.repositories.CaseFanRepository;
import com.pcbuilder.repositories.CategoryRepository;
import com.pcbuilder.repositories.CpuCoolerRepository;
import com.pcbuilder.repositories.CpuRepository;
import com.pcbuilder.repositories.ExternalHarddriveRepository;
import com.pcbuilder.repositories.FanControllerRepository;
import com.pcbuilder.repositories.HeadphonesRepository;
import com.pcbuilder.repositories.InternalHarddriveRepository;
import com.pcbuilder.repositories.KeyboardRepository;
import com.pcbuilder.repositories.MemoryRepository;
import com.pcbuilder.repositories.MonitorRepository;
import com.pcbuilder.repositories.MotherboardRepository;
import com.pcbuilder.repositories.MouseRepository;
import com.pcbuilder.repositories.OpticalDriveRepository;
import com.pcbuilder.repositories.OsRepository;
import com.pcbuilder.repositories.PcCaseRepository;
import com.pcbuilder.repositories.PowerSupplyRepository;
import com.pcbuilder.repositories.ProductRepository;
import com.pcbuilder.repositories.SoftwareRepository;
import com.pcbuilder.repositories.SoundCardRepository;
import com.pcbuilder.repositories.ThermalPasteRepository;
import com.pcbuilder.repositories.UpsRepository;
import com.pcbuilder.repositories.VideoCardRepository;
import com.pcbuilder.repositories.WiredNetworkCardRepository;
import com.pcbuilder.repositories.WirelessNetworkCardRepository;

/*
 * Handles all things related to Products
 * 
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private CaseAccessoryRepository caseAccessoryRepo;
	@Autowired
	private CaseFanRepository caseFanRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	@Autowired
	private CpuRepository cpuRepo;
	@Autowired
	private CpuCoolerRepository cpuCoolerRepo;
	@Autowired
	private ExternalHarddriveRepository externalHarddriveRepo;
	@Autowired
	private FanControllerRepository fanControllerRepo;
	@Autowired
	private HeadphonesRepository headphoneRepo;
	@Autowired
	private InternalHarddriveRepository internalHarddriveRepo;
	@Autowired
	private KeyboardRepository keyboardRepo;
	@Autowired
	private MemoryRepository memoryRepo;
	@Autowired
	private MonitorRepository monitorRepo;
	@Autowired
	private MotherboardRepository motherboardRepo;
	@Autowired
	private MouseRepository mouseRepo;
	@Autowired
	private OpticalDriveRepository opticalDriveRepo;
	@Autowired
	private OsRepository osRepo;
	@Autowired
	private PcCaseRepository pcCaseRepo;
	@Autowired
	private PowerSupplyRepository powerSupplyRepo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private SoftwareRepository softwareRepo;
	@Autowired
	private SoundCardRepository soundCardRepo;
	@Autowired
	private ThermalPasteRepository thermalPasteRepo;
	@Autowired
	private UpsRepository upsRepo;
	@Autowired
	private VideoCardRepository videoCardRepo;
	@Autowired
	private WiredNetworkCardRepository wiredNetworkCardRepo;
	@Autowired
	private WirelessNetworkCardRepository wirelessNetworkCardRepo;
	
	@GetMapping("")  // example url - "/product?category=motherboard" or "/partslistMobo?category=cpu+cooler"
	public String getPart( Model model,
			@RequestParam(value="category", required=true) String categoryName,
			@RequestParam(value="page", required=false, defaultValue = "1") String page, 
			@RequestParam(value="sortBy", required=false, defaultValue = "productName") String sortBy) {
		//List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName(categoryName));
		
		System.out.println("category=" + categoryName);
		categoryName = categoryName.replaceAll(" ", "+");
		/*
		if(product == null || product.isEmpty()) {
			model.addAttribute("productList", null);
			model.addAttribute("partList", null);
		}else {
			model.addAttribute("productList", product);
			//List<?> list = getPartInfo(categoryName);
			//System.out.println(getPartInfo(categoryName));
			model.addAttribute("partList", getPartInfo(categoryName));
		}*/
		model.addAttribute("partList", getPartInfo(categoryName));
		
		categoryName = categoryName.replaceAll(" ", "+");
		System.out.println("partslist" + getProductPage(categoryName));
		return "partslist" + getProductPage(categoryName);
	}

	public List<?> getPartInfo(String categoryName){
        switch(categoryName.toLowerCase())
        {
            case "case+accessory":
                return caseAccessoryRepo.findAll();
            case "case+fan":
                return caseFanRepo.findAll();
            case "cpu":
            	return cpuRepo.findAll();
            case "cpu+cooler":
                return cpuCoolerRepo.findAll();
            case "external+harddrive":
            	return externalHarddriveRepo.findAll();
            case "fan+controller":
            	return fanControllerRepo.findAll();
            case "headphone":
            	return headphoneRepo.findAll();
            case "internal+harddrive":
            	return internalHarddriveRepo.findAll();
            case "keyboard":
            	return keyboardRepo.findAll();
            case "memory":
            	return memoryRepo.findAll();
            case "monitor":
            	return monitorRepo.findAll();
            case "motherboard":
            	return motherboardRepo.findAll();
            case "mouse":
            	return mouseRepo.findAll();
            case "optical+drive":
            	return opticalDriveRepo.findAll();
            case "os":
            	return osRepo.findAll();
            case "pc+case":
            	return pcCaseRepo.findAll();
            case "power+supply":
            	return powerSupplyRepo.findAll();
            case "software":
            	return softwareRepo.findAll();
            case "sound+card":
            	return soundCardRepo.findAll();
            case "thermal+paste":
            	return thermalPasteRepo.findAll();
            case "ups":
            	return upsRepo.findAll();
            case "video+card":
            	return videoCardRepo.findAll();
            case "wired+network+card":
            	return wiredNetworkCardRepo.findAll();
            case "wireless+network+card":
            	return wirelessNetworkCardRepo.findAll();
            default:
            	return null;
        }
	}
	
	public String getProductPage(String categoryName){
        switch(categoryName.toLowerCase())
        {
            case "case+accessory":
                return "Case";
            case "case+fan":
                return "CaseFan";
            case "cpu":
            	return "Cpu";
            case "cpu+cooler":
                return "CpuCooler";
            case "external+harddrive":
            	return "External";
            case "fan+controller":
            	return "FanController";
            case "headphone":
            	return "Headphone";
            case "internal+harddrive":
            	return "Internal";
            case "keyboard":
            	return "Keyboard";
            case "memory":
            	return "Memory";
            case "monitor":
            	return "Monitor";
            case "motherboard":
            	return "Mobo";
            case "mouse":
            	return "Mouse";
            case "optical+drive":
            	return "OpticalDrive";
            case "os":
            	return "Os";
            case "pc+case":
            	return "PcCase";
            case "power+supply":
            	return "Psu";
            case "software":
            	return "Software";
            case "sound+card":
            	return "SoundCard";
            case "thermal+paste":
            	return "ThermalPaste";
            case "ups":
            	return "Ups";
            case "video+card":
            	return "VideoCard";
            case "wired+network+card":
            	return "WiredNetworkCard";
            case "wireless+network+card":
            	return "WirelessNetworkCard";
            default:
            	return "none";
        }
	}
	
	/* legacy code, for example
	@GetMapping("")
	@ResponseBody
	public List<Product> returnByCategory(@RequestParam(value="category", required=true) String categoryName) {
		List<Product> product = productRepo.findByCategory(categoryRepo.findByCategoryName(categoryName));
		if(product == null || product.isEmpty())
			return null;
		return product;
	}*/
}
