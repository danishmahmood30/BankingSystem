<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.bean.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="head">
<h1>Welcome to ABC Bank</h1>
<hr></hr>
</div>
<div>
<% ArrayList<Customer> clist =(ArrayList<Customer>)request.getAttribute("customerList"); %>
<div>
	<table border="1" cellpadding="5">
	<tr>
		<th><b>SSS Id</b></th>
		<th><b>Customer Id</b></th>
		<th><b>Customer Name</b></th>
		<th><b>Age</b></th>
		<th><b>Address</b></th>
		<th><b>State</b></th>
		<th><b>City</b></th>
	</tr>
	<% for(Customer customer: clist) {%>
	<tr>
		<td><%=customer.getCustomerSsnId()%></td>
		<td><%=customer.getCustomerId()%></td>
		<td><%=customer.getCustomerName()%></td>
		<td><%=customer.getAge()%></td>
		<td><%=customer.getAddress()%></td>
		<td><%=customer.getState()%></td>
		<td><%=customer.getCity()%></td>
	</tr>
	<%} %>
	</table>
	<form action="${pageContext.request.contextPath}/CustomerServlet" method="post">
	<table>
	<tr><td><button type="submit" name="button" value="home">home</button></td></tr>
	</table>
	</form>
</div>
</body>
</html>