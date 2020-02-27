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

import com.cts.training.model.Company;
import com.cts.training.repo.CompanyRepo;

@CrossOrigin(origins="*")
@RestController

public class CompanyRestServiceController {
	
	@Autowired
	CompanyRepo rr;
	@RequestMapping(value="/company", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> findAll(){
		return rr.findAll();
	}
	@RequestMapping(value="/company/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Company findone(@PathVariable int id){
		Optional<Company> com = rr.findById(id);
		Company r = com.get();
		return r;
	}
	@RequestMapping(value="/company", method= RequestMethod.POST)
	public Company save(@RequestBody Company com){
		Company company = rr.save(com);
		return company;
	}
	@RequestMapping(value="/company/{id}", method= RequestMethod.DELETE)
	public void  delete(@PathVariable int id){
		rr.deleteById(id);
	}
	@RequestMapping(value = "/company", method = RequestMethod.PUT)
	public Company update(@RequestBody Company com) {
		System.out.println("company:: "+com.getName()+"  "+com.getCeo());
		Company company = rr.save(com);
		return company;
	}
}

