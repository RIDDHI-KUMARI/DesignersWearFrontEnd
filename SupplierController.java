package com.niit.designerswear;

import javax.enterprise.inject.spi.Bean;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.SupplierDAO;
import com.niit.designerswear.dao.SupplierDAO;
import com.niit.designerswear.model.Supplier;
import com.niit.designerswear.model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	private SupplierDAO supplierDAO;
	@Autowired
	private Supplier supplier;

	@RequestMapping("/Supplier/Supplier")
	public ModelAndView Supplier() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("ifUserClickedSupplier", true);
		return mv;

	}
}

	