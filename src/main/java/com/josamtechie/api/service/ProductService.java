package com.josamtechie.api.service;

import java.util.List;

import com.josamtechie.api.entity.Product;

// Example for Abstraction -- All methods are abstracted

public interface ProductService {
	
	public A addProducts(Product product);
	
	// Polymorphism - Method overloading example

	public Product addProduct(Product product);
	
	public Product addProduct(List<Product> product);
	
	public void removeProduct(Product product);
	
	public void removeProduct(int pId);
	
	public Product searchProduct(int pId);
	
	public Product searchProduct(String name);
	
	public Product searchProduct(String name, String color);
	
	public Product searchProduct(String name, String color, double price);
	
	
}
