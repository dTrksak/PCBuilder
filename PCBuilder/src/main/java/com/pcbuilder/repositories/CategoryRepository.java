package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	Category findByCategoryId(int categoryId);
	Category findByCategoryName(String categoryName);
}
