package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class CustomerDAO {

	
	@SessionTarget
	   Session session;

	   @TransactionTarget
	   Transaction transaction;

	   @SuppressWarnings("unchecked")
	   public List<Customer> getCustomers()
	   {
	      List<Customer> customers = new ArrayList<Customer>();
	      List<Customer> results = new ArrayList<Customer>();
	      try
	      {
	    	  SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	  		Session session=sessionFactory.openSession();
	    	  String hql = "FROM Customer";
	    	  Query query = session.createQuery(hql);
	    	  	results = query.list();
	    	  	customers = session.createQuery("from Customer").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      // return students;
	      return results;
	   }

	   public void addCustomer(Customer customer)
	   {
		   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(customer);
			session.getTransaction().commit();
	     // session.save(student);
	   }

	public int checkCustomer(Customer customer) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
  		Session session=sessionFactory.openSession();
System.out.println(customer.getEmailId());
System.out.println(customer.getPassword());
		Query query = session.createQuery("from Customer where EmailId = :email and Password= :pass");
		query.setParameter("email",customer.getEmailId());
		query.setParameter("pass", customer.getPassword());
		List list = query.list();
		return list.size();
	}
	
	
}
