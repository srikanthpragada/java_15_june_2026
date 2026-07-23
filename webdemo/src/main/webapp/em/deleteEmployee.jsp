<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="menu.jsp"%>
<title>Delete Employee</title>

</head>
<body>
	<%
	var id = Integer.parseInt(request.getParameter("id"));
	var result = EmployeeManager.deleteEmployee(id);

	if (result == null)
		out.println("<h2>Deleted Employee with id [" + id + "] Successfully!</h2>");
	else
		out.println("<h3>Sorry! Could not delete employee due to error :" + result.getMessage() + "</h3>");
	%>

</body>
</html>