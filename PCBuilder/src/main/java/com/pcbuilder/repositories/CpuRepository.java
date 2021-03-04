package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Cpu;

public interface CpuRepository extends JpaRepository<Cpu, Integer>{
	
	Cpu findByCpuId(int cpuId);
	Cpu findByBoostClock(String boostClock);
	Cpu findByCoreClock(String coreClock);
	Cpu findByCpuName(String CpuName);
	Cpu findByCpuSpeed(int cpuSpeed);
	Cpu findByIntegratedGraphics(String integratedGraphics);
	Cpu findBySmt(String smt);
	Cpu findByTdp(String tdp);
	
}
