<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
<style>
#employee {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#employee td, #employee th {
  border: 1px solid #ddd;
  padding: 8px;
}

#employee tr:nth-child(even){background-color: #f2f2f2;}

#employee tr:hover {background-color: #ddd;}

#employee th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body style="text-align:center;">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Welcome Admin</h1>
<br><br>
	<h2>All the Employee Details of Publicis Sapient</h2>
	<br>
	<br>
	<table border="1" style="margin-left: auto; margin-right: auto;" id="employee">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Role</th>
		</tr>
		<c:forEach items="${emplist}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.email}</td>
				<td>${emp.age}</td>
				<td>${emp.salary}</td>
				<td>${emp.role}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>

</body>
</html>