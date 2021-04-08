package com.pcbuilder.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	private int productId;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_price")
	private Double productPrice;

	//bi-directional many-to-one association to BuildProduct
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<BuildProduct> buildProducts;

	//bi-directional many-to-one association to CaseAccessory
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<CaseAccessory> caseAccessories;

	//bi-directional many-to-one association to CaseFan
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<CaseFan> caseFans;

	//bi-directional many-to-one association to Cpu
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Cpu> cpus;

	//bi-directional many-to-one association to CpuCooler
	@JsonIgnore
	@OneToMany( mappedBy="product")
	private List<CpuCooler> cpuCoolers;

	//bi-directional many-to-one association to ExternalHarddrive
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<ExternalHarddrive> externalHarddrives;

	//bi-directional many-to-one association to FanController
	@JsonIgnore
	@OneToMany( mappedBy="product")
	private List<FanController> fanControllers;

	//bi-directional many-to-one association to Headphone
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Headphone> headphones;

	//bi-directional many-to-one association to InternalHarddrive
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<InternalHarddrive> internalHarddrives;

	//bi-directional many-to-one association to Keyboard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Keyboard> keyboards;

	//bi-directional many-to-one association to Memory
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Memory> memories;

	//bi-directional many-to-one association to Monitor
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Monitor> monitors;

	//bi-directional many-to-one association to Motherboard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Motherboard> motherboards;

	//bi-directional many-to-one association to Mouse
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Mouse> mouses;

	//bi-directional many-to-one association to OpticalDrive
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<OpticalDrive> opticalDrives;

	//bi-directional many-to-one association to O
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Os> os;

	//bi-directional many-to-one association to PcCase
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<PcCase> pcCases;

	//bi-directional many-to-one association to PowerSupply
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<PowerSupply> powerSupplies;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	//bi-directional many-to-one association to Software
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Software> softwares;

	//bi-directional many-to-one association to SoundCard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<SoundCard> soundCards;

	//bi-directional many-to-one association to Speaker
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Speaker> speakers;

	//bi-directional many-to-one association to ThermalPaste
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<ThermalPaste> thermalPastes;

	//bi-directional many-to-one association to Up
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<Ups> ups;

	//bi-directional many-to-one association to VideoCard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<VideoCard> videoCards;

	//bi-directional many-to-one association to WiredNetworkCard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<WiredNetworkCard> wiredNetworkCards;

	//bi-directional many-to-one association to WirelessNetworkCard
	@JsonIgnore
	@OneToMany(mappedBy="product")
	private List<WirelessNetworkCard> wirelessNetworkCards;

	public Product() {
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	
	public List<BuildProduct> getBuildProducts() {
		return this.buildProducts;
	}

	public void setBuildProducts(List<BuildProduct> buildProducts) {
		this.buildProducts = buildProducts;
	}

	public BuildProduct addBuildProduct(BuildProduct buildProduct) {
		getBuildProducts().add(buildProduct);
		buildProduct.setProduct(this);

		return buildProduct;
	}

	public BuildProduct removeBuildProduct(BuildProduct buildProduct) {
		getBuildProducts().remove(buildProduct);
		buildProduct.setProduct(null);

		return buildProduct;
	}

	public List<CaseAccessory> getCaseAccessories() {
		return this.caseAccessories;
	}

	public void setCaseAccessories(List<CaseAccessory> caseAccessories) {
		this.caseAccessories = caseAccessories;
	}

	public CaseAccessory addCaseAccessory(CaseAccessory caseAccessory) {
		getCaseAccessories().add(caseAccessory);
		caseAccessory.setProduct(this);

		return caseAccessory;
	}

	public CaseAccessory removeCaseAccessory(CaseAccessory caseAccessory) {
		getCaseAccessories().remove(caseAccessory);
		caseAccessory.setProduct(null);

		return caseAccessory;
	}

	public List<CaseFan> getCaseFans() {
		return this.caseFans;
	}

	public void setCaseFans(List<CaseFan> caseFans) {
		this.caseFans = caseFans;
	}

	public CaseFan addCaseFan(CaseFan caseFan) {
		getCaseFans().add(caseFan);
		caseFan.setProduct(this);

		return caseFan;
	}

	public CaseFan removeCaseFan(CaseFan caseFan) {
		getCaseFans().remove(caseFan);
		caseFan.setProduct(null);

		return caseFan;
	}

	public List<Cpu> getCpus() {
		return this.cpus;
	}

	public void setCpus(List<Cpu> cpus) {
		this.cpus = cpus;
	}

	public Cpu addCpus(Cpu cpus) {
		getCpus().add(cpus);
		cpus.setProduct(this);

		return cpus;
	}

	public Cpu removeCpus(Cpu cpus) {
		getCpus().remove(cpus);
		cpus.setProduct(null);

		return cpus;
	}

	public List<CpuCooler> getCpuCoolers() {
		return this.cpuCoolers;
	}

	public void setCpuCoolers(List<CpuCooler> cpuCoolers) {
		this.cpuCoolers = cpuCoolers;
	}

	public CpuCooler addCpuCooler(CpuCooler cpuCooler) {
		getCpuCoolers().add(cpuCooler);
		cpuCooler.setProduct(this);

		return cpuCooler;
	}

	public CpuCooler removeCpuCooler(CpuCooler cpuCooler) {
		getCpuCoolers().remove(cpuCooler);
		cpuCooler.setProduct(null);

		return cpuCooler;
	}

	public List<ExternalHarddrive> getExternalHarddrives() {
		return this.externalHarddrives;
	}

	public void setExternalHarddrives(List<ExternalHarddrive> externalHarddrives) {
		this.externalHarddrives = externalHarddrives;
	}

	public ExternalHarddrive addExternalHarddrive(ExternalHarddrive externalHarddrive) {
		getExternalHarddrives().add(externalHarddrive);
		externalHarddrive.setProduct(this);

		return externalHarddrive;
	}

	public ExternalHarddrive removeExternalHarddrive(ExternalHarddrive externalHarddrive) {
		getExternalHarddrives().remove(externalHarddrive);
		externalHarddrive.setProduct(null);

		return externalHarddrive;
	}

	public List<FanController> getFanControllers() {
		return this.fanControllers;
	}

	public void setFanControllers(List<FanController> fanControllers) {
		this.fanControllers = fanControllers;
	}

	public FanController addFanController(FanController fanController) {
		getFanControllers().add(fanController);
		fanController.setProduct(this);

		return fanController;
	}

	public FanController removeFanController(FanController fanController) {
		getFanControllers().remove(fanController);
		fanController.setProduct(null);

		return fanController;
	}

	public List<Headphone> getHeadphones() {
		return this.headphones;
	}

	public void setHeadphones(List<Headphone> headphones) {
		this.headphones = headphones;
	}

	public Headphone addHeadphone(Headphone headphone) {
		getHeadphones().add(headphone);
		headphone.setProduct(this);

		return headphone;
	}

	public Headphone removeHeadphone(Headphone headphone) {
		getHeadphones().remove(headphone);
		headphone.setProduct(null);

		return headphone;
	}

	public List<InternalHarddrive> getInternalHarddrives() {
		return this.internalHarddrives;
	}

	public void setInternalHarddrives(List<InternalHarddrive> internalHarddrives) {
		this.internalHarddrives = internalHarddrives;
	}

	public InternalHarddrive addInternalHarddrive(InternalHarddrive internalHarddrive) {
		getInternalHarddrives().add(internalHarddrive);
		internalHarddrive.setProduct(this);

		return internalHarddrive;
	}

	public InternalHarddrive removeInternalHarddrive(InternalHarddrive internalHarddrive) {
		getInternalHarddrives().remove(internalHarddrive);
		internalHarddrive.setProduct(null);

		return internalHarddrive;
	}

	public List<Keyboard> getKeyboards() {
		return this.keyboards;
	}

	public void setKeyboards(List<Keyboard> keyboards) {
		this.keyboards = keyboards;
	}

	public Keyboard addKeyboard(Keyboard keyboard) {
		getKeyboards().add(keyboard);
		keyboard.setProduct(this);

		return keyboard;
	}

	public Keyboard removeKeyboard(Keyboard keyboard) {
		getKeyboards().remove(keyboard);
		keyboard.setProduct(null);

		return keyboard;
	}

	public List<Memory> getMemories() {
		return this.memories;
	}

	public void setMemories(List<Memory> memories) {
		this.memories = memories;
	}

	public Memory addMemory(Memory memory) {
		getMemories().add(memory);
		memory.setProduct(this);

		return memory;
	}

	public Memory removeMemory(Memory memory) {
		getMemories().remove(memory);
		memory.setProduct(null);

		return memory;
	}

	public List<Monitor> getMonitors() {
		return this.monitors;
	}

	public void setMonitors(List<Monitor> monitors) {
		this.monitors = monitors;
	}

	public Monitor addMonitor(Monitor monitor) {
		getMonitors().add(monitor);
		monitor.setProduct(this);

		return monitor;
	}

	public Monitor removeMonitor(Monitor monitor) {
		getMonitors().remove(monitor);
		monitor.setProduct(null);

		return monitor;
	}

	public List<Motherboard> getMotherboards() {
		return this.motherboards;
	}

	public void setMotherboards(List<Motherboard> motherboards) {
		this.motherboards = motherboards;
	}

	public Motherboard addMotherboard(Motherboard motherboard) {
		getMotherboards().add(motherboard);
		motherboard.setProduct(this);

		return motherboard;
	}

	public Motherboard removeMotherboard(Motherboard motherboard) {
		getMotherboards().remove(motherboard);
		motherboard.setProduct(null);

		return motherboard;
	}

	public List<Mouse> getMouses() {
		return this.mouses;
	}

	public void setMouses(List<Mouse> mouses) {
		this.mouses = mouses;
	}

	public Mouse addMous(Mouse mous) {
		getMouses().add(mous);
		mous.setProduct(this);

		return mous;
	}

	public Mouse removeMous(Mouse mous) {
		getMouses().remove(mous);
		mous.setProduct(null);

		return mous;
	}

	public List<OpticalDrive> getOpticalDrives() {
		return this.opticalDrives;
	}

	public void setOpticalDrives(List<OpticalDrive> opticalDrives) {
		this.opticalDrives = opticalDrives;
	}

	public OpticalDrive addOpticalDrive(OpticalDrive opticalDrive) {
		getOpticalDrives().add(opticalDrive);
		opticalDrive.setProduct(this);

		return opticalDrive;
	}

	public OpticalDrive removeOpticalDrive(OpticalDrive opticalDrive) {
		getOpticalDrives().remove(opticalDrive);
		opticalDrive.setProduct(null);

		return opticalDrive;
	}

	public List<Os> getOs() {
		return this.os;
	}

	public void setOs(List<Os> os) {
		this.os = os;
	}

	public Os addO(Os os) {
		getOs().add(os);
		os.setProduct(this);

		return os;
	}

	public Os removeO(Os os) {
		getOs().remove(os);
		os.setProduct(null);

		return os;
	}

	public List<PcCase> getPcCases() {
		return this.pcCases;
	}

	public void setPcCases(List<PcCase> pcCases) {
		this.pcCases = pcCases;
	}

	public PcCase addPcCas(PcCase pcCas) {
		getPcCases().add(pcCas);
		pcCas.setProduct(this);

		return pcCas;
	}

	public PcCase removePcCas(PcCase pcCas) {
		getPcCases().remove(pcCas);
		pcCas.setProduct(null);

		return pcCas;
	}

	public List<PowerSupply> getPowerSupplies() {
		return this.powerSupplies;
	}

	public void setPowerSupplies(List<PowerSupply> powerSupplies) {
		this.powerSupplies = powerSupplies;
	}

	public PowerSupply addPowerSupply(PowerSupply powerSupply) {
		getPowerSupplies().add(powerSupply);
		powerSupply.setProduct(this);

		return powerSupply;
	}

	public PowerSupply removePowerSupply(PowerSupply powerSupply) {
		getPowerSupplies().remove(powerSupply);
		powerSupply.setProduct(null);

		return powerSupply;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Software> getSoftwares() {
		return this.softwares;
	}

	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}

	public Software addSoftware(Software software) {
		getSoftwares().add(software);
		software.setProduct(this);

		return software;
	}

	public Software removeSoftware(Software software) {
		getSoftwares().remove(software);
		software.setProduct(null);

		return software;
	}

	public List<SoundCard> getSoundCards() {
		return this.soundCards;
	}

	public void setSoundCards(List<SoundCard> soundCards) {
		this.soundCards = soundCards;
	}

	public SoundCard addSoundCard(SoundCard soundCard) {
		getSoundCards().add(soundCard);
		soundCard.setProduct(this);

		return soundCard;
	}

	public SoundCard removeSoundCard(SoundCard soundCard) {
		getSoundCards().remove(soundCard);
		soundCard.setProduct(null);

		return soundCard;
	}

	public List<Speaker> getSpeakers() {
		return this.speakers;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}

	public Speaker addSpeaker(Speaker speaker) {
		getSpeakers().add(speaker);
		speaker.setProduct(this);

		return speaker;
	}

	public Speaker removeSpeaker(Speaker speaker) {
		getSpeakers().remove(speaker);
		speaker.setProduct(null);

		return speaker;
	}

	public List<ThermalPaste> getThermalPastes() {
		return this.thermalPastes;
	}

	public void setThermalPastes(List<ThermalPaste> thermalPastes) {
		this.thermalPastes = thermalPastes;
	}

	public ThermalPaste addThermalPaste(ThermalPaste thermalPaste) {
		getThermalPastes().add(thermalPaste);
		thermalPaste.setProduct(this);

		return thermalPaste;
	}

	public ThermalPaste removeThermalPaste(ThermalPaste thermalPaste) {
		getThermalPastes().remove(thermalPaste);
		thermalPaste.setProduct(null);

		return thermalPaste;
	}

	public List<Ups> getUps() {
		return this.ups;
	}

	public void setUps(List<Ups> ups) {
		this.ups = ups;
	}

	public Ups addUp(Ups up) {
		getUps().add(up);
		up.setProduct(this);

		return up;
	}

	public Ups removeUp(Ups up) {
		getUps().remove(up);
		up.setProduct(null);

		return up;
	}

	public List<VideoCard> getVideoCards() {
		return this.videoCards;
	}

	public void setVideoCards(List<VideoCard> videoCards) {
		this.videoCards = videoCards;
	}

	public VideoCard addVideoCard(VideoCard videoCard) {
		getVideoCards().add(videoCard);
		videoCard.setProduct(this);

		return videoCard;
	}

	public VideoCard removeVideoCard(VideoCard videoCard) {
		getVideoCards().remove(videoCard);
		videoCard.setProduct(null);

		return videoCard;
	}

	public List<WiredNetworkCard> getWiredNetworkCards() {
		return this.wiredNetworkCards;
	}

	public void setWiredNetworkCards(List<WiredNetworkCard> wiredNetworkCards) {
		this.wiredNetworkCards = wiredNetworkCards;
	}

	public WiredNetworkCard addWiredNetworkCard(WiredNetworkCard wiredNetworkCard) {
		getWiredNetworkCards().add(wiredNetworkCard);
		wiredNetworkCard.setProduct(this);

		return wiredNetworkCard;
	}

	public WiredNetworkCard removeWiredNetworkCard(WiredNetworkCard wiredNetworkCard) {
		getWiredNetworkCards().remove(wiredNetworkCard);
		wiredNetworkCard.setProduct(null);

		return wiredNetworkCard;
	}

	public List<WirelessNetworkCard> getWirelessNetworkCards() {
		return this.wirelessNetworkCards;
	}

	public void setWirelessNetworkCards(List<WirelessNetworkCard> wirelessNetworkCards) {
		this.wirelessNetworkCards = wirelessNetworkCards;
	}

	public WirelessNetworkCard addWirelessNetworkCard(WirelessNetworkCard wirelessNetworkCard) {
		getWirelessNetworkCards().add(wirelessNetworkCard);
		wirelessNetworkCard.setProduct(this);

		return wirelessNetworkCard;
	}

	public WirelessNetworkCard removeWirelessNetworkCard(WirelessNetworkCard wirelessNetworkCard) {
		getWirelessNetworkCards().remove(wirelessNetworkCard);
		wirelessNetworkCard.setProduct(null);

		return wirelessNetworkCard;
	}

}