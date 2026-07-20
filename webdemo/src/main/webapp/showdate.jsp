<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    import="java.time.LocalDateTime"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DateTime</title>
</head>
<body>
	<h1 style='color:blue'>
        Current DateTime : 
		<%
		// Take system datetime and send it to client
		var ct = LocalDateTime.now();
		out.println(ct.toString());
		%>
	</h1>

</body>
</html>