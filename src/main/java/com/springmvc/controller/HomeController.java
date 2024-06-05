package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Create Controller Step : 4//
@Controller
public class HomeController {
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "Sameer");
		model.addAttribute("age", "19");
		List<String> list = new ArrayList<String>();
		list.add("Sameer");
		list.add("Aadil");
		list.add("Yasir");
		list.add("Dilshad");
		model.addAttribute("l", list);
		System.out.println("This is home controller...");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller...");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller...");
		// Creating model object to avoid error
		ModelAndView modelAndView = new ModelAndView();
		// setting the data
		modelAndView.addObject("name", "Sameer");
		modelAndView.addObject("id", 101);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		// setting the view name

		// marks
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(54);
		arrayList.add(65);
		arrayList.add(87);
		arrayList.add(97);
		modelAndView.addObject("marks", arrayList);
		modelAndView.setViewName("help");
		return modelAndView;

	}
}
