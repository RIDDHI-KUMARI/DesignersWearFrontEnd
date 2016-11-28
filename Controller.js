var cartApp = angular.module("cartApp",[])

cartApp.controller("cartCtrl",function($scope,$http){
	$scope.refreshCart = function(){
		$http.get("/DesignersWearFrontEnd/rest/Cart"+$scope.Cart_id).success(function(data){
		$scope.cart=data;	
		});
	};
	
	$scope.clearCart = function (){
		$http.del("/DesignersWearFrontEnd/rest/Cart/+$scope.Cart_id").success($scope.refreshCart());
	};
	$Scope.initCart_id = function(Cart_id){
		$Scope.Cart_id = Cart_id;
		$Scope.refreshCart(Cart_id);
	}
	$Scope.addToCart = function(product_id){
		$http.put("/DesignersWearFrontEnd/rest/Cart/add/"+product_id).success(function(){
			$Scope.refreshCart($http.get("/DesignersWearFrontEnd/rest/Cart/Cart_id"));
			alert("product successfully added to the Cart1!")
		}); 
	};
	$scope.removeFromCart = function(product_id){
		$http.put("/DesignersWearFrontEnd/rest/Cart/remove"+product_id).success(function(data){
			$Scope.refreshCart();
		});
	};
	$scope.grand_total = function(){
		var grand_total=0;

		for(var i=0; i<$scope.cart.cartItems.length;i++){
			grandtotal+=$scope.cart.cartitems[i].total_price;
		}

		return grand_total;
	}

	
});


