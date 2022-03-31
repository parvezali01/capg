package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartDAOImpl implements CartDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(cart);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public Cart findCart(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Cart cart=session.get(Cart.class,id);
		return cart;
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Cart> cartlist=session.createQuery("select c from Cart c").list();
		return cartlist;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(cart);
		session.flush();
		session.getTransaction().commit();
		
		return true;
	}

	@Override
	public boolean deleteCart(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Cart cart=session.get(Cart.class,id);
		session.delete(cart);
		session.flush();
		session.getTransaction().commit();
		
		return true;
	}

}
