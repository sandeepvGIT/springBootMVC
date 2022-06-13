package com.svi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShowHomeController {
	
	static {
		System.out.println("ShowHomeController_StaticBlock");
	}
	
	public ShowHomeController() {
		System.out.println("ShowHomeController_Constructor");
	}
	
	@RequestMapping("/welcome")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");
		return "home";
	}

}
