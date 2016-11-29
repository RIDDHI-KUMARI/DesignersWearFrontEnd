package com.niit.designerswear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AnonymousAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.AuthoritiesDAO;
import com.niit.designerswear.dao.CategoryDAO;
import com.niit.designerswear.model.Authorities;
import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Users;

import antlr.collections.List;

//import com.niit.designerswear.dao.UsersDAO;
//import com.niit.designerswear.model.Users;

@Controller
public class LoginController {
//	@Autowired
//	private Authorities authorities;
//	@Autowired
//	private AuthoritiesDAO authoritiesDAO;

	                                                                                                                                                                                 
//	 @RequestMapping("/Login")
//	 public ModelAndView loginUser() {
//	 ModelAndView mv = new ModelAndView("/Index");
//	 mv.addObject("users", new Users());
//	 mv.addObject("ifAdminClickedLogin", "true");
//	 return mv;
//	 }
//	@RequestMapping(value = "/Login", method = RequestMethod.GET)
//	public String Login(Model model) {
//		model.addAttribute("users",new Users());
//		return "Login";
//	}
//		@RequestMapping("/Admin")
//	public ModelAndView Admin() {
//		ModelAndView mv = new ModelAndView("Index");
//		mv.addObject("menu", "Admin");
//		mv.addObject("ifUserClickedAdmin", true);
//		return mv;
//	}
//}
	@RequestMapping(value = "/Admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {

	  ModelAndView model = new ModelAndView("Index");
	  /*model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This page is for ROLE_ADMIN only!");                          
	  model.setViewName("Admin");*/
	  model.addObject("ifUsersClickedAdmin", "true");
	  return model;

	}
	@RequestMapping(value = "/User", method = RequestMethod.GET)
	public ModelAndView adminPages() {

	  ModelAndView model = new ModelAndView("Index");
	  model.addObject("ifUsersClickedUser", "true");
	  return model;

	}

	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public ModelAndView loginPage(
			@RequestParam(value = "error",required = false) String error,
	        @RequestParam(value = "Logout",	required = false) String Logout ,Model model) {
		
		ModelAndView mod = new ModelAndView("Index");
		if (error != null) {
			mod.addObject("error", "Invalid Credentials provided.");
		}

		if (Logout != null) {
			mod.addObject("message", "Logged out successfully.");
		}
        
		mod.addObject("isLoginClicked", "true");
		mod.addObject("active","Login");
		
		   
		
		
		return mod;       
	}
//	@RequestMapping(value = "/Products", method = RequestMethod.GET)
//	public ModelAndView loginPages(
//			@RequestParam(value = "error",required = false) String error,
//	        @RequestParam(value = "Logout",	required = false) String Logout ,Model model) {
//		
//		ModelAndView mod = new ModelAndView("Products");
//		if (error != null) {
//			mod.addObject("error", "Invalid Credentials provided.");
//		}
//
//		if (Logout != null) {
//			mod.addObject("message", "Logged out successfully.");
//		}
//        
//		mod.addObject("isLoginClicked", "true");
//		mod.addObject("active","Login");
//		
//		//===========list Category in navBar=========//
//		//List<Category> listcategory = CategoryDAO.list();
//		//model.addAttribute("Categories", listcategory);
//		
//		
//		
//		return mod;
//	}



//	@RequestMapping(value = "/Login", method = RequestMethod.GET)
//	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
//		@RequestParam(value = "logout", required = false) String logout) {
//
//	  ModelAndView model = new ModelAndView();
//	  
//	  if (error != null) {
//		model.addObject("error", "Invalid username and password!");
//	  }
//
//	  if (logout != null) {
//		model.addObject("msg", "You've been logged out successfully.");
//	  }
//	  model.setViewName("login");
//
//	  return model;
//
//	}
//
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

	  ModelAndView model = new ModelAndView();

	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		Users users = (Users) auth.getPrincipal();
		model.addObject("username", users.getUsername());
	  }

	  model.setViewName("403");
	  return model;

	}
}
//	@RequestMapping("/BuyProducts")
//	public ModelAndView Productac1() {
//		ModelAndView mv = new ModelAndView("/Index");
//		mv.addObject("Product", product);
//		mv.addObject("ifAdminClicked", "true");
//		mv.addObject("productList", productDAO.list());
//		return mv;
//	}}


