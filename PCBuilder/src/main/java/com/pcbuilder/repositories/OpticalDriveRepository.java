package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.OpticalDrive;

public interface OpticalDriveRepository extends JpaRepository<OpticalDrive, Integer>{
	OpticalDrive findByOpticalDriveId(int opticalDriveId);
	List<OpticalDrive> findByBd(byte bd);
	List<OpticalDrive> findByBdWrite(String bdWrite);
	List<OpticalDrive> findByCd(byte cd);
	List<OpticalDrive> findByCdWrite(String cdWrite);
	List<OpticalDrive> findByDvd(byte dvd);
	List<OpticalDrive> findByDvdWrite(String dvdWrite);
}
