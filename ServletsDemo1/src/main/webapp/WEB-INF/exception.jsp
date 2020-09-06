<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/exception"/>
<title>Insert title here</title>
</head>
<body>
	<h1>Exception Page ${pageContext.exception }</h1>
	<div>
		${pageContext.exception.message }
	</div>
	<a href="home.html"> home... </a>

</body>
</html>