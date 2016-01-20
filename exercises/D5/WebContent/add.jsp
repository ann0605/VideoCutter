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
		<form action ="add.jsp">
			Name*:&nbsp;&nbsp;<input type = "input" name = "fullName" value="">
			<br/>
			Sex:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name = "sex">
				<option></option>
				<option name = "male">Male</option>
				<option name = "female">Female</option>
			</select>
			<br/>
			Address:<textarea name = "address" cols ="10" rows = "3"></textarea>
			<br/><br/>
			<input type = "submit" name = "create" value = "Create">
		</form>
	</body>
	<%! boolean createSuccess; %>
	<%
		createSuccess = false;
		if((request.getParameter("create")!=null)
		&&(!"".equals(request.getParameter("fullName")))){
			String fullName = request.getParameter("fullName");
			String sex = request.getParameter("sex");
			String address = request.getParameter("address");
			
			System.out.println("eemag.add:fullName = " + fullName);
			System.out.println("eemag.add:sex = " + sex);
			System.out.println("eemag.add:address = " + address);
			createSuccess = true;
		}
	%>
	<% if(createSuccess){ %>
	<jsp:forward page = "view.jsp"/>
	<% } %>
</html>