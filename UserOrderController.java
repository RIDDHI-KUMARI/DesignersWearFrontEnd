//package com.niit.designerswear;
//
//import javax.xml.registry.infomodel.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.niit.designerswear.dao.BillingAddressDAO;
//import com.niit.designerswear.dao.CartDAO;
//import com.niit.designerswear.dao.ShippingAddressDAO;
//import com.niit.designerswear.dao.UserOrderDAO;
//import com.niit.designerswear.dao.UsersDAO;
//import com.niit.designerswear.model.BillingAddress;
//import com.niit.designerswear.model.Cart;
//import com.niit.designerswear.model.ShippingAddress;
//import com.niit.designerswear.model.UserOrder;
//import com.niit.designerswear.model.Users;
//
//@Controller
//public class UserOrderController {
//	@Autowired
//	private Cart cart;
//	@Autowired
//	private CartDAO cartDAO;
//	@Autowired
//	private UserOrder userorder;
//	@Autowired
//	private UserOrderDAO userorderDAO;
//	@Autowired
//	private Users users;
//@Autowired
//private UsersDAO usersDAO;
//@Autowired
//private BillingAddress billingaddress;
//@Autowired
//private BillingAddressDAO billingaddressDAO;
//@Autowired
//private ShippingAddress shippingaddress;
//@Autowired
//private ShippingAddressDAO shippingaddressDAO;
//
//@RequestMapping("Cart/Cart")
//public String createOrder(@PathVariable(value="Cart_id") String Cart_id){
//UserOrder userorder = new UserOrder();
//Cart cart = cartDAO.get(users.getId());
//userorder.setId(userorder.getId());
//userorder.setUsers_id(userorder.getUsers_id());
//userorder.setBillingaddress_id(userorder.getBillingaddress_id());
//userorder.setShippingaddress_id(userorder.getShippingaddress_id());
//return "redirect:/Cart";
//}
//}
