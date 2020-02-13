package com.cts.training.spring.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.spring.dao.EmployeeDAO;
import com.cts.training.spring.model.Employee;
public  class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean saveEmployee(Employee employee) {
		String query = "insert into emp values(?,?,?,?)";
		try {
			jdbcTemplate.update(query,
					employee.getId(),
					employee.getName(),
					employee.getEmail(),
					employee.getPhone());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteEmployee(Employee emp) {
		String query = "delete from emp where id =?";
		try {
			jdbcTemplate.update(query, emp.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}
	public Employee getEmployeeById(int id) {
		String query = "select * from emp where id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}
	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("select * from emp", new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<Employee> list = new ArrayList<Employee>();
			 while (rs.next())
			 	{ 
				 Employee employee = new Employee();
			 		employee.setId(rs.getInt(1));
			 		employee.setName(rs.getString(2));
			 		employee.setEmail(rs.getString(3));
			 		employee.setPhone(rs.getLong(4));
			 		list.add(employee);
			 	}
			 return list;
			 } });
			}
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}
	}
	