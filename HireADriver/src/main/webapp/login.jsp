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

<h2>Login</h2>

<form action="LoginServlet" method="post">

<label>Email</label>
<input type="email" name="email" required>

<label>Password</label>
<input type="password" name="password" required>

<label>User Type</label>

<select name="usertype">
<option value="customer">Customer</option>
<option value="driver">Driver</option>
</select>

<br><br>

<button type="submit" class="btn">Login</button>

</form>

<p>New User? <a href="register.jsp">Register Here</a></p>

</div>


</body>
</html>