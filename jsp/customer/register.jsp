<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register - Train Ticket Booking System</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="css/styles.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-4">
		<h1>Register</h1>
		<form action="/customer/register" method="post">
			<div class="form-group">
				<label for="username">Username</label>
				<input type="text" class="form-control" id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="email">Email</label>
				<input type="email" class="form-control" id="email" name="email" required>
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" class="form-control" id="password" name="password" required>
			</div>
			<div class="form-group">
				<label for="confirmPassword">Confirm Password</label>
				<input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
			</div>
			<div class="form-group">
				<label for="age">Age</label>
				<input type="number" class="form-control" id="age" name="age" required>
			</div>
			<div class="form-group">
				<label for="gender">Gender</label>
				<select class="form-control" id="gender" name="gender" required>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>
			<input type="hidden" name="role" value="customer"> <!-- Default role -->
			<button type="submit" class="btn btn-primary">Register</button>
		</form>
	</div>
</body>
</html>
