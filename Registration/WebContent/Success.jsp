<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vtalent.bean.EmpBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginPage" method="post">
<h1> welcome </h1>
<%Object obj=session.getAttribute("empLastName");
EmpBean ref=(EmpBean)obj;
%>
<%=ref.getEmpFirstName() %>

<td>
<input type=submit id="sub" name="sub" value="submit" class="button"></td>
</body>
</html>