package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Integer>{
	Monitor findByMonitorId(int monitorId);
	List<Monitor> findByAspectRatio(String aspectRatio);
	List<Monitor> findByPanelType(String panelType);
	List<Monitor> findByRefreshRate(String refreshRate);
	List<Monitor> findByResolution(String resolution);
	List<Monitor> findByResponseTimeG2g(String responseTimeG2g);
	List<Monitor> findByScreenSize(String screenSize);
}
