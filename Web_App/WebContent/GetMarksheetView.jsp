<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        
       
        .table{
            border-collapse: collapse;
            width: 90%;
        }
        </style>

</head>
<body>
<%@ include file="Header.jsp" %>
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
 <%if(request.getAttribute("id")!=null){
	String a= (String) request.getAttribute("id");
	String b= (String) request.getAttribute("Rn");
	String c= (String) request.getAttribute("fn");
	String d= (String) request.getAttribute("ln");
	String e= (String) request.getAttribute("ph");
	String f= (String) request.getAttribute("ch");
	String g= (String) request.getAttribute("ma");
  %>
  <center>
  <table class="table" border="1">
  <tr>
  <th>Id*</th>
  <th>RollNo*</th>
  <th>FirstName*</th>
  <th>LastName*</th>
  <th>Physics*</th>
  <th>Chemisty*</th>
  <th>Mathematics*</th>
  
  </tr>
  <tr>
  <td><%=a %></td>
  <td><%=b %></td>
  <td><%=c %></td>
  <td><%=d %></td>
  <td><%=e %></td>
  <td><%=f %></td>
  <td><%=g %></td>
  </tr>
  
  </table>
  </center>
 <%} %>
 
 <%@ include file="Footer.jsp" %>
</body>
</html>