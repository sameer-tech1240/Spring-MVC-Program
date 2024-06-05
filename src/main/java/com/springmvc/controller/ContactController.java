package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model model) {

		model.addAttribute("Header", "Sameer-Tech");
		model.addAttribute("Desc", "Only Programmers...");
		System.out.println("Adding common data to model.....");

	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		System.out.println("Creating form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) { // , Model model) {
		System.out.println(user);
		if (user.getUserName().isEmpty()) {
			return "redirect:/contact";
			
		}
		int createdUserId = this.userService.createUser(user);
		model.addAttribute("message" , "User Created With : " + createdUserId);
		return "success";
	}

}

/*
 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
 * String handleForm(@RequestParam(name = "email", required = true) String
 * userEmail,
 * 
 * @RequestParam("userName") String userName, @RequestParam("password") String
 * userPasword, Model model) { User user = new User(); user.setEmail(userEmail);
 * user.setUserName(userName); user.setpassword(userPasword);
 * System.out.println(user);
 * 
 * 
 * //processsss
 * 
 * model.addAttribute("name", userName); model.addAttribute("email", userEmail);
 * model.addAttribute("password", userPasword);
 * 
 * model.addAttribute("user", user); return "success"; }
 */
