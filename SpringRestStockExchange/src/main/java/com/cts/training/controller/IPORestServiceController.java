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

import com.cts.training.model.Ipo;
import com.cts.training.repo.IpoRepo;

@CrossOrigin(origins="*")
@RestController
public class IPORestServiceController {
	
	@Autowired
	IpoRepo rr;
	@RequestMapping(value="/ipo", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ipo> findAll(){
		return rr.findAll();
	}
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Ipo findone(@PathVariable int id){
		Optional<Ipo> com = rr.findById(id);
		Ipo r = com.get();
		return r;
	}
	@RequestMapping(value="/ipo", method= RequestMethod.POST)
	public Ipo save(@RequestBody Ipo ipo){
		Ipo ip = rr.save(ipo);
		return ip;
	}
	
	@RequestMapping(value="/ipo/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		rr.deleteById(id);
	}
	@RequestMapping(value = "/ipo", method = RequestMethod.PUT)
	public Ipo update(@RequestBody Ipo ipo) {
		Ipo ip = rr.save(ipo);
		return ip;
	}
}




