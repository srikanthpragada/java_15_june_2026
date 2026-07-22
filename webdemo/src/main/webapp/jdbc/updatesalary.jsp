<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Salary</title>
</head>
<body>

	<%
	Class.forName("org.sqlite.JDBC");
	String url = "jdbc:sqlite:c:/classroom/jun15j/payroll.db";

	try (Connection conn = DriverManager.getConnection(url)) {

		var employeeId = request.getParameter("id");
		var newSalary = request.getParameter("salary");
		var ps = conn.prepareStatement("update employees set emp_salary = ? where emp_id = ?");
		ps.setString(1, newSalary);
		ps.setString(2, employeeId);

		int count = ps.executeUpdate();
		if (count == 1)
			out.println("<h2>Updated Successfully! </h2>");
		else
			out.println("<h2>Employee Id Not Found! </h2>");
	} catch (Exception e) {
		out.println("<h2>Error : " + e.getMessage() + "</h2>");
	}
	%>

</body>
</html>