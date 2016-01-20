<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
	<body>
	<form action = "tester" method = "POST">
			<h1>Video Player</h1>
			<table>
			 <c:forEach begin="1" end="5">
			  <tr>
			  <c:forEach begin="1" end="3">  
			    <td>
			      <img alt="No picture" src="resources/images/limon1.jpg" height = "30" width = "30">
			      <input type="checkbox"/>
			    </td>
			  </c:forEach>
			  </tr>
			</c:forEach>
				<tr>
				<td><input type = "submit" value ="A" name = "buttonA"></td>
				<td><input type = "submit" value ="B" name = "buttonB"></td>
				<td><input type = "submit" value ="C" name = "buttonC"></td>
				</tr>
			</table>
			The button clicked: ${letter}
		</form>
	</body>
</html>