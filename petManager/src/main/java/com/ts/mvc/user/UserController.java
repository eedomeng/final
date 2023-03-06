package com.ts.mvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@GetMapping("login")
	public String login() {
		return "/html/login";
	}
		
	@GetMapping("register")
	public String register() {
		return "/html/register";
	}
}
