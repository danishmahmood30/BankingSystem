<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="head">
<h1>Welcome to ABC Bank</h1>
<hr></hr>
</div>
<div>
<form action="CustomerServlet" method="post">
<table>
<tr><th></th><th></th></tr>
<tr><td>Enter Customer SSN Id:</td><td><input type="text" name="ssnId"></td></tr>
<tr><td align="center" rowspan="2" colspan="2">Or</td><td>&nbsp</td></tr>
<tr><td>&nbsp</td></tr>
<tr><td>Enter Customer Id:</td><td><input type="text" name="customerId"></td></tr>
<tr><td align="center" rowspan="2" colspan="2"><input type="submit" name="action" value="delete"></td><td>&nbsp</td></tr>
<tr><td>&nbsp</td></tr>
</table>
</form>
</div>
</body>
</html>