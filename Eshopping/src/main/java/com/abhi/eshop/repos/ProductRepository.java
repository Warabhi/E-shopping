package com.abhi.eshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.eshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findById(Long productId);

}
