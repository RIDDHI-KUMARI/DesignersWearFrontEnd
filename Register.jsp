<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<body>
	<h1>REGISTER</h1>
	<form:form action="${contextPath}/Register" method="post"
		commandName="userdetails">
		<div class="form-group">
			<label for="Id">Id:</label>
			<form:input path="Id" id="Id" class="form-control" />
		</div>
		<div class="form-group">
			<label for="Username">Username:</label>
			<form:input path="Username" id="Username" class="form-control" />
		</div>
		<div class="form-group">
			<label for="Password">Password:</label>
			<form:password path="Password" id="Password" class="form-control" />
		</div>
		<div class="form-group">
			<label for="Address">Address:</label>
			<form:input path="Address" id="Address" class="form-control" />
		</div>
		<div class="form-group">
			<label for="CountryName">CountryName:</label>
			<form:input path="CountryName" id="CountryName" class="form-control" />
		</div>
		<div class="form-group">
			<label for="ContactNumber">ContactNumber:</label>
			<form:input path="ContactNumber" id="ContactNumber" class="form-control" />
		</div>
		<div class="form-group">
			<label for="Email">Email:</label>
			<form:input path="Email" id="Email" class="form-control" />
		</div>
		
		<div class="checkbox">
			<label><input type="checkbox"> Remember me</label>
		</div>
		<input type="submit" class="btn btn-default" value="Register">
	</form:form>
</body>
