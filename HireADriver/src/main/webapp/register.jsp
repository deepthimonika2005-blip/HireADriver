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

<h2>User Registration</h2>

<form action="RegisterServlet" method="post">

<label>Name</label>
<input type="text" name="name" required>

<label>Email</label>
<input type="email" name="email" required>

<label>Phone Number</label>
<input type="text" name="phone" required>

<label>Password</label>
<input type="password" name="password" required>

<label>User Type</label>

<select name="usertype">
<option value="customer">Customer</option>
<option value="driver">Driver</option>
</select>

<br><br>

<button type="submit" class="btn">Register</button>

</form>

</div>

</body>
</html>
