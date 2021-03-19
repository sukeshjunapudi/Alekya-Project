<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.vtalent.bean.EmpBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function myFunctionWindow() {
  var myWin = window.open("", "MsgWindow", "width=500,height=500");
  myWin.document.write("<p>This is 'MsgWindow' opens in web browser. Please close it..</p>");
}
</script>
</head>
<body>
<h2>Hi</h2>
<%Object obj=session.getAttribute("empLastName");
EmpBean ref=(EmpBean)obj;
%>


<h3>Fname:</h3><%=ref.getEmpFirstName() %>

<h3>Lname</h3><p><%=ref.getEmpLastName() %>
<h3>Address</h3><%=ref.getEmpAddress() %>
<h3>MobileNo</h3><%=ref.getEmpMobileNo() %>

<button onclick="myFunctionWindow()">Try it</button>

</body>
</html>