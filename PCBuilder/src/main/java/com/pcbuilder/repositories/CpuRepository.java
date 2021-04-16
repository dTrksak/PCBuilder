package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Cpu;

public interface CpuRepository extends JpaRepository<Cpu, Integer>{
	
	Cpu findByCpuId(int cpuId);
	List<Cpu> findByBoostClock(String boostClock);
	List<Cpu> findByCoreClock(String coreClock);
	//List<Cpu> findByCpuName(String CpuName); //legacy
	//List<Cpu> findByCpuSpeed(int cpuSpeed); //legacy
	List<Cpu> findByIntegratedGraphics(String integratedGraphics);
	List<Cpu> findBySmt(String smt);
	List<Cpu> findByTdpWattage(String tdpWattage);
	
	@Query("select c from Cpu c where (c.socketType = ?3 or ?3 is null) and (c.tdpWattage + ?1 <= ?2 or ?2 = 0) and (c.mode = ?4 or c.mode = '32/64-bit' or ?4 is null)")
	Page<Cpu> findByCompatibility(int videoCardTdp, int totalTdp, String socketType, String mode, Pageable pageable);
}
