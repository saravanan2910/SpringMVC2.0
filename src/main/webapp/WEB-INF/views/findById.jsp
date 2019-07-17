<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style>
/* Set a style for all buttons */
button {
text-align:center;
  background-color: #4CAF50;
  color: white;
  padding: 10px 0;
  margin: 8px 20px;
  border: none;
  cursor: pointer;
  width: 60%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Float cancel and signup buttons and add an equal width */
.signupbtn {
  width: 10%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}
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
		<h1>Employee Details for Id  : ${employee.id}</h1>
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

<form:form action="delete" method="post" modelAttribute="employee">
  <div class="container">
 
    <form:input type="hidden" path="id" />

    <div class="clearfix">
      <button type="submit" class="signupbtn">DELETE</button>
    </div>

  </div>
</form:form>
</body>
</body>
</html>