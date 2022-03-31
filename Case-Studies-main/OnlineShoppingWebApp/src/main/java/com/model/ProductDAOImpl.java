package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select i from Product i");
		List<Product> productlist=query.list();
		return productlist;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(product);
		session.flush();
		session.getTransaction().commit();
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class, id);
		return product; 
		
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub

		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(product);
		session.flush();
		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		Product product=findProduct(id);
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(product);
		session.flush();
		session.getTransaction().commit();
		return true;
	}
	

}
