<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>REGISTER</h1>
		<form:form action="${contextPath}/Register" method="post"
			commandName="userdetails">
			<div class="form-group">
				<label for="Id">Id:</label>
				<form:input path="Id" id="id" class="form-control"
					placeholder="Enter id" />
			</div>
			<div class="form-group">
				<label for="Name">Name:</label>
				<form:input path="Name" id="name" class="form-control"
					placeholder="Enter name" />
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<form:input path="Email" id="email" class="form-control"
					placeholder="Enter email" />
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label>
				<form:input path="Password" id="pwd" class="form-control"
					placeholder="Enter password" />
			</div>
			<div class="form-group">
				<label for="Country Name">Country Name:</label>
				<form:input path="CountryName" id="CountryName" class="form-control"
					placeholder="Enter countryname" />
			</div>
			<div class="form-group">
				<label for="Contact Number">Contact Number:</label>
				<form:input path="ContactNumber" id="ContactNumber"
					class="form-control" placeholder="Enter contactnumber" />
			</div>
			<div class="form-group">
				<label for="Address">Address:</label>
				<form:input path="Address" id="Address" class="form-control"
					placeholder="Enter address" />
			</div>

			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<input type="submit" class="btn btn-default" value="Add UserDetails">
		</form:form>
</body>
</html>