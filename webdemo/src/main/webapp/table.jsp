<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table</title>
<style>
td {
	text-align: right;
	padding: 5pt;
}
</style>
</head>
<body>
	<h1>Math Table</h1>
	<form>
		Number : <input type="number" name="num" required 
		                value="${param.num}" />
		<p></p>
		<button>Submit</button>
	</form>

	<%
	var input = request.getParameter("num");
	if (input == null)
		return; // terminate JSP

	var num = Integer.parseInt(input);
	%>
	<h2>Table</h2>
	<table border="1">
		<tr>
			<th>Number</th>
			<th>Multiplier</th>
			<th>Result</th>
		</tr>

		<%
		for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<td><%=num%></td>
			<td><%=i%></td>
			<td><%=num * i%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>