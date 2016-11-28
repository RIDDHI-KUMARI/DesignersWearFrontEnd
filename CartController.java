package com.niit.designerswear;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.designerswear.dao.CartDAO;
import com.niit.designerswear.dao.UsersDAO;
import com.niit.designerswear.model.Cart;
import com.niit.designerswear.model.Users;

@Controller
public class CartController {
	@Autowired
	private Users users;
	@Autowired
	private UsersDAO usersDAO;
	@Autowired
	private Cart cart;
	@Autowired
	private CartDAO cartDAO;

	@RequestMapping("/Cart")
	public String getCart(@AuthenticationPrincipal Principal activeUser) {
		Users users = usersDAO.getUserByUsername(activeUser.getName());
		Cart cart = new Cart();
		Cart cart1 = cartDAO.getCart(users.getId());
		return "redirect:/Cart";
	}

	@RequestMapping("/{Cart_id}")
	public String getCartRedirect(@PathVariable(value = "Cart_id") String Cart_id, Model model) {
		model.addAttribute("Cart_id", Cart_id);
		return "Cart/Cart";
	}
}
