package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Cpu;
import com.pcbuilder.entities.Motherboard;
import com.pcbuilder.entities.PcCase;

public interface PcCaseRepository extends JpaRepository<PcCase, Integer>{
	PcCase findByCaseId(int caseId);
	List<PcCase> findByCaseType(String caseType);
	List<PcCase> findByColor(String color);
	List<PcCase> findByExternalBays(byte externalBays);
	List<PcCase> findByInternalBays(byte internalBays);
	List<PcCase> findByPowerSupply(String powerSupply);
	List<PcCase> findBySidePanelWindow(String sidePanelWindow);
	
	@Query("select p from PcCase p where p.formFactor = ?1 or ?1 is null")
	Page<PcCase> findByCompatibility(String formFactor, Pageable pageable);
}
