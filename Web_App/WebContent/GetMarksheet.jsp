<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        
        body{ background-position:top right;
            background-image:url("img/customLogoOuterglow.png") ;
                             background-repeat:no-repeat ;
                             
        }
        </style>
</head>
<body>
   <a href="http://">Welcome</a>|
    <a href="http://">Logout</a><br><br>
    Hi,admin(Admin) <br><br>
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
    <a href="http://">Role List</a>||<br><br>
    <hr>
    <center>
    <h2>Get Marksheet</h2>
   <form action="GetMarksheetCtl" method="post">
    <table>
        <tr>
            <th>Roll No:</th>
            <td><input type="text" name="roll" required="required"></td>
            
        </tr>
        <tr> 
            <td><input type="submit" value="Go"></td>
        </tr>
    </table>
    </form>
</center>
<hr>
</body>
</html>