package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.impl.CompanyDAOImpl;
import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public class CompanyController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Company company=new Company(123, "CTS", "IT", "BrianHamphires","abhi", 120000000.00);
		CompanyDAO companyDAO= new CompanyDAOImpl();
		boolean status=companyDAO.saveCompany(company);
		if(status) {
			System.out.println("Company entered successfully");
		}
		else
		{
			System.out.println("try again");
		}
	}
}
