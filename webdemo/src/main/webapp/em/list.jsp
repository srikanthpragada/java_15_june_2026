<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="menu.jsp"%>
<title>List Employees</title>
</head>
<body>
	<h1>List Employees</h1>

	<%
	var employees = EmployeeManager.getEmployees();
	if (employees == null) { // error
		out.println("<h2>Sorry! Could not get details! </h2>");
		return;
	}
	%>

	<table style="width: 100%; cellpadding: 5pt" border="1">
		<tr style="font-weight: 800">
			<th>Id</th>
			<th>Name</th>
			<th>Job</th>
			<th>Department</th>
			<th>Salary</th>
			<th></th>
		</tr>

		<%
		while (employees.next()) {
			var id = employees.getInt("emp_id");
		%>
		<tr>
			<td><%=id%></td>
			<td><%=employees.getString("emp_name")%></td>
			<td><%=employees.getString("emp_job")%></td>
			<td><%=employees.getString("emp_dept_id")%></td>
			<td style='text-align:right'><%=employees.getInt("emp_salary")%></td>
			<td style="text-align: center">
			    <a href="edit.jsp?id=<%=id%>">Edit</a>
				<a href="deleteEmployee.jsp?id=<%=id%>"
				   onclick="return confirm('Do you want to delete?')">Delete</a></td>
		</tr>
		<%
		} // while
		%>
	</table>
</body>
</html>