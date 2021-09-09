<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertlaptop" method="post">
	Laptop ID <input type="number" name="id"><br>
	Brand Name <input type="text" name="brand"><br>
	Cost <input type="number" name="cost"><br>
	Model No <input type="number" name="model"><br>
	Year <input type="number" name="year"><br>
	RAM <input type="number" name="ram" > <br>
	Processor <select name="processor">
	<option value="i3">i3  </option>
	<option value="i5">i5  </option>
	<option value="i7">i7  </option>
	</select>
	<input type="submit" value="OK" >
	</form>
	
</body>
</html>