package com.zensar.controller;

import java.util.List;
import java.util.Random;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.entities.Jobs;
import com.zensar.entities.Recruiter;
import com.zensar.service.CareerSolutionsRecruiterService;

//import com.zensar.beans.Product;
//import com.zensar.services.ProductService;
@Controller
//@RequestMapping(value="recruiter")
public class RecruiterController {
	@Autowired
	private CareerSolutionsRecruiterService service;

	public RecruiterController() {
		// products=new ArrayList<Product>();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getRecruiterLoginPage() {
		return "recruiter_login";
	}

	@RequestMapping(value = "/job", method = RequestMethod.GET)
	public String redirectRecruiterLoginPage() {
		return "redirect:/joblogin";
	}

	@RequestMapping(value = "/recruiter_register", method = RequestMethod.GET)
	public String getRecruiterRegisterationPage() {
		return "recruiter_register";
	}

	@RequestMapping(value = "/jobseeker_register", method = RequestMethod.GET)
	public String getJobSeekrRegisterationPage() {
		return "redirect:/jobregister";
	}

	@RequestMapping(value = "/slogin", method = RequestMethod.POST)
	public ModelAndView recruiterLoginPage(@RequestParam("uname") String uname,
			@RequestParam("password") String password) {
		Recruiter recruiter = new Recruiter(uname, password);

		ModelAndView mv = new ModelAndView();
		List<Recruiter> list = service.recruiterLogin(recruiter);
		if (list.isEmpty()) {
			mv.setViewName("recruiter_login");
		} else {
			mv.setViewName("LoginSuccess");
			mv.addObject(recruiter);
		}
		return mv;

	}

	@RequestMapping(value = "/sregister", method = RequestMethod.POST)
	public String recruiterRegisterationPage(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("username") String username, @RequestParam("password") String password,Model model) {
		Random r = new Random(System.currentTimeMillis());
		String rid= Integer.toString((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		Recruiter recruiter = new Recruiter(name, username, password, Integer.parseInt(rid), email);
		System.out.println(recruiter.getRecruiterId());
		int res = service.insertRecruiter(recruiter);
		if (res > 0) {
			model.addAttribute("rid", rid);
			return "recruitersignup_successful";
		} else
			return "recruitesignup_failed";

	}

//  @RequestMapping(value="/submit",method=RequestMethod.POST)
//  public String submitProduct(@Valid @ModelAttribute("product")Product product,BindingResult res) {
//	 // products.add(product);
//	  //int c=10/0;
//	  
//	  if(res.hasErrors()) {
//		//  System.out.println("Binding errors!");
//		  return "productInfo";
//	  }
//	  System.out.println(product);
////	  Product product =new Product(id, pname, price); model.addAttribute("product", product); 
//	  //System.out.println("Product Id is: "+id);
////	  System.out.println("Product name is: "+pname);
////	  System.out.println("Product price is: "+price);
//	  int result=service.insertProduct(product);
//	  if(result>0) {
//		  System.out.println("Record inserted successfully!");
//		  return "submit";
//	  }
//	  else {
//		  return "productInfo";
//	  }
//	  
//	  
//  }
//  
//  @ModelAttribute
//  public void addCommonMessage(Model model) {
//	  model.addAttribute("heading", "Product Management Application");
//  }
//  
//  @RequestMapping(value="/all")
//  public String getAllProducts(Model model){
//	  List<Product> products=service.getAllProduct();
//	  model.addAttribute("products",products);
//	  System.out.println(products);
//	  return "productDisplay";
//  }
////  
//  @RequestMapping(value="/getProduct", method=RequestMethod.POST)
//  public String getProduct(@RequestParam("productId") int productId,Model model) {
//	  	Product product=service.getProduct(productId);
//	  	System.out.println(product);
//	  	model.addAttribute("product",product);
//		return "displayOneProduct";
//	  	
//  }
//  
//  @RequestMapping("/")
//  public String findProduct() {
//	  return "findProduct";
//  }
// 
//  @RequestMapping("/delete")
//  public String deleteProduct() {
//	  return "deleteProduct";
//  }
//  
//  @RequestMapping(value="/deleteProduct/{productId}", method=RequestMethod.GET)
//  public String deleteProduct(@PathVariable("productId")int productId,Model model) {
//	  int res=service.deleteProduct(productId);
//	  if(res>0) {
//		  System.out.println("Record deleted successfully!");
//		  List<Product> products=service.getAllProduct();
//		  model.addAttribute("products",products);
//		  System.out.println(products);
//		  return "productDisplay";
//	  }
//	  else {
//		  return "deleteProduct";
//	  }
//  }
}
