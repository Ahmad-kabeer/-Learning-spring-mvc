<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- form library -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student form</title>
</head>
<body>

<p>Welcome to student form.</p>

	<form:form action="processform" modelAttribute="student">
	
		FirstName: <form:input path="firstName" />
		<br><br>
		LastName: <form:input path="lastName" />
		<br><br>
		Country: <form:select path="country">
		<!--<form:option value="India" label="India"></form:option>
			<form:option value="Pakistan" label="Pakistan"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Dubai" label="Dubai"></form:option>
			<form:option value="Sweden" label="Sweden"></form:option>	-->
			
			<!-- Listing using java file instead using xml file-->
			<!--<form:options items="${student.countryOption }" /> 	-->
			
			<!-- Listing using countries.properties file instead using java-->
			<form:options items="${theCountryOptions}" />
			 
		</form:select>
		<br> 
			 
			<p>Favourite Programming languages:</p>
			<!-- Listing using html file-->
			<!-- Java <form:radiobutton path="favouriteLanguages" value="Java" />
			 
			Python <form:radiobutton path="favouriteLanguages" value="Python" />
			 
			C# <form:radiobutton path="favouriteLanguages" value="C#" />
			 
			JavaScript <form:radiobutton path="favouriteLanguages" value="JavaScript" /> -->
			
			<!-- Listing using Java file instead using html file-->
			<form:radiobuttons path="favouriteLanguages" items="${student.favoriteLanguageOptions }"/>
			<br><br>
			
			<!-- getting chechbox data from jav file -->
			Operating System:
			Windows <form:checkbox path="favoriteOS" value="Windows"/>
			Linux <form:checkbox path="favoriteOS" value="Linux"/>
			Mac <form:checkbox path="favoriteOS" value="Mac"/>
			Abc <form:checkbox path="favoriteOS" value="Abc"/>
			
			
		<br><br>
		<input type="submit" value="submit">
		
	</form:form>

</body>
</html>