<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>The customer information is inserted successfully</title>
</head>
<body>
<table>
<tr>
<td>Name</td>
<td><%= request.getParameter("name") %> ></td>
</tr>
<tr>
<td>Account</td>
<td><%= request.getParameter("account") %> ></td>
</tr>
<tr>
<td>Password</td>
<td>******</td></tr>
</table>
</body>
</html>