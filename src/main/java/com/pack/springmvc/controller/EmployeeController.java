package com.pack.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.springmvc.model.Employee;
import com.pack.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String registeremployee(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		String role = request.getParameter("role");
		if (employeeService.registerEmployee(new Employee(name, password, email, age, salary, role)) == 1) {
			return "success";
		} else {
			return "error";
		}

	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginemployee(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Employee employee = new Employee();
		employee.setName(name);
		employee.setPassword(password);

		employee = employeeService.loginEmployee(employee);

		if (employee != null) {

			if (employee.getRole().equals("admin")) {
				model.addAttribute("emplist", employeeService.listAllEmployees());
				return "admin";
				
			} else {
				model.addAttribute("employee", employee);
				return "employee";
			}

		} else {
			return "error";
		}

	}

}
