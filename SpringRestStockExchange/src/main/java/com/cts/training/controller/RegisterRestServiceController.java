package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.model.Register;
import com.cts.training.repo.RegisterRepo;
	
	@CrossOrigin(origins="*")
	@RestController
	public class RegisterRestServiceController {
		
		//@Value("$welcome.message")
		@Autowired
		RegisterRepo rr;
		
		@Autowired
		JavaMailSender jms;
		
		@RequestMapping(value="/register", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Register> findAll(){
			return rr.findAll();
		}
		@RequestMapping(value="/register/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
		public Register findone(@PathVariable int id){
			Optional<Register> reg = rr.findById(id);
			Register r = reg.get();
			return r;
		}
		@RequestMapping(value="/register", method= RequestMethod.POST)
		public Register save(@RequestBody Register reg){
			Register register = rr.save(reg);
			return register;
		}
		@RequestMapping(value="/register/{id}", method= RequestMethod.DELETE)
		public void  delete(@PathVariable int id){
			rr.deleteById(id);
		}
		@RequestMapping(value = "/register", method = RequestMethod.PUT)
		public Register update(@RequestBody Register reg) {
			Register register = rr.save(reg);
			return register;
		}
		@RequestMapping(value="/reg", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public String reg() {
		
		try {
			SimpleMailMessage sm=new SimpleMailMessage();
			sm.setFrom("abhignalahiri@gmail.com");
			sm.setTo("abhignalahiri@gmail.com");
			sm.setSubject("testing mail");
			sm.setText("this is the testing mail");
			jms.send(sm);
			System.out.println("sending mail..........");
		}
		catch(Exception e) {e.printStackTrace();}
		return "{\"reg\":\"ok\"}";
			
		}
	}