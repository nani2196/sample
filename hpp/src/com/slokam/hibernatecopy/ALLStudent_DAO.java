package com.slokam.hibernatecopy;

import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.NamedGroup.All;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ALLStudent_DAO {
	

	Configuration  cc= new Configuration().configure();
	
	public void insertData() {
		SessionFactory sf = cc.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tt= ss.beginTransaction();

		AllStudents_Pojo sp = new AllStudents_Pojo();
		sp.setSid(2);
		sp.setName("mani");
		sp.setAge(25);
		sp.setQualification("B.Tech");
		sp.setMarks(80);
		

		AllStudents_Pojo sp1 = new AllStudents_Pojo();
		sp1.setSid(3);
		sp1.setName("sai");
		sp1.setAge(25);
		sp1.setQualification("B.Tech");
		sp1.setMarks(85);
		

		AllStudents_Pojo sp2 = new AllStudents_Pojo();
		sp2.setSid(4);
		sp2.setName("Teja");
		sp2.setAge(25);
		sp2.setQualification("B.Tech");
		sp2.setMarks(99);
		

		AllStudents_Pojo sp3= new AllStudents_Pojo();
		sp3.setSid(5);
		sp3.setName("nitesh");
		sp3.setAge(25);
		sp3.setQualification("B.Tech");
		sp3.setMarks(69);
		
		
		ss.save(sp);
		ss.save(sp1);
		ss.save(sp2);
		ss.save(sp3);
		
		tt.commit();
		ss.close();
		sf.close();
		
	}
	
	public void updateData() {
		
		SessionFactory sf= cc.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tt= ss.beginTransaction();
		
		Object oo=ss.get(AllStudents_Pojo.class, 4);
		AllStudents_Pojo sp=(AllStudents_Pojo)oo;
		sp.setAge(20);
		
		ss.saveOrUpdate(sp);
		tt.commit();
		ss.close();
		sf.close();
		

	}
	public void deleteData() {
		SessionFactory sf= cc.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tt= ss.beginTransaction();
		
		AllStudents_Pojo sp= (AllStudents_Pojo)ss.load(AllStudents_Pojo.class, 5);
		
		ss.delete(sp);
		tt.commit();
		ss.close();
		sf.close();
	}
	
	public void getAllDetails() {
		SessionFactory sf=cc.buildSessionFactory();
		Session ss=sf.openSession();
		
		String hql="from Student_Pojo";
		Query qq=ss.createQuery(hql);
		List<AllStudents_Pojo> list =qq.list();
		Iterator<AllStudents_Pojo> it= list.iterator();
		
		while((it.hasNext())==true) {
			AllStudents_Pojo sp=it.next();
			
			System.out.println(sp.getSid()+"  "+sp.getName()+"   "+sp.getAge()+"  "+sp.getQualification()+"  "+sp.getMarks());
		}
		ss.close();
		sf.close();
	}

}
