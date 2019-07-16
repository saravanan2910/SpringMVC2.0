<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
<style>
	section h2 {
		font-size:18px;
		font-family: Arial, Helvetica, sans-serif;
		font-weight:100;
	}
	section h2 span{
		font-size:20px;
		font-family: Arial, Helvetica, sans-serif;
		font-weight: 900;
	}
</style>
</head>
<body style="text-align: center;">
	<br>
	<h1>Welcome ${employee.name}</h1>
	<h3>Your Account Details</h3>
	<br><br>
	<section>
		<h2><span>NAME : </span> ${employee.name}</h2>
		<br>
		<h2><span>ID : </span> ${employee.id}</h2>
		<br>
		<h2><span>AGE : </span> ${employee.age}</h2>
		<br>
		<h2><span>EMAIL : </span> ${employee.email}</h2>
		<br>
		<h2><span>SALARY : </span> ${employee.salary}</h2>
		<br>
		<h2><span>ROLE : </span> ${employee.role}</h2>
		<br>
	</section>
</body>
</html>