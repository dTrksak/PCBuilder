package com.pcbuilder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Category;
import com.pcbuilder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByProductId(int productId);
	Product findByProductName(String productName);
	Product findByProductPrice(double productPrice);
	Product findByCategoryId(Category category);
}
