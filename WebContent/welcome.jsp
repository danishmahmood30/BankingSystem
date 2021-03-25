<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="head">
<h1>Welcome to ABC Bank</h1>
<hr></hr>
</div>
<p><a href="createCustomer.jsp">Create New Customer</a></p>
<p><a href="viewCustomer.jsp">View Customer</a></p>
<p><a href="<%=request.getContextPath()%>/CustomerServlet?action=viewAll">View All Customer</a></p>
<p><a href="updateCustomer.jsp">Update Customer Details</a></p>
<p><a href="deleteCustomer.jsp">Delete Customer</a></p>
</body>
</html>