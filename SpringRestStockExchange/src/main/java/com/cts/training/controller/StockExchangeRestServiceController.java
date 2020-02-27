package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.model.StockExchange;
import com.cts.training.repo.StockExchangeRepo;

@CrossOrigin(origins="*")
@RestController

public class StockExchangeRestServiceController {
	@Autowired
	StockExchangeRepo se;
	@RequestMapping(value="/stockexchange", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll(){
		return se.findAll();
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockExchange findone(@PathVariable int id){
		Optional<StockExchange> com = se.findById(id);
		StockExchange r = com.get();
		return r;
	}
	@RequestMapping(value="/stockexchange", method= RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange ste){
		StockExchange stockexchange = se.save(ste);
		return stockexchange;
	}
	@RequestMapping(value="/stockexchange/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		se.deleteById(id);
	}
	@RequestMapping(value = "/stockexchange", method = RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange  ste) {
		System.out.println("stock:: "+ste.getName()+"  "+ste.getId());
		StockExchange stockexchange = se.save(ste);
		return stockexchange;
	}
}


