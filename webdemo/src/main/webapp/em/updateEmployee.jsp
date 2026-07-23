<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="menu.jsp"%>
<title>Update Employee</title>

</head>
<body>
	<%
      var result = EmployeeManager.updateEmployee(
    		  Integer.parseInt(request.getParameter("id")),
    		  request.getParameter("name"),
    		  request.getParameter("job"),
    		  request.getParameter("dept"),
    		  Integer.parseInt(request.getParameter("salary"))
    		  );
    		 
      if(result == null)  // success 
    	  out.println("<h2>Updated Employee Successfully!</h2>");
      else
    	  out.println("<h3>Sorry! Could not update employee due to error :" + result.getMessage() + "</h3>");
   %>

</body>
</html>