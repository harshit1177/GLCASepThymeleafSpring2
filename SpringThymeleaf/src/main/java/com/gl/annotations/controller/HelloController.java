package com.gl.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //spring mvc
//Controller - RestController // restApIs and not the ui (@controller and Response Body) 
public class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "views/hello-world";
	}
	
	
	@GetMapping("hello2")
	public String helloWorld2(Model model) {
		model.addAttribute("modelAttribute", "Hello I am model value");
		return "views/hello-world2";
		
	}
}
