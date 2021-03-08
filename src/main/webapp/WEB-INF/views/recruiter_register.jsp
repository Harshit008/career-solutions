<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">

/* function registration()
{

	var name= document.getElementById("t1").value;
	var email= document.getElementById("t2").value;
	var uname= document.getElementById("t3").value;
	var pwd= document.getElementById("t4").value;			
	var cpwd= document.getElementById("t5").value;
	
    //email id expression code
	var pwd_expression = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])/;
	var letters = /^[A-Za-z]+$/;
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

	if(name=='')
	{
		alert('Please enter your name');
	}
	else if(!letters.test(name))
	{
		alert('Name field required only alphabet characters');
	}
	else if(email=='')
	{
		alert('Please enter your user email id');
	}
	else if (!filter.test(email))
	{
		alert('Invalid email');
	}
	else if(uname=='')
	{
		alert('Please enter the user name.');
	}
	else if(!letters.test(uname))
	{
		alert('User name field required only alphabet characters');
	}
	else if(pwd=='')
	{
		alert('Please enter Password');
	}
	else if(cpwd=='')
	{
		alert('Enter Confirm Password');
	}
	else if(!pwd_expression.test(pwd))
	{
		alert ('Upper case, Lower case, Special character and Numeric letter are required in Password filed');
	}
	else if(pwd != cpwd)
	{
		alert ('Password not Matched');
	}
	else if(document.getElementById("t5").value.length < 6)
	{
		alert ('Password minimum length is 6');
	}
	else if(document.getElementById("t5").value.length > 12)
	{
		alert ('Password max length is 12');
	}
	else
	{				                            
           //alert('Thank You for Signing Up! & You are Redirecting to Recruiter Login');
		   // Redirecting to other page or webste code. 
		   //window.location = "http://localhost:8080/career_solutions_v1/login"; 
	}
} */
function clearFunc()
{
	document.getElementById("t1").value="";
	document.getElementById("t2").value="";
	document.getElementById("t3").value="";
	document.getElementById("t4").value="";
	document.getElementById("t5").value="";
}
</script>

<body>
<!-- Main div code -->
	<div id="main">
	<div class="h-tag">
	<h2>Create Your Account</h2>
	</div>
	<!-- create account div -->
	<div class="login">
	<table cellspacing="2" align="center" cellpadding="8" border="0">
	<form action="sregister" method="post">
	<tr>
	<td align="right">Enter Name :</td>
	<td><input type="text" placeholder="Enter user here" id="t1" class="tb" name="name" /></td>
	</tr>
	<tr>
	<td align="right">Enter Email ID :</td>
	<td><input type="text" placeholder="Enter Email ID here" id="t2" class="tb" name="email"/></td>
	</tr>
	<tr>
	<td align="right">Enter Username :</td>
	<td><input type="text" placeholder="Enter Username here" id="t3" class="tb" name="username"/></td>
	</tr>
	<tr>
	<td align="right">Enter Password :</td>
	<td><input type="password" placeholder="Enter Password here" id="t4" class="tb" name="password"/></td>
	</tr>
	<tr>
	<td align="right">Enter Confirm Password :</td>
	<td><input type="password" placeholder="Enter Password here" id="t5" class="tb" /></td>
	</tr>
	<tr>
	<td></td>
	<td>
	<input type="reset" value="Clear Form" onclick="clearFunc()" id="res" class="btn" />
	<input type="submit" value="Create Account" class="btn" onclick="registration()" /></td>
	</tr>
	</form>
	</table>
	</div>
	<!-- create account box ending here.. -->
	</div>
	<!-- Main div ending here... -->
	
</body>
</html>