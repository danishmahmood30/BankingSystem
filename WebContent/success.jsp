<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
int id = (int)request.getAttribute("ssnId");
String status=(String)request.getAttribute("status");
System.out.println(id);
System.out.println(status);%>

<%if(status.equals("update")){%> 
	<h2>Customer details successfully updated for id: <%=id %></h2>	
<%} else if(status.equals("create")){%>
	<h2>Customer successfully created with id: <%=id %></h2>
<%} else if(status.equals("delete")){%>
	<h2>Customer with id: <%=id %> deleted successfully</h2>
<%} %>
<form action="${pageContext.request.contextPath}/CustomerServlet" method="post">
<table>
<tr><td><button type="submit" name="button" value="home">home</button></td></tr>
</table>
</form>
</body>
</html>