package com.model;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public interface ProductDAO {
	List<Product> getAllProducts();
	void addProduct(Product product);
	Product findProduct(int id);
	boolean updateProduct(Product product);
	boolean deleteProduct(int id);

}
