package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//CONTROLLER METHOD TO SHOW INITIAL FORM
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//CONTROLLER METHOD TO PROCESS THE HTML FORM
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//NEW CONTROLLER METHOD TO READ FORM DATA
	//ADD DATA TO MODEL 
	@RequestMapping("/processFormVersionTwo")
	public String letsShuutDude(HttpServletRequest request, Model model) {
		
		//READ THE REQUEST PARAMETER FROM HTML FORM
		String theName = request.getParameter("studentName");
		
		//CONVERT THE DATA TO ALL CAPITAL
		theName = theName.toUpperCase();
		
		//CREATE THE MESSAGE
		String result = "Yo! "+theName;
		
		//ADD MESSAGE TO MODEL 
		model.addAttribute("message", result);
		
		return"helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
				
		//CONVERT THE DATA TO ALL CAPITAL
		theName = theName.toUpperCase();
		
		//CREATE THE MESSAGE
		String result = "Wow, you code! "+theName;
		
		//ADD MESSAGE TO MODEL 
		model.addAttribute("message", result);
		
		return"helloworld";
	}
	
	
	
}
