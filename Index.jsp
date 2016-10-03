<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>
<%@include file="./Shared/Header.jsp"%>
<br>
<br>
<%@include file="./Shared/Menu.jsp"%>
<br>
<br>
<c:if test="${ifUserClickedHome == true}">
	<%@include file="Home.jsp"%>
</c:if>

<c:if test="${ifUserClickedContact == true}">
	<%@include file="Contact.jsp"%>
</c:if>

<c:if test="${ifUserClickedAbout == true}">
	<%@include file="About.jsp"%>
</c:if>
<c:if test="${ifUserClickedCart == true}">
	<%@include file="./Cart/Cart.jsp"%>
</c:if>
<c:if test="${ifUserClickedCartItem == true}">
	<%@include file="./Cart/CartItem.jsp"%>
</c:if>

<c:if test="${ifUserClickedAdmin == true}">
	<%@include file="Admin.jsp"%>
</c:if>
<c:if test="${ifUserClickedProduct == true}">
	<%@include file="./Product/Product.jsp"%>
</c:if>
<c:if test="${ifAdminClickedProductAdd == true}">
	<%@include file="./Product/ProductAdd.jsp"%>
</c:if>
<c:if test="${ifAdminClickedProductUpdate == true}">
	<%@include file="./Product/ProductUpdate.jsp"%>
</c:if>
<c:if test="${ifAdminClickedProductView == true}">
	<%@include file="./Product/ProductView.jsp"%>
</c:if>
<c:if test="${ifUserClickedCategory == true}">
	<%@include file="./Category/Category.jsp"%>
</c:if>
<c:if test="${ifAdminClickedCategoryAdd == true}">
	<%@include file="./Category/CategoryAdd.jsp"%>
</c:if>
<c:if test="${ifAdminClickedCategoryUpdate == true}">
	<%@include file="./Category/CategoryUpdate.jsp"%>
</c:if>
<c:if test="${ifAdminClickedCategoryView == true}">
	<%@include file="./Category/CategoryView.jsp"%>
</c:if>
<c:if test="${ifUserClickedSupplier == true}">
	<%@include file="./Supplier/Supplier.jsp"%>
</c:if>
<c:if test="${ifAdminClickedSupplierAdd == true}">
	<%@include file="./Supplier/SupplierAdd.jsp"%>
</c:if>
<c:if test="${ifAdminClickedSupplierUpdate == true}">
	<%@include file="./Supplier/SupplierUpdate.jsp"%>
</c:if>
<c:if test="${ifAdminClickedSupplierView == true}">
	<%@include file="./Supplier/SupplierView.jsp"%>
</c:if>

<c:if test="${ifUserClickedLogin == true}">
	<%@include file="Login.jsp"%>
</c:if>
<c:if test="${ifUserClickedRegister == true}">
	<%@include file="Register.jsp"%>
</c:if>
<%@include file="./Shared/Footer.jsp"%>