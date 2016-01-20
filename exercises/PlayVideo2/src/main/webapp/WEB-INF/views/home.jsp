<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action = "playvideo", method = "GET">
<h1>Video Player
</h1>
<table>
<tr>
<td>Playing name.avi</td>
</tr>
</table>
<video controls autoplay width="512" height="288">
        <source src="Users/AnnDang/Documents/Park Project/THDC_Videos/1-2.mov"/></source>
    </video>
    </form>
    </body>
</html>