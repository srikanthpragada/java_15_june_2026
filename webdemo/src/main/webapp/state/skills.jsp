<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies</title>
</head>
<body>

	<h2>Skills</h2>
	<form action="skills.jsp">
		Skill : <input type="text" name="skill" />
		<p></p>
		<input type="submit" value="Submit" />
	</form>

	<%
	String skill = request.getParameter("skill");
	if (skill != null) {
		Object data = session.getAttribute("skills");
		TreeSet<String> skills;

		if (data == null)
			skills = new TreeSet<>(); // Empty 
		else
			skills = (TreeSet<String>) data;

		skills.add(skill);
		session.setAttribute("skills", skills);
		out.println("<h3>Added Skill </h3>");
	}
	%>


	<p></p>
	<a href="listskills.jsp">List Skills</a>

</body>
</html>