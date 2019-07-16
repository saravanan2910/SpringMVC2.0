package com.pack.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private String password;
	private String email;
	private int age;
	private double salary;
	private String role;
	
	public Employee(String name, String password, String email, int age, double salary, String role) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.salary = salary;
		this.role = role;
	}
	
}
