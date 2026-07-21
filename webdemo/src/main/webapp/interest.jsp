<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interest</title>
</head>
<body>
	<h1>
		<%
		try {
			var amount = Integer.parseInt(request.getParameter("amount"));
			var interest = amount * 12 / 100;
			out.println("Interest = " + interest);
		} catch (Exception ex) {
			out.println("Sorry! Invalid input. Please enter a valid number!");
		}
		%>
	</h1>
</body>
</html>