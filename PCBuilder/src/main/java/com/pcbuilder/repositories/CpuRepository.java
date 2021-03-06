package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Cpu;

public interface CpuRepository extends JpaRepository<Cpu, Integer>{
	
	Cpu findByCpuId(int cpuId);
	List<Cpu> findByBoostClock(String boostClock);
	List<Cpu> findByCoreClock(String coreClock);
	List<Cpu> findByCpuName(String CpuName);
	List<Cpu> findByCpuSpeed(int cpuSpeed);
	List<Cpu> findByIntegratedGraphics(String integratedGraphics);
	List<Cpu> findBySmt(String smt);
	List<Cpu> findByTdp(String tdp);
	
}
