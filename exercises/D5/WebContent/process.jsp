<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Processing</title>
</head>
<body>
<%! String nextPage; %>
<%
	if(request.getParameter("list")!=null){
		System.out.println("Clicked List Button");
		nextPage = "list.jsp";
	} else if(request.getParameter("add")!=null){
		System.out.println("Clicked Add Button");
		nextPage = "add.jsp";
	}
%>a
<jsp:forward page = "<%= nextPage %>"/>
</body>
</html>