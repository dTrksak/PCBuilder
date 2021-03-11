package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByFirstName(String firstName);
	List<User> findByLastName(String lastName);
	User findByFirstNameAndLastName(String firstName, String lastName);
	User findByEmail(String email);
}
