 package com.niit.designerswear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Supplier;
import com.niit.designerswear.model.Users;
import com.niit.designerswear.model.UserDetails;

@Controller
public class HomeController {
	@Autowired
	UserDetails userdetails;

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String Register(Model model) {
		model.addAttribute("userdetails", new UserDetails());
		return "Register";
	}

	@RequestMapping("/")
	public ModelAndView Home() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Home");
		mv.addObject("ifUserClickedHome", true);
		return mv;
	}

	@RequestMapping("/Product")
	public ModelAndView products() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("product", new Product());
		mv.addObject("menu", "Product");
		mv.addObject("ifUserClickedProduct", true);
		mv.addObject("ifUserClickedProductAdd", true);
		mv.addObject("ifUserClickedProductUpdate", true);
		mv.addObject("ifUserClickedProductView", true);
		return mv;
	}

	@RequestMapping("/About")
	public ModelAndView About() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "About");
		mv.addObject("ifUserClickedAbout", true);
		return mv;
	}

	@RequestMapping("/Contact")
	public ModelAndView Contact() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Contact");
		mv.addObject("ifUserClickedContact", true);
		return mv;
	}

	 @RequestMapping("/Login")
	 public ModelAndView Login() {
	 ModelAndView mv = new ModelAndView("Index");
	 mv.addObject("menu", "Login");
	 mv.addObject("ifUserClickedLogin", true);
	 return mv;
	 }
	@RequestMapping("/Cart")
	public ModelAndView Cart() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("menu", "Cart");
		mv.addObject("ifUserClickedCart", true);
		mv.addObject("ifUserClickedCartItem", true);
		return mv;
	}

	@RequestMapping("/Category")
	public ModelAndView CategoryS() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("category", new Category());
		mv.addObject("menu", "Category");
		mv.addObject("ifUserClickedCategory", true);
		mv.addObject("ifUserClickedCategoryAdd", true);
		mv.addObject("ifUserClickedCategoryUpdate", true);
		mv.addObject("ifUserClickedCategoryView", true);
		return mv;
	}

	@RequestMapping("/Supplier")
	public ModelAndView SupplierS() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("supplier", new Supplier());
		mv.addObject("menu", "Supplier");
		mv.addObject("ifUserClickedSupplier", true);
		mv.addObject("ifUserClickedSupplierAdd", true);
		mv.addObject("ifUserClickedSupplierUpdate", true);
		mv.addObject("ifUserClickedSupplierView", true);
		return mv;
	}
}
