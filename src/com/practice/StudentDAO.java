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

public class StudentDAO {
	
   @SessionTarget
   Session session;

   @TransactionTarget
   Transaction transaction;

   @SuppressWarnings("unchecked")
   public List<Student> getStudents()
   {
      List<Student> students = new ArrayList<Student>();
      List<Student> results = new ArrayList<Student>();
      try
      {
    	  SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
  		Session session=sessionFactory.openSession();
    	  String hql = "FROM student";
    	  Query query = session.createQuery(hql);
    	  	results = query.list();
         students = session.createQuery("from Student").list();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      // return students;
      return results;
   }

   public void addStudent(Student student)
   {
	   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
     // session.save(student);
   }
}
