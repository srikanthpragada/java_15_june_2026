<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A</title>
</head>
<body>
  <h1>A</h1>
  <jsp:forward page="b.jsp">
      <jsp:param value="Vizag" name="city"/>
  </jsp:forward>
</body>
</html>