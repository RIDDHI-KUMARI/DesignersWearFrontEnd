<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	<form:form action="${contextPath}/Login" method="post"
		commandName="user">
			<div class="form-group">
				<label for="Username">Username:</label>
				<form:input path="Username" id="Username" class="form-control"
					placeholder="Enter username" />
			</div>
			<div class="form-group">
				<label for="Password">Password:</label>
				<form:input path="Password" id="Password" class="form-control"
					placeholder="Enter password" />
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
	</form:form>
</body>
</html>
