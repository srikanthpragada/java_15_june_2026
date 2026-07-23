<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="menu.jsp"%>

<body>
	<h1>Summary</h1>
	<%
	var rowset = EmployeeManager.getSummary();
	if (rowset == null)
		out.println("<h2>Sorry! Could not get details! </h2>");
	else {
		rowset.next(); // move first record 
		int employeeCount = rowset.getInt("employeeCount");
		double avgSalary = rowset.getDouble("averageSalary");
	%>

	<table cellpadding="5pt" border="1">
		<tr>
			<th style="text-align: left">Number of Employees</th>
			<td style="text-align: right"><%=employeeCount%></td>
		</tr>
		<tr>
			<th style="text-align: left">Average Salary</th>
			<td style="text-align: right"><%=String.format("%.0f", avgSalary)%>
			</td>
	</table>
	<%
	}
	%>

</body>
</html>