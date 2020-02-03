package com.cts.training.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContrctualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermenantEmployee;


public class EmployeeController {
  public static void main(String []args) {
	  
	  Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("abhigna");
		
		
		PermenantEmployee pe=new PermenantEmployee();
		pe.setSlary(86765);
		pe.setBonus(76745);
		
		
		ContrctualEmployee ce=new ContrctualEmployee();
	
		ce.setPayPerHolder(86765);
		ce.setContractPeriod(76745);
		
		
		
	
		
		
		
		
		//List<String>emails=new ArrayList<String>();
		//Map<String,String>emails=new LinkedHashMap<>();
		Set<String> emails = new HashSet<String>(); 
//		emails.put("Gmail;","abhigna@gmail.com");
//		emails.put("Bussiness_Mail:","abhi@gmail.com");
//		emails.put("Yahoo_Mail:","lahiri@gmail.com");

	//	employee.setEmails(emails);
	//	session.save(employee);
//		
		
//	emails.add("abhigna@gmail.com");
//		emails.add("abhi@gmail.com");
//		emails.add("lahiri@gmail.com");
//		emails.add("abhig@gmail.com");
//		employee.setEmails(emails);
//		session.save(employee);
     	session.save(employee);
     	session.save(pe);
     	session.save(ce);
		
		tx.commit();
		session.close();
  }
}
