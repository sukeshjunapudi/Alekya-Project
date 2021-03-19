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
<table>

<tr>

<th>EmployeeId</th>
<th>EmployeeFirstName</th>
<th>EmployeeLastName</th>
<th>EmployeeAddress</th>
<th>pan</th>
<th>Aadhar</th>
<th>mobile</th>
<th>passport</th>
</tr>
<%
Service service = new ServiceImplement();
List<EmpBean> emplist = service.getAllEmployees();
if(null != emplist && !emplist.isEmpty()){
	for(EmpBean employee: emplist){
		%>
		<tr><td><%=employee.getEmpId() %></td>
		<td><%=employee.getEmpFirstName() %></td>
		<td><%=employee.getEmpLastName() %></td>
		<td><%=employee.getEmpAddress() %></td>
		<td><%=employee.getEmpPan() %></td>
		<td><%=employee.getEmpAadar() %></td>	
		<td><%=employee.getEmpMobileNo() %></td>		
		<td><%=employee.getPassportNumber() %></td>
		<% 
	}
}else{
	out.print("No Data Found");
}
%>
</table>
</body>
</html>