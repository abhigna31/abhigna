package com.cts.training.spring.controller;
		import java.util.List;

import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.cts.training.spring.dao.EmployeeDAO;
         import com.cts.training.spring.model.Employee;
         
		public class EmployeeController {
			public static void main(String[] args) {
				//EmployeeDao abc=new EmployeeDaoImpl();
				ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
				EmployeeDAO empDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
				
				//Employee employee=new Employee(1,"ewq","qreq",6789098769l);
				//Employee employee=new Employee(3,"abhi","abhi@gmail.com",67890987345l);
				//Employee employee=new Employee(5,"indu","indu@gmail.com",67896757345l);
				//Employee employee=new Employee(13,"anwi","anwi@gmail.com",67893437345l);
				//System.out.println(empDAO.saveEmployee(employee1));
			//	Employee employee1=empDAO.getEmployeeById(1);
			//	System.out.println(empDAO.deleteEmployee(employee1));
			//	System.out.println(employee1);
				//update
				Employee emp=new Employee();
				emp.setName("abhi");
					empDAO.updateEmployee(emp);
					//	List<Employee> list = empDAO.getAllEmployees();
					//System.out.println(list);
					}
				
		}
				
			