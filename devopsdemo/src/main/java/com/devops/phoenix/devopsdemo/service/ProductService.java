package com.devops.phoenix.devopsdemo.service;

import java.util.List;

import com.devops.phoenix.devopsdemo.domain.Products;

public interface ProductService {
	
	String SERVICE_NAME="products";
	List<Products> getProducts();

}
