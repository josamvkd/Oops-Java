package com.josamtechie.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.josamtechie.api.entity.Product;
import com.josamtechie.api.service.ProductService;

@RestController
public class ProductController {
	
	// Example for Dynamic Polymorphism or Runtime Polymorphism - Not injecting the implementation class
	// Injecting the interface
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
		
	}

}
