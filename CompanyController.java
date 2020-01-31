package com.cts.training.model;
//import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import com.cts.training.model.Company;
import com.cts.training.controller.StockExchange;
//import com.cts.training.model.User;
public class CompanyController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		Company company=new Company(103,"Microsoft","Digital","Satyam",99878687.67);
//		session.save(company);
		StockExchange se=new StockExchange(1,"BSE","Mumbai","Mutual funds");
		session.save(se);
//		Company getCompany=session.get(Company.class, 101);
//		session.delete(getCompany);
//		List<Company>company=session.createQuery("FROM Company").list();
//		company.forEach(System.out::println);
//		
		transaction.commit();
		session.close();
	}
}
