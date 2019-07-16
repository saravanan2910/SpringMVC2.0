package com.pack.springmvc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.springmvc.model.Employee;

@Repository(value = "mysqlDaoImpl")
public class MySQLEmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public int register(Employee employee) {
		
		System.out.println("Register Employee in MySQL DAO");
		
		String query = "insert into employee (name, password, email, age, salary, role) values (?,?,?,?,?,?)";
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			return jdbcTemplate.update(query, employee.getName(),employee.getPassword(),employee.getEmail(),employee.getAge(),employee.getSalary(),employee.getRole());
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}
	
	public Employee login(Employee employee) {
		
		System.out.println("Login Employee in MySQL DAO");
		
		String query = "select * from employee where name = '"+ employee.getName() + "' and password = '" + employee.getPassword()+ "'";
			  
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			return jdbcTemplate.queryForObject(query,
					(rs, rowNum) -> new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getString(7)));
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public List<Employee> listAll() {
		
		System.out.println("Login Employee in MySQL DAO");
		
		String query = "select * from employee";
			  
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			return jdbcTemplate.query(query,
					(rs, rowNum) -> new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getString(7)));
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
