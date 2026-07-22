<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Movies</title>
</head>
<body>
   <h1>Movies</h1>
	<%
	Cookie cookies[] = request.getCookies();
	// check whether a cookie with name city is present 
	String city = null;
	if (cookies != null) {
		for (Cookie c : cookies) {
			if (c.getName().equals("city")) {
				city = c.getValue();
				break;
			}
		}
	}

	if (city == null) {
		response.sendRedirect("selectcity.jsp");
	}
	%>

	<h2>
		Movies in [<%=city%>] 
		<p></p>
		<a href="selectcity.jsp">Change</a>
	</h2>



</body>
</html>