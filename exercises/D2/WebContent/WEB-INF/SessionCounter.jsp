<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import = "D2.SessionCounter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SessionCounter</title>
</head>
<body>
<h1>Session Counter</h1>
There are currently <%="SessionCounter.getNumberOfSessions()"%> active sessions
</body>
</html>