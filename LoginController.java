package com.niit.designerswear;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.UserDAO;
import com.niit.designerswear.model.User;
import com.niit.designerswear.model.UserDetails;

@Controller
public class LoginController {
	@Autowired
	private User user;
	@Autowired
	private UserDAO userDAO;

//	@RequestMapping("/Login")
//	public String Login(@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout, Model model) {
//
//		if (error != null) {
//			ModelAndView mv = new ModelAndView("/Login");
//			mv.addObject("user", new User());
//			model.addAttribute("error", "Invalid username and password!");
//
//		}
//		if (logout != null) {
//			ModelAndView mv = new ModelAndView("/Login");
//			mv.addObject("user", new User());
//			model.addAttribute("msg", "You have been logged out successfully");
//		}
//		return "Login";
//	}
                                                                                                                                                                                    
//	 @RequestMapping("/Login")
//	 public ModelAndView loginUser() {
//	 ModelAndView mv = new ModelAndView("/Index");
//	 mv.addObject("user", new User ());
//	 mv.addObject("ifAdminClickedLogin", "true");
//	 return mv;
//	 }
	@RequestMapping("/Login")
	public ModelAndView loginUser() {
		ModelAndView mv = new ModelAndView("/Login");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String loginuserac(@ModelAttribute("user") User user, Model model, HttpServletRequest request) {
		userDAO.saveOrUpdate(user);
		return "Login";
	}
}
