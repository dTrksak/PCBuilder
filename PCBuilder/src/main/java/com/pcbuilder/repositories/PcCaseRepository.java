package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.PcCase;

public interface PcCaseRepository extends JpaRepository<PcCase, Integer>{
	PcCase findByCaseId(int caseId);
	List<PcCase> findByCaseType(String caseType);
	List<PcCase> findByColor(String color);
	List<PcCase> findByExternalBays(byte externalBays);
	List<PcCase> findByInternalBays(byte internalBays);
	List<PcCase> findByPowerSupply(String powerSupply);
	List<PcCase> findBySidePanelWindow(String sidePanelWindow);
}
