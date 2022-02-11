<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<%@ include file="Header.jsp" %>

    <center>
        <h2>User Registration</h2>
        
        
        
        <form action="UserRegistrationCtl" method="post" onsubmit="return checkPassword(this);"> 
        <table>
            <tr>
                <th>First Name*</th>
                <td><input type="text" name="fname" pattern="[A-Z]{1}[a-zA-Z]{2,30}" required title="First Letter should be Capital"></td>
                <td style="color: red;">First name is required</td>
            </tr>
            <tr>
                <th>Last Name*</th>
                <td><input type="text" name="lname" pattern="[A-Z]{1}[a-zA-Z]{2,30}" required title="First Letter should be Capital"></td>
                <td style="color: red;">Last name is required</td>
            </tr>
            <tr>
                <th>LoginId*</th>
                <td><input type="email" name="login"></td>
                <td style="color: red;">LoginId is required</td>
            </tr>
            <tr>
                <th>Password*</th>
                <td><input type="text" name="pwd" required pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$" title="Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character"></td>
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

    <script src="Script.js"></script>
    
<%@ include file="Footer.jsp" %>


</body>
</html>