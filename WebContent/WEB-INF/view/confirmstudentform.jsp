<!-- jstl tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>

<p>Here is the details of student: ${student.firstName } ${student.lastName }</p> 
<br> 
<p>Here is the details of student: ${student.country }</p> 
<br> 
<p>Favourite programming language: ${student.favouriteLanguages }</p>
<br>
<p>Operating system:</p>
	<ul>
	<!-- for each loop -->
		<c:forEach var="temp" items="${student.favoriteOS }">
			<li>${temp }</li>
		</c:forEach>
			
	
	</ul>

</body>
</html>