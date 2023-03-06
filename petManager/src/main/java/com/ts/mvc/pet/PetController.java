package com.ts.mvc.pet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pet")
public class PetController {

	@GetMapping("regist")
	public String petRegist() {
		return "/html/register-animal";
	}
	
	@GetMapping("modify")
	public String petModify() {
		return "/html/animal-modify";
	}
}
