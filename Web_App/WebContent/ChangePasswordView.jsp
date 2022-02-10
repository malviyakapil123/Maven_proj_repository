<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <hr>
    <center>
        <h2>Change Password</h2>
        <form action="LoginCtl" method="post">
        <table>
            <tr>
                <th>Old Password</th>
                <td><input type="text"></td>
                <td style="color: red;">Old Password is required</td>
            </tr>
            <tr>
                <th>Old Password</th>
                <td><input type="text"></td>
                <td>New Password is required</td>
            </tr>
            <tr>
                <th>Old Password</th>
                <td><input type="text"></td>
                <td>Confirm Password is required</td>
            </tr> <tr>
                <th></th>
                <td><input type="submit" value="Change My Password"></td>
                <td><input type="submit" value="Save"></td>
               </tr>
        </table>
        </form>
        <hr>
        
    </center>
</body>
</html>