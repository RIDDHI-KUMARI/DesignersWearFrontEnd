package com.niit.designerswear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.CartDAO;
import com.niit.designerswear.dao.CartItemDAO;
import com.niit.designerswear.dao.ProductDAO;
import com.niit.designerswear.model.Cart;
import com.niit.designerswear.model.CartItem;
import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Supplier;
import com.niit.designerswear.model.Users;
import com.niit.designerswear.model.UserDetails;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView Home() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Home");
		mv.addObject("ifUsersClickedHome", true);
		return mv;
	}

	// @RequestMapping("/Product")
	// public ModelAndView products() {
	// ModelAndView mv = new ModelAndView("Index");
	// mv.addObject("product", new Product());
	// mv.addObject("menu", "Product");
	// mv.addObject("ifUsersClickedProduct", true);
	// mv.addObject("ifUsersClickedProductAdd", true);
	// mv.addObject("ifUsersClickedProductUpdate", true);
	// mv.addObject("ifUsersClickedProductView", true);
	// return mv;
	// }

	@RequestMapping("/About")
	public ModelAndView About() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "About");
		mv.addObject("ifUsersClickedAbout", true);
		return mv;
	}

	@RequestMapping("/Contact")
	public ModelAndView Contact() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Contact");
		mv.addObject("ifUsersClickedContact", true);
		return mv;
	}
	@Autowired
	private Product product;
	@Autowired
	private ProductDAO productDAO;
	@RequestMapping("/Products")
	public ModelAndView products() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Product", product);
		mv.addObject("menu", "Products");
		mv.addObject("ifUsersClickedProducts", true);
		mv.addObject("productList", productDAO.list());
		return mv;
	}
	
	@RequestMapping("/Product/BuyProducts")
	public ModelAndView products1() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Product", product);
		mv.addObject("menu", "Products");
		mv.addObject("ifUsersClickedBuyProducts", true);
		mv.addObject("productList", productDAO.list());
		return mv;
	}
	@Autowired
	private Cart cart;
	@Autowired
	private CartDAO cartDAO;
//	@Autowired
//	private CartItem cartitem;
//	@Autowired
//	private CartItemDAO cartitemDAO;
	@RequestMapping("/Product/BuyProducts/Cart/Cart/AddToCart")
	public ModelAndView products12() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Cart", cart);
		mv.addObject("menu", "Cart");
		mv.addObject("ifUsersClickedCart", true);
		mv.addObject("cartList", cartDAO.list());
		return mv;
	}
	@RequestMapping("/Categories")
	public ModelAndView categories() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Categories");
		mv.addObject("ifUsersClickedCategories", true);
		return mv;
	}
	// @RequestMapping("/Login")
	// public ModelAndView Login() {
	// ModelAndView mv = new ModelAndView("Index");
	// mv.addObject("menu", "Login");
	// mv.addObject("ifUserClickedLogin", true);
	// return mv;
	// }
	// @RequestMapping("/Cart")
	// public ModelAndView Cart() {
	// ModelAndView mv = new ModelAndView("Index");
	// mv.addObject("menu", "Cart");
	// mv.addObject("ifUserClickedCart", true);
	// mv.addObject("ifUserClickedCartItem", true);
	// return mv;
	// }

	// @RequestMapping("/Category")
	// public ModelAndView CategoryS() {
	// ModelAndView mv = new ModelAndView("Index");
	// mv.addObject("category", new Category());
	// mv.addObject("menu", "Category");
	// mv.addObject("ifUserClickedCategory", true);
	// mv.addObject("ifUserClickedCategoryAdd", true);
	// mv.addObject("ifUserClickedCategoryUpdate", true);
	// mv.addObject("ifUserClickedCategoryView", true);
	// return mv;
	// }
	//
	// @RequestMapping("/Supplier")
	// public ModelAndView SupplierS() {
	// ModelAndView mv = new ModelAndView("Index");
	// mv.addObject("supplier", new Supplier());
	// mv.addObject("menu", "Supplier");
	// mv.addObject("ifUserClickedSupplier", true);
	// mv.addObject("ifUserClickedSupplierAdd", true);
	// mv.addObject("ifUserClickedSupplierUpdate", true);
	// mv.addObject("ifUserClickedSupplierView", true);
	// return mv;
	// }
}
