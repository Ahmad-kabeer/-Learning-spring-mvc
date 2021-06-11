package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add a initbinder___ to convert trim input string
	//remove leading and trailing whitespace
	//resolve issue for our validation
	@InitBinder
	public void InitBinder(WebDataBinder thewebdatabinder) {
		//pre process every string form data 
		//if string contain whitespace then set it to null
		StringTrimmerEditor thestringtrimmereditor=new StringTrimmerEditor(true);
		
		thewebdatabinder.registerCustomEditor(String.class, thestringtrimmereditor);
	}
	
	
	@RequestMapping("/showform")
	public String showform(Model model) {
		
		 model.addAttribute("CustomerModel", new CustomerModel());
		 
		 return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processform(@Valid @ModelAttribute("CustomerModel") CustomerModel thecustomer,BindingResult thebindingresult) {
		
//		System.out.println(new File("/spring-mvc-demo/src/resources/messages.properties").getAbsolutePath());
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		
		System.out.println(thebindingresult);
		
		if (thebindingresult.hasErrors()) {
			
			return "customer-form";
			
		}
		else {
			
			thecustomer.setFirstName(thecustomer.getFirstName().toUpperCase());
			
			return "customer-confirmation";
			
		}
		
		
	}

}
