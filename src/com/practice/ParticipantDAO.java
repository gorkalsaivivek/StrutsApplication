package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ParticipantDAO {
	
	public void addParticipant(Participant participant)
	   {
		   SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(participant);
			session.getTransaction().commit();
	     // session.save(student);
	   }

}
