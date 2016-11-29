package com.niit.designerswear;

import javax.mail.Address;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.UserDetailsDAO;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Users;
import com.niit.designerswear.model.UserDetails;

@Controller
public class RegisterController {
	@Autowired
	private UserDetails userdetails;
	@Autowired
	private UserDetailsDAO userdetailsDAO;

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public ModelAndView Register(Model model) {
		ModelAndView mv = new ModelAndView("Index");
		model.addAttribute("userdetails", new UserDetails());
		mv.addObject("ifUsersClickedRegister", true);
		return mv;
	}



	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String registerac(@ModelAttribute("userdetails") UserDetails userdetails, Model model,
			HttpServletRequest request) {
		System.out.println("name" + userdetails.getName());
		userdetailsDAO.saveOrUpdate(userdetails);
		return "Home";
	}
}
