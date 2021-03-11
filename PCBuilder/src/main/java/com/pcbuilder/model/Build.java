package com.pcbuilder.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Build {
	
	String name = "";
	int build_id = BuildManager.getNextBuildId();
	int user_id = -1;
	Date created_date = null;
	Date updated_date = null;
	
	List<Integer> partCase 					= null;
	List<Integer> partCaseAccessory 		= null;
	List<Integer> partCaseFan 				= null;
	List<Integer> partCPU			 		= null;
	List<Integer> partCPUCooler 			= null;
	List<Integer> partExternalHardDrive 	= null;
	List<Integer> partFanController 		= null;
	List<Integer> partHeadphones 			= null;
	List<Integer> partInternalHardDrive 	= null;
	List<Integer> partKeyboard 				= null;
	List<Integer> partMemory 				= null;
	List<Integer> partMonitor 				= null;
	List<Integer> partMotherboard 			= null;
	List<Integer> partMouse 				= null;
	List<Integer> partOpticalDrive 			= null;
	List<Integer> partOS 					= null;
	List<Integer> partPowerSupply 			= null;
	List<Integer> partSoftware 				= null;
	List<Integer> partSoundCard 			= null;
	List<Integer> partSpeakers	 			= null;
	List<Integer> partThermalPaste 			= null;
	List<Integer> partUPS 					= null;
	List<Integer> partVideoCard 			= null;
	List<Integer> partWiredNetworkCard 		= null;
	List<Integer> partWirelessNetworkCard 	= null;
	
	public Build(String name, int user_id) {
		this.name = name;
		this.user_id = user_id;
		created_date = new Date();
		updated_date = new Date();
	}
}
