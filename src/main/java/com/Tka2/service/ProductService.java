package com.Tka2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tka2.ProductDao.ProductDao;
import com.Tka2.entity.Product;

@Service
public class ProductService {
	@Autowired 
	ProductDao dao;
	
	public ArrayList<Product> getAllProduct(){
		return dao.getAllProduct();
	}

	public void AddNewProduct(Product addproduct ) {
	dao.AddNewProduct(addproduct);
		
	   }

	

	public void deleteproduct(int id) {
		

		dao.deleteproduct(id);
	}
	
	}


