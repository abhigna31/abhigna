package com.cts.training.model;

import 

public class Usercontroller {
	public static void main (String []args) {
		configuration cfg=new configuration();
		cfg.configure();
		
		SessionFactory sessionFactory=cfg.buildSessionfactory();
		cfg.configure();
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=SesionFactory.openSession();
		Transaction transaction=sesion.beginTransaction();
		
		User user=new User(101,"user",user@123q	a,user@cts.com,75764,false);
		
		sesion.save(user);
				
	}

}
