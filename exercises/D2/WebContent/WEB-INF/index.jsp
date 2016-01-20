<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Shop Stop</title>
</head>
<body>
The time and date now is <%=session.getAttribute("NOW") %>><br>
The session creation time is <%=session.getAttribute("CREATION") %>><br>
The last time the session was accessed is<%=session.getAttribute("LAST") %>><br>

</body>
</html>