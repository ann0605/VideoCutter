<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form method = "GET" action = "submitName">
	<table>
		<tr>
			<td><h1>Your Full Name:</h1></td>
			<td><input type = "text" name = "userName" value =""/></td>
		</tr>
		<tr>
			<td><input type = "submit" name = "submitButton" value = "OK"></td>
		</tr>
		<tr><td>${message}</td>
		</tr>
	</table>

	</form>
</body>
</html>