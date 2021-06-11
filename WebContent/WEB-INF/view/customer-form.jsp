<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
<style>
	.error{color: red}
</style>
</head>
<body>

<i>Fill the value that contains asterisk(*) means required.</i>
<form:form action="processForm" modelAttribute="CustomerModel">

	First Name*: <form:input path="firstName"/>
	<form:errors path="firstName" cssClass="error"></form:errors>
	
	<br><br>
	
	Last Name: <form:input path="lastName"/>
	
	<br><br>
	
	Customer Amount: <form:input path="customerAmout"/>
	<form:errors path="customerAmout" cssClass="error"></form:errors>
	<br><br>
	
	Postal code: <form:input path="postalcode"/>
	<form:errors path="postalcode" cssClass="error"></form:errors>
	<br><br>
	
	Course code: <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"></form:errors>
	<br><br>
	
	<input type="submit" value="submit" />

</form:form>


</body>
</html>