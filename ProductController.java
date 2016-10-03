package com.niit.designerswear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.CategoryDAO;
import com.niit.designerswear.dao.ProductDAO;
import com.niit.designerswear.dao.SupplierDAO;
import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Supplier;

@Controller
public class ProductController {

	//private  static final String supplierDAO=null;
	@Autowired
	private Product product;
	private Category category;
	private Supplier supplier;
	
	@Autowired
	private ProductDAO productDAO;
	private CategoryDAO categoryDAO;
	private SupplierDAO supplierDAO;

	@RequestMapping(value="/Product/Product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("ifUserClickedProduct", true);
		return mv;

	}
}

	