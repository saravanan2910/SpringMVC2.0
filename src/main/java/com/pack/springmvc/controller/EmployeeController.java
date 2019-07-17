package com.pack.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String register(Model model) {
		model.addAttribute("employee", new Employee());
		return "register";
	}

	@PostMapping("/register")
	public String registeremployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
		System.out.println(employee);
		if (result.hasErrors()) {
			return "register";
		} else {
			if (employeeService.registerEmployee(employee) == 1) {
				return "login";
			} else {
				return "error";
			}
		}

	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginemployee(HttpServletRequest request, HttpServletResponse response, Model model) {
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

	@GetMapping("/update")
	public String update() {
		return "login";
	}

	@PostMapping("/update")
	public String updateemployee(HttpServletRequest request, HttpServletResponse response, Model model) {
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
