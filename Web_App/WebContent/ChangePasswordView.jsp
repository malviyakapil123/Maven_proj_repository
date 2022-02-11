<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp" %>
 
    <center>
        <h2>Change Password</h2>
        <form action="LoginCtl" method="post">
        <table>
            <tr>
                <th>Old Password</th>
                <td><input type="text"></td>
                
            </tr>
            <tr>
                <th>New Password</th>
                <td><input type="text"></td>
                
            </tr>
            <tr>
                <th>Confirm New Password</th>
                <td><input type="text"></td>
                
            </tr> <tr>
                <th></th>
                <td><input type="submit" value="Change My Password"></td>
                <td><input type="submit" value="Save"></td>
               </tr>
        </table>
        </form>
        
        
    </center>
    <%@ include file="Footer.jsp" %>
</body>
</html>