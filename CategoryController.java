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

import com.niit.designerswear.dao.CategoryDAO;
import com.niit.designerswear.dao.CategoryDAO;
import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private Category category;

	@RequestMapping("/Category/Category")
	public ModelAndView Category() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("ifUserClickedCategory", true);
		return mv;

	}
}

	