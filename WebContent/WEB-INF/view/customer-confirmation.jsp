<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer-confirmation</title>
</head>
<body>

<p>Customer details</p>
<br>
Customer full name: ${CustomerModel.firstName } ${CustomerModel.lastName }
<br>
Customer Amount: ${CustomerModel.customerAmout }
<br>
Postal code: ${CustomerModel.postalcode }
<br>
Course code: ${CustomerModel.courseCode }

</body>
</html>