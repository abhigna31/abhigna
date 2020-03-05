package com.cts.training.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	UserRepo userDao;
	
	@Autowired
	UserService us;
	
	@Autowired
	JavaMailSender jms;
	

	@GetMapping("/user/{id}")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id) {
		try {
			UserDTO user=us.getUserById(id);
			return new ResponseEntity<UserDTO>(user,HttpStatus.OK);
		}catch(NoClassDefFoundError e){
			return new ResponseEntity<String>("No such user found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/user")
	public ResponseEntity<?>getallusers() {
		List<UserDTO> list = us.getAllUsers();
		if(list.size()>0)
		{
			return new ResponseEntity<List<UserDTO>>(list , HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	
//
 
	@PostMapping("/user")
	public ResponseEntity<UserDTO> save(@RequestBody UserDTO user){
		us.insert(user);
		return new ResponseEntity<UserDTO>(user,HttpStatus.OK);
	}
	
	
	
	
//
	@PutMapping(value="/useractivate")
	public String activateUser(@RequestBody String e) {
		String temp = e.split(":")[1];
		String email=temp.split("\"")[1];
		User user = userDao.findByEmail(email);
		if(user.getActive().equals("no")) {
			user.setActive("yes");
			userDao.save(user);
			return "{\"result\":\"1\"}";
		}
		else
		return "{\"result\":\"0\"}";
	}
	

	@PutMapping("/user")
	public ResponseEntity<UserDTO> update(@RequestBody UserDTO user){
		us.update(user);
		return new ResponseEntity<UserDTO>(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<UserDTO> deleteUser(@PathVariable int id){
		us.delete(id);
		return new ResponseEntity<UserDTO>(HttpStatus.OK);
	
}
}
