package com.pcbuilder.repositories;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Build;
import com.pcbuilder.entities.CaseAccessory;
import com.pcbuilder.entities.User;

public interface BuildRepository extends JpaRepository<CaseAccessory, Integer> {
	Build findByBuildID(int buildID);
	List<Build> findByUserID(int userID);
}
