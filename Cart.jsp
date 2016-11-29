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

		<section class="container" ng-app="Cartapp"></section>
		<div ng-"controller" ="Cartctrl" ng-init="initcart_id("${Cart_id}")"></div>
		<div>
			<a class="btn btn-danger pull-left" ng-click=" clearCart()"> <span
				class="glyphicon glyphicon-remove-sign"></span>ClearCart
			</a>
		</div>

		<table class="table table-hover">
			<tr>
				<th>CartItem_id</th>
				<th>Cart_id</th>
				<th>Product_id</th>
				<th>total_price</th>
				<th>quantity</th>
			</tr>

			<tr ng-repeat="cartitems">
				<td>CartItem.id</td>
				<td>CartItem.Cart_id</td>
				<td>CartItem.Product_id</td>
				<td>CartItem.total_price</td>
				<td>CartItem.quantity</td>
				<td><a href="#" class="label label-danger"
					ng-click="removeFromCart(CartItem.Product_id)"> <span
						class="glyphicon glyphicon-remove"></span>remove
				</a></td>
			</tr>
			<tr>
				<th></th>
				<th></th>
				<th>grand_total</th>
				<th>Cart.grand_total</th>
				<th></th>
			</tr>
		</table>
		<script
			src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.0-rc.2/angular.min.js"></script>
		<script src="<c:url value="/resources/js/Controller.js" />"></script>