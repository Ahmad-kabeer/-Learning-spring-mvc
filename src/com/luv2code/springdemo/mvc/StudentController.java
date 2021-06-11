package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//injection to use .properties file
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showform")
	public String showform(Model model) {
		
		// model binding
		model.addAttribute("student", new StudentModel());
		
		// add the country options to the model to use the value of countries.properties 
		model.addAttribute("theCountryOptions", countryOptions);
		
		return "studentform";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student")StudentModel thestudentmodel) {
		
		thestudentmodel.setFirstName(thestudentmodel.getFirstName().toUpperCase());
		
		thestudentmodel.setLastName(thestudentmodel.getLastName().toUpperCase());
		
//		System.out.println("Here is the details of student " + thestudentmodel.getFirstName()+" "+ thestudentmodel.getLastName());
		
		return "confirmstudentform";
	}
}
