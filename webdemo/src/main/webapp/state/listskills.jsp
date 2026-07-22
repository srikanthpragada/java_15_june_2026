<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Skills</title>
</head>
<body>
  	<%
		TreeSet<String> skills = (TreeSet<String>) session.getAttribute("skills");
		if (skills == null)
			out.println("<h2>Sorry! No skills found! </h2>");
		else {
			out.println("<h1>Skills</h1>");
			out.println("<ul>");
			for (String skill : skills) {
				out.println("<li>" + skill + "</li>");
			}
			out.println("</ul>");
		}
		%>
	
</body>
</html>