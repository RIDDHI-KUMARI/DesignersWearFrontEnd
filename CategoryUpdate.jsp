<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Update Category</h1>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
	<form:form action="${contextPath}/CategoryView/CategoryUpdate" method="post" modelAttribute="category">
<form:hidden path="id" class="form-control" />
		<div class="form-group">
			<label for="name">name:</label>
			<form:input path="name" id="name" class="form-control" />
		</div>
		<div class="form-group">
			<label for="description">description:</label>
			<form:input path="description" id="description" class="form-control" />
		</div>
		<input type="submit" class="btn btn-default" value="Update Category">
	</form:form>







