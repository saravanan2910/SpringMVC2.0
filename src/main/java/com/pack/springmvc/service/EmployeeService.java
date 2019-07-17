package com.pack.springmvc.service;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeService {

	public int registerEmployee(Employee employee);
	public Employee loginEmployee(Employee employee);
	public List<Employee> listAllEmployees();
	public Employee findByIdEmployee(int id);
	public int deleteEmployee(int id);

}
