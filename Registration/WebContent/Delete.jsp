<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vtalent.bean.EmpBean" %>
    <%@ page import="com.vtalent.service.ServiceImplement" %>
     <%@ page import="com.vtalent.service.Service" %>
     <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Delete">
<table>
<tr>
<td>Enter FirstName To Delete</td>
<td><input type="text" name="empFirstName"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Delete"/></td>
</tr>
</table>
</form>

</body>
</html>