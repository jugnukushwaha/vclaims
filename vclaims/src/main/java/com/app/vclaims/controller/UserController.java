package com.app.vclaims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vclaims.entity.User;
import com.app.vclaims.services.UserServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/vclaims")
public class UserController {
	
	@Autowired
	private UserServiceImpl userSer;
	
	@GetMapping("/login/{email}")
	public User getUser(@PathVariable(value="email") String email)
	{
		System.out.println("Inside email");
		User user= userSer.getUserByEmail(email);
		return user;
	}
	
	@PostMapping("/register")
	public void regUser(@RequestBody User user)
	{
		System.out.println("test works");
		userSer.regUser(user);
	}
	
	

}
