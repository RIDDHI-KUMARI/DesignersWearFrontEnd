package com.niit.designerswear;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.niit.designerswear.dao.CartDAO;
import com.niit.designerswear.dao.CartItemDAO;
import com.niit.designerswear.dao.ProductDAO;
import com.niit.designerswear.dao.UsersDAO;
import com.niit.designerswear.model.Cart;
import com.niit.designerswear.model.CartItem;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Users;

@Controller
public class CartResources {
	@Autowired
	private Cart cart;
	@Autowired
	private CartDAO cartDAO;
	@Autowired
	private Users users;
	@Autowired
	private UsersDAO usersDAO;
	@Autowired
	private Product product;
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private CartItem cartitem;
	@Autowired
	private CartItemDAO cartitemDAO;

	@RequestMapping("{/cart_Id}")
	public @ResponseBody Cart getCartById(@PathVariable(value = "cart_Id") String Cart_Id) {
		return cartDAO.get(Cart_Id);
	}

	@RequestMapping(value = "/Product/BuyProducts/Cart/Cart/{product_id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addItem(@PathVariable(value = "product_id") String product_id, Principal activeUser) {
		Users users = usersDAO.getUserByUsername(activeUser.getName());
		Cart cart = cartDAO.getCart(users.getId());
		Product product = productDAO.get(product_id);
		List<CartItem> cartItems = cartitemDAO.list();

		for (int i = 0; i <= cartItems.size(); i++) {
			if (product.getId() == cartItems.get(i).getCart_id()) {
				CartItem cartitem = cartItems.get(i);
				cartitem.setQuantity(cartitem.getQuantity() + 1);
				cartitem.setTotal_price(product.getPrice() * cartitem.getQuantity());
			}
		}
		CartItem cartitem = new CartItem();
		cartitem.setProduct_id(product_id);
		cartitem.setQuantity(cartitem.getQuantity());
		cartitem.setTotal_price(cartitem.getTotal_price());
		cartitem.setCart_id(cartitem.getCart_id());
	}

	@RequestMapping(value = "Product/BuyProducts/remove/{product_id}", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeItem(@PathVariable(value = "product_id") String product_id) {
		CartItem cartitem = cartitemDAO.getproduct(product_id);
		cartitemDAO.delete(cartitem.getId());
	}

	@RequestMapping(value = "/{Cart_id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void clearCart(@PathVariable(value = "Cart_id") String Cart_id) {
		Cart cart = cartDAO.getCart(users.getId());
		cartitemDAO.removeAllCartItems(cartitem.getId());
	}

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request,please verify your payload.")
	public void handleClientErrors(Exception e) {
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "internal server Error.")
	public void handleServerErrors(Exception e) {
	}
}
