package com.ts.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestTestController {

	@GetMapping("/")
	public String test() {
		return "/html/index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "/html/register-animal";
	}
}
