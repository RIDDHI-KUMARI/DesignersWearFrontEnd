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

import com.niit.designerswear.dao.AuthoritiesDAO;
import com.niit.designerswear.dao.CartDAO;
import com.niit.designerswear.dao.UserDetailsDAO;
import com.niit.designerswear.dao.UsersDAO;
import com.niit.designerswear.model.Authorities;
import com.niit.designerswear.model.Cart;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Users;
import com.niit.designerswear.model.UserDetails;

@Controller
public class RegisterController {
	@Autowired
	private UserDetails userdetails;
	@Autowired
	private UserDetailsDAO userdetailsDAO;
	@Autowired
	private Users users;
	@Autowired
	private UsersDAO usersDAO;
	@Autowired
	private Cart cart;
	@Autowired
	private CartDAO cartDAO;
	@Autowired
	private Authorities authorities;
	@Autowired
	private AuthoritiesDAO authoritiesDAO;

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
		System.out.println("Username" + userdetails.getUsername());
		userdetailsDAO.saveOrUpdate(userdetails);
		
		
		Users users=new Users();
		users.setUserdetails_Id(userdetails.getId());
		users.setUsername(userdetails.getUsername());
		users.setPassword(userdetails.getPassword());
		users.setENABLED(true);
		usersDAO.saveOrUpdate(users);
		
		Authorities authorities=new Authorities();
		authorities.setUserdetails_Id(userdetails.getId());
		authorities.setUsername(userdetails.getUsername());
		authorities.setAuthority("ROLE_USER");
		authoritiesDAO.saveOrUpdate(authorities);
		
		Cart cart=new Cart();
		cart.setUsers_id(userdetails.getId());
		cartDAO.saveOrUpdate(cart);
		
		return "Home";
		
		
	}
}
