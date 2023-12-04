<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <style>

body {
	
	
	
  /* background-image: url('img/rohit.jpg');
	 */}
</style>


	<form action="UserCtl" method="post"> 
		<table>
			<tr>
				<th>  <p style="color: red;">FirstName :</p></th>
				<td><input type="text" placeholder = "Enter Your Name"  name="FirstName"></td>
			</tr>
			<tr>
				<th> <p style="color: blue;">LastName :</p></th>
				<td><input type="text" placeholder = "Enter Your Name"  name="LastName"></td>
			</tr>
			<tr>
				<th> <p style="color: red;">LoginId :</p></th>
				<td><input type="text" placeholder = "Enter Your LoginId"  name="LoginId"></td>
			</tr>
			<tr>
				<th><p style="color: blue;">Password :</p></th>
				<td><input type="Password"  placeholder = "Enter Your Password" name="Password"></td>
			</tr>
			
			<tr>
				<th><p style="color: blue;">Address :</p></th>
				<td><input type="text" placeholder = "Enter Your Address"  name="Address"></td>
			</tr>
			
			<tr>
				<th></th>
				<td><input type="submit" name = "operation" value="SignUp"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name = "operation" value="SignIn"></td>
			</tr>
		</table>
	</form>
</body>
</html>


