<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3>Welcome ${name} </h3><br>
	<h3> ${msg} </h3><br><br>
	<img id="thumbnail" alt="logo">
	<a href="addlaptop">Add Laptop</a>
	<a href="updateuser?cust_name=${cust_name}">Update User</a>
	<a href="purchase">Purchase Laptop</a>
	
</body>
</html>
