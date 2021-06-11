<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/my-test.css" >
<script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
<p>Welcome</p>
<p>From Ahmad Kabeer (Junior Java Developer)</p>

<a href="myapp/showform">Go to Normal form</a>

<br><br>

<a href="student/showform">Go to Student form</a>

<br><br>

<a href="customer/showform">Go to Customer form</a>

<br><br>



<img src="${pageContext.request.contextPath}/resources/images/spring.png">
<img src="${pageContext.request.contextPath}/resources/images/me.jpg" height="100px" width="100px">

</body>
</html>