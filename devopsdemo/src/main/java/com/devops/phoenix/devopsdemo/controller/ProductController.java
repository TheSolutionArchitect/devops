package com.devops.phoenix.devopsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.phoenix.devopsdemo.domain.Products;
import com.devops.phoenix.devopsdemo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/"+ProductService.SERVICE_NAME)
	public List<Products> getProducts(){
		return productService.getProducts();
	}
	
}
