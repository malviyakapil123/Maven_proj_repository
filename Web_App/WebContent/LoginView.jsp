<%@page import="javax.lang.model.type.NullType"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>


	<form action="LoginCtl" method="post">

		<h2 align="center">Login</h2>

		<%
			if (request.getAttribute("error") != null) {
				String e = (String) request.getAttribute("error");
		%>
		<h3 style="color: red" align="center"><%=e%></h3>
		<%
			}
		%> 
		<%
			if (request.getAttribute("e") != null) {
				String s = (String) request.getAttribute("e");
		%>
		<h3 style="color: Green" align="center"><%=s%></h3>
		<%
			}
		%>
		<table align="center">
			<tr>
				<th>LoginId*</th>
				<td><input type="email" name="user"></td>

			</tr>
			<tr>
				<th>Password*</th>
				<td><input type="password" name="pwd"></td>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SignIn" name="operation"><input
					type="button" value="reset" name="cancel"></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="UserRegistration.jsp">Create new account</a>|</td>
				<td><a href="ForgetPassword.jsp">Forget Password</a></td>
			</tr>

		</table>
	</form>
	<%@ include file="Footer.jsp"%>

</body>
</html>