<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User login</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="head">
<h1>Welcome to ABC Bank</h1>
<hr></hr>
</div>
<div class="outer">
	<div class="middle">
		<div class="inner">
			<form action="LoginServlet" method="post">
				<table align="center">
					<tr><td>Username:</td><td><input type="text" name="username"></td></tr>
					<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
					<tr><td></td><td><span style="color:red">${error}</span>
					<tr><td></td><td><input type="submit" value="login">&nbsp&nbsp&nbsp  <input type="reset" value="reset"></td></tr>
				</table>
			</form>
		</div>
	</div>
</div>


</body>
</html>