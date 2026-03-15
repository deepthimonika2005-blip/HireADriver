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
<h2>Driver Dashboard</h2>
<a href="LogoutServlet">Logout</a>
</header>

<div class="container">

<h3>Ride Requests</h3>

<table>

<tr>
<th>Customer</th>
<th>Pickup</th>
<th>Drop</th>
<th>Date</th>
<th>Action</th>
</tr>

<tr>
<td>Rahul</td>
<td>Vizag</td>
<td>Hyderabad</td>
<td>12/03/2026</td>

<td>
<button class="accept">Accept</button>
<button class="reject">Reject</button>
</td>

</tr>

</table>

</div>

</body>
</html>