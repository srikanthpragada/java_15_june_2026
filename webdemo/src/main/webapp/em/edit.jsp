<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="menu.jsp"%>
<title>Update Employee</title>
</head>
<body>
	<%
	var id = Integer.parseInt(request.getParameter("id"));
	var employee = EmployeeManager.getEmployee(id);
	if (employee == null || !employee.next()) {
		out.println("<h3>Sorry! Invalid Employee Id</h3>");
		return;
	}
	%>

	<h1>Update Employee</h1>
	<form action='updateEmployee.jsp' method="post">
	   
		Employee Name <br /> <input type="text" name="name"
			value='<%=employee.getString("emp_name")%>' required />
		<p></p>
		Employee Job <br /> <input type="text" name="job"
			value='<%=employee.getString("emp_job")%>' required />
		<p></p>
		Employee Department <br /> <input type="text" name="dept"
			value='<%=employee.getString("emp_dept_id")%>' required />
		<p></p>
		Employee Salary <br /> <input type="number" name="salary"
			value='<%=employee.getInt("emp_salary")%>' required />
		<p></p>
		<input type="submit" value="Update" /> 
		<input type="text" name="id" value="<%=id%>" hidden='true' />
 
	</form>
	<p/>
	
    <a href="#" onclick="history.back()">Go Back</a>

</body>
</html>
