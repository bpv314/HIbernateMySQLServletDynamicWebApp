package com.belen.registration.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.belen.registration.bean.Member;

public class MemberDao {

	public void registerMember(String firstName, String lastName, String username, String password,
			String city){
		//configure hibernate
		Configuration configuration=new Configuration().configure();
		
		// create sessionFactory
		SessionFactory sf=configuration.buildSessionFactory();
		
		//create session
		Session session=sf.openSession();
		
		//start transaction
		Transaction transaction=session.beginTransaction();
		Member member=new Member();
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setUsername(username);
		member.setPassword(password);
		member.setCity(city);
		session.save(member);
		transaction.commit();
		System.out.println("Member Added!");
	}
}
