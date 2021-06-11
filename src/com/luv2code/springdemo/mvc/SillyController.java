package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	//just try to make new same name request mapping to create ambigous and then handle it.
	@RequestMapping("/showform")
	public String showform()
	{
		//helloworld-form is the jsp file name
		return "helloworld-form";
	}
}
