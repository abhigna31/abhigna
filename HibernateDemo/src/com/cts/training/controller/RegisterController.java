package com.cts.training.controller;

import java.util.List;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.dao.impl.RegisterDAOImpl;
import com.cts.training.model.Register;

public class RegisterController {

	public static void main(String[] args) {

		Register user = new Register(101, "divya", "123786568", "divya@cts.com", 556867567L, true);

		RegisterDAO userDAO = new RegisterDAOImpl();
//
//		boolean status = userDAO.saveUser(user);
//		if (status) {
//			System.out.println("user Saved Successfully");
//		} else {
//			System.out.println("Try Again");
//		}

		//// update /////
//		Register getrRegister=userDAO.getUserById(101);
//		getrRegister.setPassword("123456789");
//		boolean status=userDAO.updateUser(getrRegister);
//		if (status) {
//			System.out.println("user updated successfully");
//		}
//		else 
//			System.out.println("try again");
//	}
//
//	}

//Register getrRegister=userDAO.getUserById(101);
//boolean status=userDAO.daleteUser(getrRegister);
//if (status) {
//	System.out.println("user deleted successfully");
//}
//else 
//	System.out.println("try again");
		// }

		List<Register> getRegister = userDAO.getAllUsers();
		getRegister.forEach(System.out::println);
	}
}
