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
<% Customer cm =(Customer)request.getAttribute("customer"); %>
<div>
	<table border="1">
	<tr>
		<th><b>SSS Id</b></th>
		<th><b>Customer Id</b></th>
		<th><b>Customer Name</b></th>
		<th><b>Age</b></th>
		<th><b>Address</b></th>
		<th><b>City</b></th>
		<th><b>State</b></th>
		<th><b>DOJ</b></th>
		<th><b>Type of Room</b></th>
		<th><b>Status</b></th>
	</tr>
	<tr>
		<td><%=cm.getCustomerSsnId()%></td>
		<td><%=cm.getCustomerId()%></td>
		<td><%=cm.getCustomerName()%></td>
		<td><%=cm.getAge()%></td>
		<td><%=cm.getAddress()%></td>
		<td><%=cm.getState()%></td>
		<td><%=cm.getCity()%></td>
	</tr>
	</table>
<form action="${pageContext.request.contextPath}/CustomerServlet" method="post">
<table>
<tr><td><button type="submit" name="button" value="home">home</button></td></tr>
</table>
</form>
</div>
</body>
</html>