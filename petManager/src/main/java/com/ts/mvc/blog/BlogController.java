package com.ts.mvc.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
public class BlogController {

	@GetMapping("guestbook")
	public String guestbook() {
		return "/html/guestbook";
	}
	
	@GetMapping("diary")
	public String diary() {
		return "/html/diary";
	}
	
	@GetMapping("status")
	public String status() {
		return "/html/status";
	}
}
