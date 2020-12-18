<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
<h1>${message}</h1>
	<form action="Login" method="POST" name="userLogin">
		<div class="form-group">
			<label for="email">Email</label>
			<input type="email" id="email" placeholder="Enter Email" name="username">
		</div>
		<div class="form-group">
			<label for="password">Password</label>
			<input type="password" id="password" placeholder="Enter Password" name="password">
		</div>
		<div class="form-group">
			<label for="dob">D.O.B</label>
			<input type="date" id="dob" min="1950-01-01" max="2021-12-31" name="dob">
		</div>
		<button type="Submit" class="btn btn-success">Log in</button>
	</form>
</body>
<section>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
</section>
</html>