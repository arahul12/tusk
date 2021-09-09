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
Laptop ID:<select name="mname"> 
<c:forEach items="${list}" var="m">
	
	<option value="${m.getLaptop_id()}">
		${m.getLaptop_id()}
	</option>
</c:forEach>
</select><br><br>

Laptop Brand: <input type="text" name="brand" placeholder="Brand"><br><br>
Laptop Processor: <input type="text" name="processor" placeholder="Processor"><br><br>



 <br><br>
</body>
</html>