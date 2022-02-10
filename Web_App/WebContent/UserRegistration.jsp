<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div class="div1">
<img style="margin-left: 85%;" src="img\customLogoOuterglow.png" alt="image not found"></div>
<div class="div2">
<a href="http://">Login</a><br><br> 

    <a href="http://">Welcome</a>|
    <a href="http://">Logout</a><br><br>
    Hi,admin(Admin) <br><br></div>
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
        <h2>User Registration</h2>
        
        <% %>
        
        <form action="UserRegistrationCtl" method="post"> 
        <table>
            <tr>
                <th>First Name*</th>
                <td><input type="text" name="fname"></td>
                <td style="color: red;">First name is required</td>
            </tr>
            <tr>
                <th>Last Name*</th>
                <td><input type="text" name="lname"></td>
                <td style="color: red;">Last name is required</td>
            </tr>
            <tr>
                <th>LoginId*</th>
                <td><input type="text" name="login"></td>
                <td style="color: red;">LoginId is required</td>
            </tr>
            <tr>
                <th>Password*</th>
                <td><input type="text" name="pwd"></td>
                <td style="color: red;">Password is required</td>
            </tr>
            <tr>
                <th>Confirm Password*</th>
                <td><input type="text" name="cpwd"></td>
                <td style="color: red;">Confirm Password is required</td>
            </tr>
            <tr>
                <th>Gender</th>
                <td><select name="gender" style="width: 145px">
                
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="Other">Other</option>
                    </select></td>
            </tr>
            <tr>
                <th>Date of birth</th>
                <td><input type="date" name=dob></td>
                <td style="color: red;">Date of birth is required</td>
            </tr>
            <tr>
            <td></td>
            <td><input type="submit" value="Signin" name="operation"></td>
            </tr>
        </table>
        </form>
    </center>

</body>
</html>