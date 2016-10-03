
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">DESIGNER'S WEAR</a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li id="home"><a href="${contextPath}/Home">Home</a></li>
				<li id="about"><a href="${contextPath}/About">About</a></li>
				<li id="contact"><a href="${contextPath}/Contact">Contact</a></li>
				<li id="register"><a href="${contextPath}/Register">Register</a></li>
				<li id="admin"><a href="${contextPath}/Admin">Admin</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="${contextPath}/Product">Product <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/Product/Product">Product</a></li>
						<li><a href="${contextPath}/Product/ProductAdd">ProductAdd</a></li>
						<li><a href="${contextPath}/Product/ProductUpdate">ProductUpdate</a></li>
						<li><a href="${contextPath}/Product/ProductView">ProductView</a></li>
					</ul></li>

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="${contextPath}/Category">Category
						<span class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/Category/Category">Category</a></li>
						<li><a href="${contextPath}/Category/CategoryAdd">CategoryAdd</a></li>
						<li><a href="${contextPath}/Category/CategoryUpdate">CategoryUpdate</a></li>
						<li><a href="${contextPath}/Category/CategoryView">CategoryView</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="${contextPath}/Supplier">Supplier
						<span class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/Supplier">Supplier</a></li>
						<li><a href="${contextPath}/Supplier/SupplierAdd">SupplierAdd</a></li>
						<li><a href="${contextPath}/Supplier/SupplierUpdate">SupplierUpdate</a></li>
						<li><a href="${contextPath}/Supplier/SupplierView">SupplierView</a></li>
					</ul></li>

				<li id="login"><a href="${contextPath}/Login">Login</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="${contextPath}/Cart">Cart <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu">
						<li><a href="${contextPath}/Cart">Cart</a></li>
						<li><a href="${contextPath}/Cart/CartItem">CartItem</a></li>
					</ul></li>

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>
