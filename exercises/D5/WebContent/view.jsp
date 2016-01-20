<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "menu.jsp">Go to Menu</a>
<table>
<tr>
<td>Full Name:</td>
<td><%= ("name") %></td>
</tr>
<tr>
<td>Sex:</td>
<td> <%= eemag. %></td>>
</tr>
<tr>
<td>Address:</td>
<td><%= request.getAttribute("address")  %></td>
</tr>
</table>
</body>
</html>