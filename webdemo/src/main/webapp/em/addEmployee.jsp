<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="menu.jsp"%>
<title>Add Employee</title>

</head>
<body>
	<%
      var result = EmployeeManager.addEmployee(
    		  request.getParameter("name"),
    		  request.getParameter("job"),
    		  request.getParameter("dept"),
    		  Integer.parseInt(request.getParameter("salary"))
    		  );
    		 
      if(result == null)    // success
    	  out.println("<h2>Added Employee Successfully!</h2>");
      else  // Error 
    	  out.println("<h3>Sorry! Could not add employee due to error :" + result.getMessage() + "</h3>");
   %>

</body>
</html>