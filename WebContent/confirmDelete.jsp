<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Deletion</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="head">
		<h1>Welcome to ABC Bank</h1>
		<hr></hr>
	</div>
	<% Customer customer = (Customer)request.getAttribute("customer"); %>
	<div>
		<form action="CustomerServlet" method="post">
			<table border=0>
				<caption><h2><mark>Customer Details</mark><h2></h2></caption>
				<tr><td><b>Customer SSN Id:</b></td><td><%=customer.getCustomerSsnId() %></td></tr>
				<tr><td><b>Customer Id:</b></td><td><%=customer.getCustomerId() %></td></tr>
				<tr><td><b>Customer Name:</b></td><td><%=customer.getCustomerName() %></td></tr>
				<tr><td><b>Address:</b></td><td><%=customer.getAddress() %></td></tr>
				<tr><td><b>Age:</b></td><td><%=customer.getAge() %></td></tr>
				<tr><td><b>State:</b></td><td><%=customer.getState() %></td></tr>
				<tr><td><b>City:</b></td><td><%=customer.getCity() %></td></tr>
			</table>
			<table>
				<tr><td><input type="hidden" name="ssnId" value="<%=customer.getCustomerSsnId() %>"></td></tr>
				<tr><td><input type="submit" name="action" value="confirm delete"></td>
				<tr><td><button type="submit" name="button" value="cancel">cancel</td>
			</table>
		</form>
	</div>
</body>
</html>