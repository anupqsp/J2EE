<%@page import="com.qsp.registration_app.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="reg">
		MAIL:<input type="email" name="m"><br> NAME:<input
			type="text" name="n"><br> PHONE:<input type="tel"
			name="p"><br> COURSE:<input type="text" name="c"><br>
		EDUCATION:<input type="text" name="e"><br> STREAM:<input
			type="text" name="s"><br> YOP:<input type="number"
			name="y"><br> GENDER:<input type="text" name="g"><br>
		FEESPAID:<input type="text" name="f"><br> <input
			type="submit" value="REGISTER"><br>

	</form>
</body>
</html>