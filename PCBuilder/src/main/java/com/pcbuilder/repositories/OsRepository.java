package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pcbuilder.entities.Os;
import com.pcbuilder.entities.PcCase;

public interface OsRepository extends JpaRepository<Os, Integer>{
	Os findByOsId(int osId);
	List<Os> findByMaxMemory(String maxMemory);
	List<Os> findByMode(String mode);
	List<Os> findByOsType(String osType);
	
	@Query("select o from Os o where o.mode = ?1 or ?1 is null")
	Page<Os> findByCompatibility(String mode, Pageable pageable);
}
