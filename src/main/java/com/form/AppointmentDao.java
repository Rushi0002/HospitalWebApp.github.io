package com.form;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.servlets.LoginPojo;

public class AppointmentDao {
	public String addAppointment(AppointmentPojo ap)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ap);
		transaction.commit();
		session.close();
		return "success";
	}
}
