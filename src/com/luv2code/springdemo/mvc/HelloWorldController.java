package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("myapp")
public class HelloWorldController {

	//need a method to show initial html form
	
	@RequestMapping("/showform")
	public String showform()
	{
		//helloworld-form is the jsp file name
		return "helloworld-form";
	}
	
	//need a method to process hmtl form
	
	@RequestMapping("/processform")
	public String processform() {
		return "helloworld";
	}
	
	//adding new method to read data from page url and add it to model
	@RequestMapping("/processformversionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		//get data
		String thename=request.getParameter("studentName");
		
		//to uppercase
		thename=thename.toUpperCase();
		
		String result="Hey my friend from version2: "+thename;
		
		model.addAttribute("message", result);
		
		return "helloworld";
			
	}
	
	@RequestMapping("/processformversionThree")
	public String processFormVersionThree(@RequestParam("studentName") String thename, Model model) {
		
		//get data
//		String thename=request.getParameter("studentName");
		
		//to uppercase
		thename=thename.toUpperCase();
		
		String result="Hey my friend from version3: "+thename;
		
		model.addAttribute("message", result);
		
		return "helloworld";
		
		
	}
}
