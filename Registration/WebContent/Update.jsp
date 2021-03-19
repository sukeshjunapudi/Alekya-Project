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
<form action="UpdateController" method="post">
<h3>Update Your Profile Here</h3>
<table>
<tr>
<!--  <td>Employee Id<input type=text id="empId" name="empId"></td>-->
<td>FirstName<input type=text id="empFirstName" name="empFirstName"></td>
<td>LastName<input type=text id="empLastName" name="empLastName"></td>
<td>Address<input type=text id="empAddress" name="empAddress"></td>
<td>empPan<input type=text id="empPan" name="empPan"></td>
<td>empAadar<input type=text id="empAadar" name="empAadar"></td>
<td>empMobileNo<input type=text id="empMobileNo" name="empMobileNo"></td>
<td>passportNumber<input type=text id="passportNumber" name="passportNumber"></td>
<input type=submit value="update" class="button">
</tr>
</table>
</body>
</html>