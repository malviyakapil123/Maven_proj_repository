<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-position: top right;
	background-image: url("img/customLogoOuterglow.png");
	background-repeat: no-repeat;
}
</style>
</head>
<body>
	<%
if(session.getAttribute("name")!=null ){
 String f=(String) session.getAttribute("name");
%>
<a href="WelcomeView.jsp">Welcome</a>|
	<a href="Logout.jsp">Logout</a>
	<br>
	<br> Hi,<%=f %>
	<br>
	<br>
	<a href="GetMarksheetView.jsp">Get Marksheet</a>|
	<a href="MarksheetMeritList.html">Marksheet Merit List</a>|
	<a href="ForgetPassword.jsp">My Profile</a>|
	<a href="Myprofile.html">My Profile</a>|
	<a href="ChangePasswordView.jsp">Change Password</a>|
	<a href="http://">Java Doc</a>|
	<a href="AddMarksheet.jsp">Add Marksheet</a>|
	<a href="MarksheetList.html">Marksheet List</a>|
	<a href="http://">Add User</a>|
	<a href="http://">User List</a>|
	<a href="http://">Add College</a>|
	<a href="http://">College List</a>|
	<a href="http://">Add Student</a>|
	<a href="http://">Student List</a>|
	<a href="http://">Add Role</a>|
	<a href="UsreRegistratoin.jsp">User Resistration</a>|
	<a href="http://">Role List</a>||
	<br>
	<br>


	
	<%} else{ %>
	<a href="LoginView.jsp">Login</a>
	<br>
	<br> Hi,Guest
	
	<%} %>
	<hr>

</body>
</html>