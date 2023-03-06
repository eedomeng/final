package com.ts.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {
	
	@GetMapping("/status")
	public String diary() {
		return "/html/status";
	}
}