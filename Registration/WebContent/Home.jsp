<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.vtalent.bean.EmpBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	  <link rel="stylesheet" media="all" href="stylesheets/bootstrap.css"/>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="Validation.js"></script>
	

	</style>
	<style type="text/css">

body{
	background-color: lightblue;
	background-image:url("1.jpg");
	}
</style>
</head>

<body>



<form action="RegisterController" method="post">

<center>
<h2>Registration Form</h2>
<div class="row">

<div class=col-md-8>
	Employee Id:<font color="red">*</font> <input type=text id="empId" name="empId" onkeypress="clearAllError()">
	<p id="errorMsg9" style="color: red;"></p>
</div>

<div class=col-md-8>
	First Name:<font color="red">*</font> <input type=text id="empFirstName" name="empFirstName" onkeypress="clearAllError()">
	<p id="errorMsg1" style="color: red;"></p>
</div>


<div class=col-md-8>
	Last Name:<font color="red">*</font> <input type=text
		onkeypress="clearAllError()" id="empLastName" name="empLastName">
	<p id="errorMsg2" style="color: red;"></p>
</div>

<div class=col-md-8>
Address:<font color="red">*</font> <input type=text
	onkeypress="clearAllError()" id="empAddress" name="empAddress">
<p id="errorMsg3" style="color: red;"></p>
</div>


<div class="col-md-8" >
Pan Number:<font color="red">*</font> <input type=text
	onkeypress="clearAllError()" id="empPan" name="empPan">
<p id="errorMsg4" style="color: red;"></p>
</div>

<div class="col-md-8" >
Aadhar Num:<font color="red">*</font> <input type=text
	onkeypress="clearAllError()" id="empAadar" name="empAadar">

<p id="errorMsg5" style="color: red;"></p>
</div>

<div class="col-md-8">
Mobile Num:<font color="red">*</font> <input type=text
	onkeypress="clearAllError()" id="empMobileNo" name="empMobileNo">

<p id="errorMsg6" style="color: red;"></p>
</div>

<div class="col-md-8">
Passport Number:<font color="red">*</font> <input type=text
	onkeypress="clearAllError()" id="passportNumber" name="passportNumber">

<p id="errorMsg7" style="color: red;"></p>
</div>

<div class="col-md-8">
<input type=submit onclick="return FormValidation()"
	value="submit" class="button">
	</div></div>
	
	</form>
	
	
</center>
</body>
</html>
