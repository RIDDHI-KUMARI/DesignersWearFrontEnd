<body>
	<c:set value="${pageContext.request.contextPath}" var="contextPath" />
	<c:url var="addAction" value="/BuyProducts"></c:url>
	<h3>Product List</h3>
	<c:if test="${!empty productList}">
		<table class="tg">
			<tr>
				<th width="120">PRODUCT NAME</th>
				<th width="200">PRICE</th>
				<th width="200">QUANTITY</th>
				<th width="200">out_off_stock</th>

			</tr>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.out_off_stock}</td>
					<td><img
						src="<c:url value="/resources/productsavailable/${product_id}.png"/> alt="
						productsavailable" width="56" height="78"></td>
					<td><a
						href="<c:url value='/Product/BuyProducts/Cart/Cart/AddToCart/${product_id}' />">Add
							to Cart</a></td>
					</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>




