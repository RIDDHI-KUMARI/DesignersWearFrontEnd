package com.niit.designerswear;

import javax.servlet.http.HttpServletRequest;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.UsersDAO;
import com.niit.designerswear.model.Users;
import com.niit.designerswear.model.UserDetails;

@Controller
public class LoginController {
	@Autowired
	private Users users;
	@Autowired
	private UsersDAO usersDAO;

	                                                                                                                                                                                 
//	 @RequestMapping("/Login")
//	 public ModelAndView loginUser() {
//	 ModelAndView mv = new ModelAndView("/Index");
//	 mv.addObject("users", new Users());
//	 mv.addObject("ifAdminClickedLogin", "true");
//	 return mv;
//	 }
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String Login(Model model) {
		model.addAttribute("users",new Users());
		return "Login";
	}
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

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This page is for ROLE_ADMIN only!");
	  model.setViewName("Admin");
	  return model;

	}
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



