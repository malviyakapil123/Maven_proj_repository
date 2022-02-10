<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="http://">Welcome</a>|
	<img style="margin-left: 85%;" src="img/customLogoOuterglow.png" alt="">
	<a href="http://">Logout</a>
	<br>
	<br> Hi,admin(Admin)
	<br>
	<br>
	<a href="GetMarksheet.html">Get Marksheet</a>|
	<a href="MarksheetMeritList.html">Marksheet Merit List</a>|
	<a href="Myprofile.html">My Profile</a>|
	<a href="ChangePassword.html">Change Password</a>|
	<a href="http://">Java Doc</a>|
	<a href="AddMarksheet.html">Add Marksheet</a>|
	<a href="MarksheetList.html">Marksheet List</a>|
	<a href="http://">Add User</a>|
	<a href="http://">User List</a>|
	<a href="http://">Add College</a>|
	<a href="http://">College List</a>|
	<a href="http://">Add Student</a>|
	<a href="http://">Student List</a>|
	<a href="http://">Add Role</a>|
	<a href="UsreResistratoin.html">User Resistration</a>|
	<a href="http://">Role List</a>||
	<br>
	<br>
	<hr>
	<center>
		<h2>Add Marksheet</h2>

		<%
			if (request.getAttribute("m") != null) {
				String t = (String) request.getAttribute("m");
		%>



		<h3 style="color: green;"><%=t%>
		</h3>
		<%
			}
		%>
		<form action="AddMarksheetCtl" method="post">
			<table>
				<tr>
					<th>Id*</th>
					<td><input type="text" name="Id"></td>
					<td style="color: red;">Roll Number is required</td>
				</tr>
				<tr>
					<th>Rollno*</th>
					<td><input type="text" name="Rollno"></td>
					<td style="color: red;">Roll Number is required</td>
				</tr>
				<tr>
					<th>FirstName*</th>
					<td><input type="text" name="fn"></td>
					<td style="color: red;">FirstName is required</td>

				</tr>
				<tr>
					<th>LastName*</th>
					<td><input type="text" name="ln"></td>
					<td style="color: red;">LastName is required</td>

				</tr>
				<tr>
					<th>Physics</th>
					<td><input type="text" name="phy"></td>
					<td style="color: red;">Marks can not be greater then 100</td>
				</tr>
				<tr>
					<th>Chemistry</th>
					<td><input type="text" name="che"></td>
					<td style="color: red;">Marks can not be greater then 100</td>
				</tr>
				<tr>
					<th>Maths</th>
					<td><input type="text" name="maths"></td>
					<td style="color: red;">Marks can not be greater then 100</td>
				</tr>
			</table>
			<input value="Save" type="submit"> <input value="Cancel"
				type="submit">

		</form>
	</center>
	<hr>
</body>
</html>