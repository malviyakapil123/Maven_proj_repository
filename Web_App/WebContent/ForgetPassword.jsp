<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <style>
        a {
            color: blueviolet;
        }

        body {
            background-position: top right;
            background-image: url("img/customLogoOuterglow.png");
            background-repeat: no-repeat;

        }
    </style>
</head>
<body>
 <a href="http://">Login</a><br><br>
    <a href="http://">Welcome</a>|
    <a href="http://">Logout</a><br><br>
    Hi,admin(Admin) <br><br>
    <a href="GetMarksheet.html">Get Marksheet</a>|
    <a href="MarksheetMeritList.html">Marksheet Merit List</a>|
    <a href="ForgetPassword.jsp">My Profile</a>|
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
    <a href="http://">Role List</a>||<br><br>
    <hr>
    
<form action="ForgetPasswordCtl" method="post">
    <center>
        <h2>Forget Your Password?</h2>
        <h4>submit your Email address and we'll send your password</h4>
        <h5>password is send to your resistration email id</h5>
        <table><tr>
            <th>Email Id:</th>
            <td><input type="text"placeholder="Enter ID Here" name="user"></td>
            <td><input type="submit" value="Go"></td>
        </tr>
        
        </table>
        </form>
        <hr>
    </center>
</body>
</html>