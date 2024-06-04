package com.gl.annotations.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gl.annotations.entity.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String getUserData(Model model) {
		User user = new User("Ravi","ravi@gmail.com", 20);
		model.addAttribute("userAttribute1",user);
		return "views/user";
	}
	
	@GetMapping("/user2")
	public String getUserData2(Model model) {
		User user2 = new User("Amit","Amit@gmail.com", 28);
		model.addAttribute("userAttribute2",user2);
		return "views/user2";
	}
	
	@GetMapping("/users")
	public String getUserData3(Model model) {
		
		List<User> users = new ArrayList<User>();
		User user1 = new User("Ravi","ravi@gmail.com", 20);
		User user2 = new User("Amit","Amit@gmail.com", 28);
		User user3 = new User("Deepak","Deepak@gmail.com", 30);
		users.add(user1);
		users.add(user2);
		users.add(user3);
		model.addAttribute("userAttribute3",users);
		return "views/user3";
	}
	

}
