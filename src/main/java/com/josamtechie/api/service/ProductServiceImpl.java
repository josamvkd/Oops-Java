package com.josamtechie.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josamtechie.api.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Override
	public B addProducts(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	

	// Polymorphism - Method override example
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(List<Product> product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(int pId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product searchProduct(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(String name, String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(String name, String color, double price) {
		// TODO Auto-generated method stub
		return null;
	}


}
