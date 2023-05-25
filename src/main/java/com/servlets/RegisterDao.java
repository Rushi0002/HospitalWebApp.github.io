package com.servlets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterDao {
	public String createUser(RegisterPojo rp)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(rp);
		LoginPojo lp = new LoginPojo(rp.getEmail(),rp.getPassword());
		session.save(lp);
		transaction.commit();
		session.close();
		return "success";
	}
}
