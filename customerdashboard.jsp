<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Customer Dashboard - Train Ticket Booking System</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="css/styles.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">Train Ticket Booking System</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Train
							List</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Booking
							History</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Payment</a>
					</li>
				</ul>
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="#">My
							Profile</a></li>
					<li class="nav-item"><a class="nav-link" href="logout">Logout</a></li>
				</ul>
			</div>
		</nav>
		<div class="row mt-4">
			<div class="col-md-3">
				<!-- Left side navigation -->
				<!-- You can add links or buttons for Home, Train List, Booking History, and Payment -->
			</div>
			<div class="col-md-9">
				<!-- Main content area -->
				<!-- You can display dynamic content here based on the selected navigation item -->
			</div>
		</div>
	</div>
	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
