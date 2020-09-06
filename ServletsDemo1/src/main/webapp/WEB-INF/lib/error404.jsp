<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Error Page ${pageContext.errorData.statusCode }</h1>
	<div>
		${pageContext.errorData.statusCode }
	</div>
	
	<a href="home.html"> home... </a>

</body>
</html>