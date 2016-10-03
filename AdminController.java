package com.niit.designerswear;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.designerswear.dao.CategoryDAO;
import com.niit.designerswear.dao.ProductDAO;
import com.niit.designerswear.dao.SupplierDAO;
import com.niit.designerswear.model.Category;
import com.niit.designerswear.model.Product;
import com.niit.designerswear.model.Supplier;

@Controller
public class AdminController {
	private Path path;
	@Autowired
	private Product product;

	@Autowired
	private Supplier supplier;

	@Autowired
	private Category category;

	@Autowired
	private SupplierDAO supplierDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = "/Admin")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Product", new Product());
		mv.addObject("ifUserClickedAdmin", true);
		return mv;

	}

	@RequestMapping("/Product/ProductAdd")
	public ModelAndView Producta() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("product", new Product());
		mv.addObject("ifAdminClickedProductAdd", "true");
		return mv;
	}
	// @RequestMapping(value = "/ProductAdd/ProductView", method =
	// RequestMethod.POST)
	// public String pro(@ModelAttribute("product") Product product) {
	// productDAO.saveOrUpdate(product);
	// return "redirect:/Product/ProductView";
	// }

	@RequestMapping(value = "/ProductAdd/ProductView", method = RequestMethod.POST)
	public String Productadd(@ModelAttribute("product") Product product,Model model, HttpServletRequest request) {
		
		MultipartFile productimage = product.getProductimage();
	String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "/resources/productsavailable/" + product.getId()+".png");
		if (productimage != null && !productimage.isEmpty()) {
			try {
				File file = new File(path.toString());
//				productimage.transferTo(file);
		productimage.transferTo(new File(rootDirectory +"/resources/productsavailable/" + product.getId()+".png"));
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("product image saving failed", e);
			}
		}
		productDAO.saveOrUpdate(product);
		return "redirect:/ProductAdd/ProductView";
	}

	@RequestMapping("/Product/ProductUpdate")
	public ModelAndView Productk() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("Product", product);
		mv.addObject("ifAdminClickedProductUpdate", "true");
		mv.addObject("productList", productDAO.list());
		return mv;
	}

	@RequestMapping(value = "Product/ProductView/ProductUpdate/{id}")
	public ModelAndView ProductUpdate1(@PathVariable("id") String id, Model model) {
		ModelAndView mv = new ModelAndView("Index");
		System.out.println("updateProduct");
		model.addAttribute("product", this.productDAO.get(id));
		model.addAttribute("listProduct", this.productDAO.list());
		mv.addObject("Product", product);
		mv.addObject("ifUserClickedProductUpdate", true);
		return mv;
	}

	@RequestMapping("/Product/ProductView")
	public ModelAndView Products() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("ifAdminClickedProductView", "true");
		mv.addObject("productList", productDAO.list());
		return mv;
	}

	@RequestMapping("/ProductView/{id}")
	public String removeProduct(@PathVariable("id") String id,Model model,HttpServletRequest request) {
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path=Paths.get(rootDirectory +"\\webapp\\resources\\productsavailable\\" +id+".png");
		if(Files.exists(path)){
		try{
			Files.delete(path);
		}catch (IOException e){
			e.printStackTrace();
		}
		}
		productDAO.delete(id);
		return "redirect:/Product/ProductView";
	}


	@RequestMapping(value = "/Category/CategoryAdd")
	public ModelAndView cat() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("category", new Category());

		mv.addObject("ifAdminClickedCategoryAdd", "true");
		return mv;
	}

	@RequestMapping(value = "/CategoryAdd/CategoryView", method = RequestMethod.POST)
	public String Categoryaddc(@ModelAttribute("category") Category category) {
		categoryDAO.saveOrUpdate(category);
		return "redirect:/Category/CategoryView";
	}

	@RequestMapping("/Category/CategoryUpdate")
	public ModelAndView cate() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("Category", category);
		mv.addObject("ifAdminClickedCategoryUpdate", "true");
		mv.addObject("categoryList", categoryDAO.list());
		return mv;
	}

	@RequestMapping(value = "/CategoryView/CategoryUpdate/{id}")
	public ModelAndView CategoryUpdate1(@PathVariable("id") String id, Model model) {
		ModelAndView mv = new ModelAndView("Category/CategoryUpdate");
		mv.addObject("category", this.categoryDAO.get(id));
		mv.addObject("ifUserClickedCategoryUpdate", true);
		return mv;
	}

	@RequestMapping(value = "/CategoryView/CategoryUpdate", method = RequestMethod.POST)
	public String CategoryUpdater(@ModelAttribute("category") Category category, Model model) {
		categoryDAO.saveOrUpdate(category);
		return "redirect:/Category/CategoryView";
	}

	@RequestMapping("/Category/CategoryView")
	public ModelAndView categ() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("ifAdminClickedCategoryView", "true");
		mv.addObject("categoryList", categoryDAO.list());
		return mv;
	}

	@RequestMapping("/CategoryView/{id}")
	public String removeCategory(@PathVariable("id") String id) {
		categoryDAO.delete(id);
		return "redirect:/Category/CategoryView";
	}

	@RequestMapping("/Supplier/SupplierAdd")
	public ModelAndView sup() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("supplier", new Supplier());
		mv.addObject("ifAdminClickedSupplierAdd", "true");
		return mv;
	}

	@RequestMapping(value = "/SupplierAdd/SupplierView", method = RequestMethod.POST)
	public String Supplieraddc(@ModelAttribute("supplier") Supplier supplier) {
		supplierDAO.saveOrUpdate(supplier);
		return "redirect:/Supplier/SupplierView";
	}

	@RequestMapping("/Supplier/SupplierUpdate")
	public ModelAndView supp() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("Supplier", supplier);
		mv.addObject("ifAdminClickedSupplierUpdate", "true");
		mv.addObject("supplierList", supplierDAO.list());
		return mv;
	}

	@RequestMapping(value = "/SupplierView/SupplierUpdate/{id}")
	public ModelAndView SupplierUpdate1(@PathVariable("id") String id, Model model) {
		ModelAndView mv = new ModelAndView("Supplier/SupplierUpdate");
		mv.addObject("supplier", this.supplierDAO.get(id));
		mv.addObject("ifUserClickedSupplierUpdate", true);
		return mv;
	}

	@RequestMapping(value = "/SupplierView/SupplierUpdate", method = RequestMethod.POST)
	public String SupplierUpdater(@ModelAttribute("supplier") Supplier supplier, Model model) {
		supplierDAO.saveOrUpdate(supplier);
		return "redirect:/Supplier/SupplierView";
	}

	@RequestMapping("/Supplier/SupplierView")
	public ModelAndView suppl() {
		ModelAndView mv = new ModelAndView("/Index");
		mv.addObject("ifAdminClickedSupplierView", "true");
		mv.addObject("supplierList", supplierDAO.list());
		return mv;
	}

	@RequestMapping("/SupplierView/{id}")
	public String removeSupplier(@PathVariable("id") String id) {
		supplierDAO.delete(id);
		return "redirect:/Supplier/SupplierView";
	}

}
