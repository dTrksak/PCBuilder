package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Mouse;

public interface MouseRepository extends JpaRepository<Mouse, Integer>{
	Mouse findByMouseId(int mouseId);
	List<Mouse> findByColor(String color);
	List<Mouse> findByConnectionType(String connectionType);
	List<Mouse> findByHandOrientation(String handOrientation);
	List<Mouse> findByMaximumDpi(String maximumDpi);
	List<Mouse> findByTrackingMethod(String trackingMethod);
}
