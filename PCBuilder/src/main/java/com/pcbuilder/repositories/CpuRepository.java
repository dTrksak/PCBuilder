package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Cpu;

public interface CpuRepository extends JpaRepository<Cpu, Integer>{
	
	Cpu findBycpuId(int cpuId);
	Cpu findByboostClock(String boostClock);
	Cpu findBycoreClock(String coreClock);
	Cpu findByCpuName(String CpuName);
	Cpu findBycpuSpeed(int cpuSpeed);
	Cpu findByintegratedGraphics(String integratedGraphics);
	Cpu findBysmt(String smt);
	Cpu findBytdp(String tdp);
	
}
