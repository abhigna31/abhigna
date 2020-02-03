package com.cts.training.controller;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class Moviecontroller {
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		Criteria criteria = session.createCriteria(Movie.class);
		criteria.add(Restrictions.eq("name", "furious 7"));
		Movie movie = (Movie) criteria.uniqueResult();
		System.out.println(movie);

		Set<Actor> actors = movie.getActors();
		for(Actor actor : actors){
		  System.out.println(actor);
		}
		
		
//		Movie movie= new Movie();
//		movie.setName("Furious 7");
//
//		Actor actor1 = new Actor();
//		actor1.setActorName("Vin Diesel");
//		actor1.setMovie(movie);
//
//		Actor actor2= new Actor();
//		actor2.setActorName("Paul Walker");
//		actor2.setMovie(movie);
//
//		Transaction transaction = session.getTransaction();
//		transaction.begin();
//		session.save(movie);
//		session.save(actor1);
//		session.save(actor2);
		tx.commit();
		session.close();
		
}
}
