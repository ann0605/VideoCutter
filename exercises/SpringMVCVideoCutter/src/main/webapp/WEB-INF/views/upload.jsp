<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<form:form method ="POST" action= "uploadvideo" ecntype ="multipart/form-data">
<table>
	<tr>
		<td>Please Upload Your Video</td>
		<td><input type = "file" name = "file"/>
		<input type = "submit" value ="Upload" >
		 </td>
	</tr>>
	<tr>
	<td>PREVIEW</td>
	<td>VIDEO HERE video src = "webapps/uploads/ ${fileName}"</td> 
	</tr>>
	
</table>

</form:form>		
		
</body>
</html>
