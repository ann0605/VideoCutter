<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
This is the login page. Current time is <%= session.getAttribute("TODAY") %> 
<form action = 'LogonServlet' method = 'POST'>
Email:<input type = 'text' name = 'Email'/><br>
Password: <input type = 'password' name = 'Password'/><br>
<input type = 'submit' value = 'Logon'/>
</form>
</body>
</html>