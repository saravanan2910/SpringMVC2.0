package com.pack.springmvc.dao;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeDAO {

	public int register(Employee employee);
	public Employee login(Employee employee);
	public List<Employee> listAll();

	
}
