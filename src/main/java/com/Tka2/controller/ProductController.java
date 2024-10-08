package com.Tka2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tka2.entity.Product;
import com.Tka2.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService Productservice;

	@GetMapping("getAll")
	public ArrayList<Product> getAllProducts() {
		return Productservice.getAllProduct();
	}
	
	
	
	@PostMapping("/AddNewProduct")
	public void AddNewProduct( Product addproduct) {
		 Productservice.AddNewProduct(addproduct);
		
	}
	
	@DeleteMapping("deleteproduct/{id}")
	public void deleteproduct(@PathVariable int id) {
		Productservice.deleteproduct(id);
	}

}
