package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByfirstName(String firstName);
	User findBylastName(String lastName);
	User findByemail(String email);
}
