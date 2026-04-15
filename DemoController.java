package com.techm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("/home")
	public String test() {
		System.out.println("output");
		return"home";
	}
}
