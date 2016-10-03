<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<h1>Add a Category</h1>
	<form:form action="${contextPath}/CategoryAdd/CategoryView" method="post"
		commandName="category">
		<div class="form-group">
			<label for="id">id:</label>
			<form:input path="id" id="id" class="form-control" />
		</div>
		<div class="form-group">
			<label for="name">name:</label>
			<form:input path="name" id="name" class="form-control" />
		</div>
		<div class="form-group">
			<label for="description">description:</label>
			<form:input path="description" id="description" class="form-control" />
		</div>
		<input type="submit" class="btn btn-default" value="Add Category">
	</form:form>
</body>
</html>