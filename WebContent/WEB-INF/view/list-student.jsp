<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">

	<title>Students</title>

	<link type = "text/css"
		rel = "stylesheet"
		href = "${pageContext.request.contextPath}/resources/style.css"/>
</head>

<body>

	<div id = "wrapper">
		<div id = "header">
			<h2>Dedei's Academy Management</h2>
		</div>
	</div>
	
	<div id = "container">
		<div id = "content">
		
			<!-- add the add button -->
			<input type = "button" 
				   value = "Add Student"
				   onclick = "window.location.href = 'showFormForAdd'; return false"
				   class = "add-button"/>
		
			<!-- add html table -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var = "tempStudent" items = "${students}">
					<c:url var = "updateLink" value = "/student/showUpdateForm">
						<c:param name = "studentID" value = "${tempStudent.id}"/>
					</c:url>
					
					<c:url var = "deleteLink" value = "/student/deleteStudent">
						<c:param name = "studentID" value = "${tempStudent.id}"/>
					</c:url>
					<tr>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.email}</td>
						<td>
							<a href = "${updateLink}">Update</a>
							|
							<a href = "${deleteLink}"
							   onclick = "if (!(confirm('Are you sure you want to delete?'))) return false">Delete</a>
						</td>
					</tr>
					
				</c:forEach>
			</table>
			
		</div>
	</div>
	
</body>
</html>