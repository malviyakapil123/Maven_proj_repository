<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 String s= (String) request.getAttribute("hi");
String s1 = (String) request.getAttribute("n");
%>
<%="("+ s +")"+"("+ s1 +")" %>

	<center>
		<h1 style="color: blue">Welcome to Rays</h1>
	</center>
</body>
</html>