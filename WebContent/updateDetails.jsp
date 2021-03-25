<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer Deatils</title>
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
			<table>
				<caption><h2><mark>Update Customer Details</mark><h2></h2></caption>
				<tr><td>Customer SSN Id:</td><td><%=customer.getCustomerSsnId() %></td></tr>
				<tr><td>Customer Id:</td><td><%=customer.getCustomerId() %></td></tr>
				<tr><td>Old Customer Name:</td><td><%=customer.getCustomerName() %></td></tr>
				<tr><td>New Customer Name:</td><td><input type="text" name="name"></td></tr>
				<tr><td>Old Address:</td><td><%=customer.getAddress() %></td></tr>
				<tr><td>New Address:</td><td><input type="text" name="address"></td></tr>
				<tr><td>Old Age:</td><td><%=customer.getAge() %></td></tr>
				<tr><td>New Age:</td><td><input type="text" name="age"></td></tr>
				<tr><td><input type="submit" name="action" value="submitUpdate"></td>
			</table>
		</form>
	</div>
</body>
</html>