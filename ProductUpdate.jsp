<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/admin.css" />">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="${contextPath}/ProductView/ProductUpdate" method="post"
		modelAttribute="product">
		<form:hidden path="id"  class="form-control" />
		<div class="form-group">
			<label for="name">name:</label>
			<form:input path="name" id="name" class="form-control" />
		</div>
		<div class="form-group">
			<label for="price">price:</label>
			<form:input path="price" id="price" class="form-control" />
		</div>
		<div class="form-group">
			<label for="quantity">quantity:</label>
			<form:input path="quantity" id="quantity" class="form-control" />
		</div>
		<div class="form-group">
			<label for="category_id">category_id:</label>
			<form:input path="category_id" id="category_id" class="form-control" />
		</div>
		<div class="form-group">
			<label for="supplier_id">supplier_id:</label>
			<form:input path="supplier_id" id="supplier_id" class="form-control" />
		</div>
		<div class="form-group">
			<label for="out_off_stock">out_off_stock:</label>
			<form:input path="out_off_stock" id="out_off_stock" class="form-control" />
		</div>
		<input type="submit" class="btn btn-default" value="Update Product">
	</form:form>
	</body>
	</html>
	
