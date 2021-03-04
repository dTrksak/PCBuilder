package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByFirstName(String firstName);
	User findByLastName(String lastName);
	User findByEmail(String email);
}
