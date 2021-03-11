package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByProductId(int productId);
	List<Product> findByProductName(String productName);
	List<Product> findByProductPrice(double productPrice);
}