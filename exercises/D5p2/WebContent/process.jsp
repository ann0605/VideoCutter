<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ page import = "D5p2.LoginBL"%>
<body>

<h1>Processing</h1>
<jsp:useBean id = "myBean" scope = "session" class = "D5p2.LoginBean"/>
<jsp:setProperty name = "myBean" property = "*"/>
<%
	LoginBL businessLogic = new LoginBL(myBean);
	if(businessLogic.isAuth()){
		response.sendRedirect("menu.jsp");
	} else{
		response.sendRedirect("error.jsp");
	}
%>

</body>
</html>