package com.pack.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.springmvc.dao.EmployeeDAO;
import com.pack.springmvc.model.Employee;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public int registerEmployee(Employee employee) {
		System.out.println("Register Employee in Employee Service");
		return employeeDAO.register(employee);
	}

	public Employee loginEmployee(Employee employee) {
		System.out.println("Login Employee in Employee Service");
		return employeeDAO.login(employee);
	}

	public List<Employee> listAllEmployees() {
		System.out.println("List All Employees in Employee Service");
		return employeeDAO.listAll();
	}

	public Employee findByIdEmployee(int id) {
		System.out.println("Find By Id Employee in Employee Service");
		return employeeDAO.findById(id);
	}


	public int deleteEmployee(int id) {
		System.out.println("Delete Employee in Employee Service");
		return employeeDAO.delete(id);
	}

}
