<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container-wrapper">
	<div class="container">
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>CartList</h1>
					
					
					<p>All the selected Products in your Shopping Cart</p>
				</div>
			</div>
		</section>

		<section class="container" ng-app="cartApp">
		<div ng-controller = "cartCtrl" ng-init="initCart_id('${cart_id}')">
		<div>
			<a class="btn btn-danger pull-left" ng-click="clearCart()"> <span
				class="glyphicon glyphicon-remove-sign"></span>Clear Cart
			</a>
		</div>

		<table class="table table-hover">
			<tr>
				<th>Id</th>
				<th>Cart_ID</th>
				<th>Product_ID</th>
				<th>Total_Price</th>
				<th>Quantity</th>
			</tr>

			<tr ng-repeat = "item in cart.cartitems">
				<td>{{item.product.product_id}}</td>
				<td>{{item.cart.cart_id}}</td>
				<td>{{item.cartitem.total_price}}</td>
				<td>{{item.cartitem.quantity}}</td>
				<td><a href="#" class="label label-danger"
					ng-click="removeFromCart(item.product.product_id)"> <span
						class="glyphicon glyphicon-remove"></span>remove
				</a></td>
			</tr>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th>Grand_Total</th>
				<th>{{cart.grand_total}}</th>
				<th></th>
				</tr>
				</table>
				
				<a href="<c:url value='/PlaceOrder/BillingAddress' />">PlaceOrder</a>
				<a href="<c:url value='/DeliveryAt/ShippingAddress' />">DeliveryAt</a>
				</div>
				</section>
				</div>
				<script>
				(function(){
					alert("Caert ID"+'${cart_id}');
				})();
				</script>
		<script
			src="<c:url value="/resources/js/angular.min.js"/>"></script>
		<script src="<c:url value="/resources/js/Controller.js" />"></script>