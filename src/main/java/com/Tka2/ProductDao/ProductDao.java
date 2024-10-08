package com.Tka2.ProductDao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import com.CricketWorldCup.entity.CricketStaff;
import com.Tka2.entity.Product;

import org.hibernate.Transaction;


@Repository
public class ProductDao {
	SessionFactory factory;

	
	public ArrayList<Product> getAllProduct() {
		
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1,"laptop",3,50000));
		al.add(new Product(2,"mobile",2,4000));
		al.add(new Product(2,"tv",2,40000));
		al.add(new Product(2,"A",4,4500));
		
		return al;
	}
	
	@SuppressWarnings("deprecation")
	public void AddNewProduct(Product addproduct ) {
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(addproduct);
		
		
		
	
   }

	
	public void deleteproduct(int id) {
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		Product c= session.load(Product.class,id);
		session.delete(c);
		
	}
}
