package com.slokam.hibernate.relations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class  DAO_Layer {

	public void insert() {
		Configuration c= new Configuration().configure();
		SessionFactory sf= c.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction t= ss.beginTransaction();
		
		Customer cc= new Customer();
		cc.setCname("xyb");
		cc.setClocation("djd");
		
		Invoice in = new Invoice();
		in.setInumber(8955);
		in.setCc(cc);
		
		cc.setIn(in);
		
		ss.save(cc);
		t.commit();
		ss.close();
		sf.close();
		
	}
	public void update() {
		Configuration c= new Configuration().configure();
		SessionFactory sf= c.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction t= ss.beginTransaction();
		
	}

}
