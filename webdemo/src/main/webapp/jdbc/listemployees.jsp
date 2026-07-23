<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*,javax.sql.rowset.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
<style>
  th {
	 background-color:blue;
	 color:white;
}
</style>
</head>
<body>

	<%
	Class.forName("org.sqlite.JDBC"); // Load driver 
	String url = "jdbc:sqlite:c:/classroom/jun15j/payroll.db";

	try (Connection conn = DriverManager.getConnection(url)) {
		CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
		rowSet.setCommand("select * from employees order by emp_name");
		rowSet.execute(conn);
	%>
	<h1>Employees</h1>
	<table border="1" style="width: 100%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Job</th>
			<th>Department</th>
			<th>Salary</th>
		</tr>

		<%
		while (rowSet.next()) {
			int id = rowSet.getInt("emp_id");
			var name = rowSet.getString("emp_name");
			var job = rowSet.getString("emp_job");
			var dept = rowSet.getString("emp_dept_id");
			int salary = rowSet.getInt("emp_salary");
			out.println(String.format("<tr><td>%d</td><td>%s</td><td>%s</td><td>%s</td><td style='text-align:right'>%d</td></tr>", id, name, job, dept,
			salary));
		}
		%>
	</table>

	<%
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>


</body>
</html>