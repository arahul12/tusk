<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="registeruser" method="post">
	User name <input type="text" name="user"><br>
	Password <input type="password" name="pass"><br>
	Customer Name <input type="text" name="name"><br>
	DateofBirth<input type="date" name="dob"><br>
	Address <input type="text" name="address"><br>
	Photo <input type="file" name="fileImage" id="fileImage" accept="image/png, image/jpeg"/>
	<input type="submit" value="Register">
	
	</form>
</body>
</html>