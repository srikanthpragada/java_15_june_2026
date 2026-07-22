<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select City</title>
</head>
<body>
    <h1>Select City</h1>

	<form action="selectcity.jsp">
		Select City : <select name="city">
			<option value="Vizag">Vizag</option>
			<option value="Hyderabad">Hyderabad</option>
			<option value="Chennai">Chennai</option>
			<option value="Bangalore">Bangalore</option>
		</select>
		<p></p>
		<input type="submit" value="Submit" />
	</form>

	<%
	String cityName = request.getParameter("city");
	if (cityName == null)
		return;

	// create a cookie
	Cookie c = new Cookie("city", cityName);
	c.setMaxAge(7 * 24 * 60 * 60);  // 7 days
	response.addCookie(c);
	response.sendRedirect("listmovies.jsp");
	%>

</body>
</html>