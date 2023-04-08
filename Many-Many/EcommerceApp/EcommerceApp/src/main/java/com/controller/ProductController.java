package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.repository.ProductRepository;
import com.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping(value = "AddProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	

}
