package com.cts.training.spring.dao;

import java.util.List;

import com.cts.training.spring.model.Employee;

public interface EmployeeDAO {
public boolean saveEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(Employee employee);

	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployees();
	

	

}

