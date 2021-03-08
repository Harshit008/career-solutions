<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Career Solutions</title>
</head>
<body>
<h2>Recruiter login Page</h2>
<a href="job"> 
	<button>Job Seeker Login</button>
</a>
<form action="slogin" method="post">
<table>
	<tr>
		<td>Username: </td>
		<td><input type="text" name="uname"></td>
	</tr>
	
	<tr>
		<td>password: </td>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="Submit"></td>
	<td align="center">
			</form>
		<form action="recruiter_register">
		<input type="submit" value="Recruiter Signup"/>
	</form>
		</td>
	</tr>
	</table>
	

</body>
</html>