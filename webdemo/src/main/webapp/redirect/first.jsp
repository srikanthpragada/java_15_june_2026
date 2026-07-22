<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
    <h1>First</h1>
    <%
        response.sendRedirect("second.jsp?city=Bangalore");
    %>

</body>
</html>