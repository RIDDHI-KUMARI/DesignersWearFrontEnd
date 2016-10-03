
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="${contextPath}/ProductAdd/ProductView" method="post"
	commandName="product" enctype="multipart/form-data">
	<div class="form-group">
		<label for="id">id:</label>
		<form:input path="id" id="id" class="form-control" />
	</div>
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
		<form:input path="out_off_stock" id="out_off_stock"
			class="form-control" />
	</div>
	<div class="form-group">
			<label class="control-label" for="productimage">Upload picture</label>
			<form:input id="productimage" path="productimage" type="file" class="form:input-large" />
		</div>

	<input type="submit" class="btn btn-default" value="Add Product">
</form:form>
</body>
</html>

