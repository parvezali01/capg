package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDAO productDAOImpl;
	
	public List<Product> getAllProducts(){
		return productDAOImpl.getAllProducts();
	}
	
	public void addProduct(Product product) {
		productDAOImpl.addProduct(product);
	}
	
	public Product findProduct(int id) {
		return productDAOImpl.findProduct(id);
	}
	
	public boolean deleteProduce(int id) {
		return productDAOImpl.deleteProduct(id);
	}
	
	public boolean updateProduct(Product product) {
		return productDAOImpl.updateProduct(product);
	}

}
