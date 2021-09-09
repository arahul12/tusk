<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div>
				<div class="form-group">
					<h1><center> Online Laptop Store </center></h1>
				</div>
				<form action="login" method="POST">
				<div class="form-group">
					<h3>${msg}</h3>
					<h3 class="bg-warning pt-3 pb-3" >Username: <input type="text" name="uname"> </h3>
				</div>
				<div class="form-group">
					<h3 class="bg-info pt-3 pb-3">Password: <input type="password" name="pass"> </h3>
				</div>
				<a href="register"> Register</a>
				<div class="form-group">
				<input class="btn btn-outline-primary" type="submit" name="ok">
			</div>
	</form>
			</div>
		</div>
	</div>
</body>
</html>