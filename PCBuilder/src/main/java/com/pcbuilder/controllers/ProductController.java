package com.pcbuilder.controllers;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pcbuilder.entities.Build;
import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.Product;
import com.pcbuilder.entities.User;
import com.pcbuilder.repositories.BuildRepository;
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
import com.pcbuilder.repositories.UserRepository;
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
	@Autowired
	private BuildRepository buildRepository;
	@Autowired
	private UserRepository userRepository;
	
	private Build build = new Build();
	private User user = new User();
	
	public void saveBuild(String email, Integer buildId) {
		user = userRepository.findByEmail(email);
		this.build.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		this.build.setUpdatedData(new Timestamp(System.currentTimeMillis()));
		this.build.setUser(user);
		buildRepository.save(build);
	}
	
	@PostMapping("/clearBuild")
	public String clearBuild(@RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setTotalTdp(0);
		this.build.setMode(null);
		this.build.setVideoCardTdp(0);
		this.build.setRamGen(null);
		this.build.setFormFactor(null);
		this.build.setSocketType(null);
		this.build.setCpuTdp(0);
		System.out.println("\npower supply wattage: "+this.build.getTotalTdp()+"\nmode: "+this.build.getMode()+"\nvideo card tdp: "+this.build.getVideoCardTdp()+
				"\nram gen: "+this.build.getRamGen()+"\nsocket type: "+build.getSocketType()+"\nform factor:"+build.getFormFactor()+"\ncpu tdp: "+this.build.getCpuTdp()+"\n");
		this.build.setUser(null);
		saveBuild(email, buildId);
		
		return "/build1";
	}
	@PostMapping("/totalWattage")
	public String totalWattage(@RequestParam int totalWattage, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setTotalTdp(totalWattage);
		System.out.println("power supply wattage: "+this.build.getTotalTdp()+"\n");
		this.build.setUser(null);
		saveBuild(email, buildId);
		
		return "/build1";
	}
	@PostMapping("/mode")
	public String osType(@RequestParam String mode, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setMode(mode);
		System.out.println("mode: "+this.build.getMode()+"\n");
		this.build.setUser(null);
		saveBuild(email, buildId);
		
		return "/build1";
	}
	@PostMapping("/videoCardTdp")
	public String videoCardTdp(@RequestParam Integer videoCardTdp, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setVideoCardTdp(videoCardTdp);
		System.out.println("video card tdp: "+this.build.getVideoCardTdp()+"\n");
		saveBuild(email, buildId);

		return "/build1";
	}
	@PostMapping("/ramGen")
	public String ramGen(@RequestParam String ramGen, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setRamGen(ramGen);
		System.out.println("ram gen: "+this.build.getRamGen()+"\n");
		saveBuild(email, buildId);

		return "/build1";
	}
	@PostMapping("/ramSlots")
	public String ramSlots(@RequestParam String socketType, @RequestParam String ramGen, @RequestParam String formFactor, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setSocketType(socketType);
		this.build.setRamGen(ramGen);
		this.build.setFormFactor(formFactor);
		System.out.println("socket type: "+build.getSocketType()+"\nram gen:"+build.getRamGen()+"\nform factor:"+build.getFormFactor()+"\n");
		saveBuild(email, buildId);
		
		return "/build1";
	}
	@PostMapping("/formFactor")
	public String formFactor(@RequestParam String formFactor, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setFormFactor(formFactor);
		System.out.println("form factor: "+this.build.getFormFactor()+"\n");
		saveBuild(email, buildId);

		return "/build1";
	}
	@PostMapping("/socketType")
	public String socketType(@RequestParam String socketType, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setSocketType(socketType);
		System.out.println("socket type: "+this.build.getSocketType()+"\n");
		saveBuild(email, buildId);

		return "/build1";
	}

	@PostMapping("/cpuTdp")
	public String cpuTdp(@RequestParam Integer cpuTdp, @RequestParam String socketType, @RequestParam String mode, @RequestParam String email, @RequestParam Integer buildId) {
		this.build = buildRepository.findByBuildId(buildId);
		this.build.setCpuTdp(cpuTdp);
		this.build.setSocketType(socketType);
		this.build.setMode(mode);
		System.out.println("cpu tdp: "+this.build.getCpuTdp()+"\nsocket type: "+this.build.getSocketType()+"\nmode: "+this.build.getMode());
		saveBuild(email, buildId);

		return "/build1";
	}
	
	@GetMapping("")  // example url - "/product?category=motherboard" or "/partslistMobo?category=cpu+cooler"
	public String getPart( Model model,
			@RequestParam(value="category", required=true) String categoryName,
			@RequestParam(value="page", required=false, defaultValue = "0") String pageNum, 
			@RequestParam(value="sortBy", required=false, defaultValue = "product.productName") String sortBy, 
			@RequestParam(value="sortOrder", required=false, defaultValue = "asc") String sortOrder, 
			@RequestParam(value="amt", required=false, defaultValue = "100") String amt) {
		//System.out.println("category=" + categoryName);
		categoryName = categoryName.replaceAll(" ", "+");
		int page = Integer.valueOf(pageNum);
		int pageSize = Integer.valueOf(amt);
		
		Pageable pageable = null;
		if(sortOrder.equals("asc"))
			pageable = PageRequest.of(page, pageSize, Sort.by(sortBy).ascending());
		if(sortOrder.equals("des"))
			pageable = PageRequest.of(page, pageSize, Sort.by(sortBy).descending());

		model.addAttribute("build", build);
		model.addAttribute("page", page);
		model.addAttribute("pages", getPartInfo(categoryName, pageable).getTotalPages());
		model.addAttribute("partList", getPartInfo(categoryName, pageable).toList());
		
		categoryName = categoryName.replaceAll(" ", "+");
		//System.out.println("partslist" + getProductPage(categoryName));
		
		return "partslist" + getProductPage(categoryName);
	}

	public Page<?> getPartInfo(String categoryName, Pageable pageable){
        switch(categoryName.toLowerCase())
        {
            case "case+accessory":
                return caseAccessoryRepo.findAll(pageable);
            case "case+fan":
                return caseFanRepo.findAll(pageable);
            case "cpu":
            	return cpuRepo.findByCompatibility(build.getVideoCardTdp(), build.getTotalTdp(), build.getSocketType(), build.getMode(), pageable);
            case "cpu+cooler":
                return cpuCoolerRepo.findByCompatibility(build.getSocketType(), pageable);
            case "external+harddrive":
            	return externalHarddriveRepo.findAll(pageable);
            case "fan+controller":
            	return fanControllerRepo.findAll(pageable);
            case "headphone":
            	return headphoneRepo.findAll(pageable);
            case "internal+harddrive":
            	return internalHarddriveRepo.findAll(pageable);
            case "keyboard":
            	return keyboardRepo.findAll(pageable);
            case "memory":
            	return memoryRepo.findByCompatibility(build.getRamGen(), pageable);
            case "monitor":
            	return monitorRepo.findAll(pageable);
            case "motherboard":
            	return motherboardRepo.findByCompatibility(build.getSocketType(), build.getRamGen(), build.getFormFactor(), pageable);
            case "mouse":
            	return mouseRepo.findAll(pageable);
            case "optical+drive":
            	return opticalDriveRepo.findAll(pageable);
            case "os":
            	return osRepo.findByCompatibility(build.getMode(), pageable);
            case "pc+case":
            	return pcCaseRepo.findByCompatibility(build.getFormFactor(), pageable);
            case "power+supply":
            	return powerSupplyRepo.findByCompatibility(build.getVideoCardTdp(), build.getCpuTdp(), pageable);
            case "software":
            	return softwareRepo.findAll(pageable);
            case "sound+card":
            	return soundCardRepo.findAll(pageable);
            case "thermal+paste":
            	return thermalPasteRepo.findAll(pageable);
            case "ups":
            	return upsRepo.findAll(pageable);
            case "video+card":
            	return videoCardRepo.findByCompatibility(build.getCpuTdp(), build.getTotalTdp(), pageable);
            case "wired+network+card":
            	return wiredNetworkCardRepo.findAll(pageable);
            case "wireless+network+card":
            	return wirelessNetworkCardRepo.findAll(pageable);
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

