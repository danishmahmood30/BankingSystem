<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Customer</title>
<link href="style.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/validations.js"></script>
</head>
<body>
<div class="head">
<h1>Welcome to ABC Bank</h1>
<hr></hr>
</div>
<div>
<form name="create" action="CustomerServlet" method="post" onsubmit="return validate()">
<table>
<tr><td>Customer SSN Id</td><td><input type="text" name="ssnId"></td></tr>
<tr><td></<td><td><span id="ssn_error" style="color:red"></span></td></tr>
<tr><td>Customer Name</td><td><input type="text" name="customer name" ></td></tr>
<tr><td></<td><td><span id="name_error"></span></td></tr>
<tr><td>Age</td><td><input type="text" name="age" ></td></tr>
<tr><td></<td><td><span id="age_error"></span></td></tr>
<tr><td>Address</td><td><input type="text" name="address"></td></tr>
<tr><td></<td><td><span id="addres_error"></span></td></tr>
<tr><td>State</td><td><select name="state" id="state">
<option></option>
<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Arunachal Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra and Nagar Haveli and Daman and Diu">Dadra and Nagar Haveli and Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal Pradesh">Himachal Pradesh</option>
<option value="Jammu and Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Ladakh">Ladakh</option>
<option value="Lakshadweep">Lakshadweep</option>
<option value="Madhya Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Puducherry">Puducherry</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West Bengal">West Bengal</option>
</select></td></tr>
<tr><td>City</td><td>
<select name="city" id="city">
<option ></option>
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Chennai">Chennai</option>
<option value="Kolkata">Kolkata</option>
</select>
</td></tr>
<tr><td><input type="submit" name="action" value="submit" ></td></tr>
</table>
</form>
</div>

</body>
</html>