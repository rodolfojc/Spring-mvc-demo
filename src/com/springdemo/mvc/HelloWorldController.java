package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//CONTROLLER METHOD TO SHOW INITIAL FORM
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//CONTROLLER METHOD TO PROCESS THE HTML FORM
	@RequestMapping("/proccessForm")
	public String processForm() {
		return "helloworld";
	}
	
	
}
