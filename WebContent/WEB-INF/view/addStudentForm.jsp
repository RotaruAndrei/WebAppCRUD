<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>

	<link type = "text/css"
		  rel  = "stylesheet"
		  href = "${pageContext.request.contextPath}/resources/style.css"/>

	<link type = "text/css"
		  rel  = "stylesheet"
		  href = "${pageContext.request.contextPath}/resources/add-customer-style.css"/>
</head>

<body>

	<div id = "wrapper">
		<div id = "header">
			<h2>Dedei's Academy Management</h2>
		</div>
	</div>
	
	
	<div id = "container">
	
		<h3>Save Student</h3>
		
			<form:form action = "saveStudent" modelAttribute = "student" method = "POST">
				
				<!-- when the form is loaded this id will be the student id -->
				<form:hidden path="id"/>
				
				<table>
					<tbody>
						<tr>
							<td><label>First Name</label></td>
							<td><form:input path = "firstName"/></td>
						</tr>
						<tr>
							<td><label>Last Name</label></td>
							<td><form:input path = "lastName"/></td>
						</tr>
						<tr>
							<td><label>Email</label></td>
							<td><form:input path = "email"/></td>
						</tr>
						<tr>
							<td><label></label></td>
							<td><input type = "submit" value = "Save" class = "save"/></td>
						</tr>
					</tbody>
				</table>
			</form:form>
			
			<div style="clear;both" >
				<p>
					<a href = "${pageContext.request.contextPath}/student/list">Back</a>
				</p>
			</div>
	</div>
</body>

</html>