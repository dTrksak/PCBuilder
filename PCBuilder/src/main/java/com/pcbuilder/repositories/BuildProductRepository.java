package com.pcbuilder.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pcbuilder.entities.BuildProduct;

public interface BuildProductRepository extends JpaRepository<BuildProduct, Integer> {
	BuildProduct findByProductProductId(int productId);
}
