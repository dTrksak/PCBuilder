package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Build;
import com.pcbuilder.entities.User;

public interface BuildRepository extends JpaRepository<Build, Integer> {
	Build findByBuildId(int buildId);
	List<Build> findByUser(User user); //Build.java holds User object, not just the userId variable
}
