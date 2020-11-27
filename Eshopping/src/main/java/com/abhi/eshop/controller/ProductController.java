package com.abhi.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.eshop.entities.Product;
import com.abhi.eshop.repos.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value= "/product" ,method = RequestMethod.GET )
	public List<Product> getproducts(){
		return repository.findAll();
		
	}
	

}
