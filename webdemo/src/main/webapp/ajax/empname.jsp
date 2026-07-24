<%@page import="em.EmployeeManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String name = EmployeeManager.getEmployeeName(id);
out.println(name);
%>