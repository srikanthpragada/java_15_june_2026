<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="menu.jsp"%>
<title>Add Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
	<form action="addEmployee.jsp" method="post">
		Employee Name <br /> <input type="text" name="name" required />
		<p></p>
		Employee Job <br /> <input type="text" name="job" required />
		<p></p>
		Employee Department <br /> <input type="text" name="dept" required />
		<p></p>
		Employee Salary <br /> <input type="int" name="salary" required />
		<p></p>
		<input type="submit" value="Add" />
		<input type="reset" value="Clear All" />
	</form>
</body>
</html>