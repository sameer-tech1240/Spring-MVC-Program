package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	@RequestMapping("/one")
	public String handleOne() {
		System.out.println("this is one handler");
	
//		RedirectView redirectView = new RedirectView();
		 //  redirectView.setUrl("/contact");
		   return "redirect:/contact";
		   
		
	}

	@RequestMapping("/two")
	public String handleTwo() {
		System.out.println("this is second handler");
		return "";
	}
}
