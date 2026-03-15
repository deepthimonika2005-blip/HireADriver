<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="form-container">

<h2>Book a Driver</h2>

<form action="HireDriverServlet" method="post">

<label>Pickup Location</label>
<input type="text" name="pickup" required>

<label>Drop Location</label>
<input type="text" name="drop" required>

<label>Date</label>
<input type="date" name="date" required>

<label>Time</label>
<input type="time" name="time" required>

<br><br>

<button class="btn">Book Driver</button>

</form>

</div>

</body>
</html>