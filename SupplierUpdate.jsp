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
	<h1>update supplier</h1>

	<form:form action="${contextPath}/SupplierView/SupplierUpdate"
		method="post" modelAttribute="supplier">
		<form:hidden path="id" id="id" class="form-control" />

		<div class="form-group">
			<label for="name">name:</label>
			<form:input path="name" id="name" class="form-control" />
		</div>

		<div class="form-group">
			<label for="address">address:</label>
			<form:input path="address" id="address" class="form-control" />
		</div>
		<input type="submit" class="btn btn-default" value="Update Supplier">
	</form:form>
</body>
</html>
