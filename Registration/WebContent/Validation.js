function FormValidation(){
		var empFirstName=document.getElementById("empFirstName").value;
		var empLastName=document.getElementById("empLastName").value;
		var empAddress=document.getElementById("empAddress").value;
		var empPan=document.getElementById("empPan").value;
		var empAadar=document.getElementById("empAadar").value;
		var empMobileNo=document.getElementById("empMobileNo").value;
		var passportNumber=document.getElementById("passportNumber").value;
		var empId=document.getElementById("empId").value;
		
		if(empFirstName==null||empFirstName=="")
		{
		document.getElementById("errorMsg1").innerHTML=("please enter firstName");
		return false;
		}
	
	else if(empLastName==null||empLastName=="")
		{
		document.getElementById("errorMsg2").innerHTML=("please enter lastName");
		return false;
		}
		else if(empAddress==null||empAddress=="")
		{
		document.getElementById("errorMsg3").innerHTML=("please enter address");
		return false;
		}
		
		else if(empPan==null||empPan=="")
		{
		document.getElementById("errorMsg4").innerHTML=("please enter pannum");
		return false;
		}
		else if(empAadar==null||empAadar=="")
		{
		document.getElementById("errorMsg5").innerHTML=("please enter Aadar");
		return false;
		}
		else if(empMobileNo==null||empMobileNo=="")
		{
		document.getElementById("errorMsg6").innerHTML=("please enter MobileNum");
		return false;
		}
		else if(passportNumber==null||passportNumber=="")
		{
		document.getElementById("errorMsg7").innerHTML=("please enter passport no");
		return false;
		}
		else if(empId==null||empId=="")
		{
		document.getElementById("errorMsg8").innerHTML=("please enter id");
		return false;
		}
		
		
		else{
			return true;
		}
}

function clearAllError()
		{
			document.getElementById("errorMsg1").innerHTML=""; 
			document.getElementById("errorMsg2").innerHTML="";
			document.getElementById("errorMsg3").innerHTML="";
			document.getElementById("errorMsg4").innerHTML="";
			document.getElementById("errorMsg5").innerHTML="";
			document.getElementById("errorMsg6").innerHTML="";
			document.getElementById("errorMsg7").innerHTML="";
		}
