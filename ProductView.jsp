<body>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
	<c:url var="addAction" value="/ProductView"></c:url>
	<h3>Product List</h3>
	<c:if test="${!empty productList}"> 
		<table class="tg">
			<tr>
				<th width="80">Product ID</th>
				<th width="120">Product Name</th>
				<th width="80">Price</th>
				<th width="80">Quantity</th>
				<th width="200">out_off_stock</th>
				<th width="200">category_id</th>
				<th width="200">supplier_id</th>
				<th width="60">Update</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.out_off_stock}</td>
					<td>${product.category_id}</td>
					<td>${product.supplier_id}</td>
					<td><img src ="<c:url value="/resources/productsavailable/${product.id}.png"/> alt="productsavailable" width="56" height="78"></td>
					<td>${Update}</td>
					<td>${Delete}</td>
					<td><a
						href="<c:url value='/ProductView/ProductUpdate/${product.id}' />">Update</a></td>
					<td><a href="<c:url value='/ProductView/${product.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
