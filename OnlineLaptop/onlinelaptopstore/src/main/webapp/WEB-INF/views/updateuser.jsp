<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
	Customer Name <input type="text" name="cust" value="${user.getCust_name()}"><br><br>
	<input type="hidden" name="user" value="${user.getUsername()}"><br><br>
	Pass word: <input type="text" name="pass" value="${user.getPassword()}"><br><br>
	Date of Birth: <input type="date" name="dob" value="${user.getDob()}"><br><br>
	Address :<input type="text" name="addr" value="${user.getAddress()}"><br><br>
	<input type="hidden" name="pic" value="${user.getPic()}"><br><br>
	<input type="submit" value="Update User">
</form>
</body>
</html>