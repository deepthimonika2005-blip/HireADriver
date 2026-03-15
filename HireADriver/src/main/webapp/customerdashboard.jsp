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
<header>
<h2>Customer Dashboard</h2>
<a href="LogoutServlet">Logout</a>
</header>

<div class="container">

<h3>Hire a Driver</h3>

<a href="hireDriver.jsp">
<button class="btn">Book Driver</button>
</a>

<h3>Your Bookings</h3>

<table>

<tr>
<th>Pickup</th>
<th>Drop</th>
<th>Date</th>
<th>Status</th>
</tr>

<tr>
<td>Vizag</td>
<td>Hyderabad</td>
<td>12/03/2026</td>
<td>Pending</td>
</tr>

</table>

</div>

</body>
</html>