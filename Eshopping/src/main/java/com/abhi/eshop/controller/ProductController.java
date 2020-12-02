package com.abhi.eshop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.eshop.entities.Product;
import com.abhi.eshop.repos.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
    @GetMapping("/product")
    public List<Product> getAllUser() {
        return productRepository.findAll();
    }
    
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
    
    @DeleteMapping("/product/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long productId){
    	Product product = productRepository.findById(productId);
        productRepository.delete(product);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Long productId,@RequestBody Product productDetails) {
    	Product product = productRepository.findById(productId);
    	product.setName(productDetails.getName());
    	product.setDescription(productDetails.getDescription());
    	product.setPrice(productDetails.getPrice());
        final Product updatedProduct = productRepository.save(product);
        return ResponseEntity.ok(updatedProduct);
    }

    
    
    
    

		

}




