<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,javax.sql.rowset.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>

	<%
	Class.forName("org.sqlite.JDBC");
	String url = "jdbc:sqlite:c:/classroom/jun15j/payroll.db";

	try (Connection conn = DriverManager.getConnection(url)) {
		CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
		rowSet.setCommand("select * from employees");
		rowSet.execute(conn);

		while (rowSet.next()) {
			int id = rowSet.getInt("emp_id");
			String name = rowSet.getString("emp_name");
			int salary = rowSet.getInt("emp_salary");
			out.println(String.format("%s - %d",name, salary) + "<p/>");
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

</body>
</html>