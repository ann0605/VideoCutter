<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "NEW.do" method = "post">
		<table border = "0">
			<tr>
				<td>Name:</td>
				<td><input type = "text" name ="name" value = ""></td>
			</tr>
			<tr>	
				<td>Account</td>
				<td><input type = "text" name = account value = ""></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type = "password" name = "password" value = ""></td>
			</tr>
			<tr><td colspan = "2">
				<input type ="submit" name = "Add" value = "Add">
			</td></tr>
		</table>
	</form> 
</body> 
</html>