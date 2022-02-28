package com.app.vclaims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/login")
	public List<User> getUser()
	{
		return userSer.getUser();
	}
	
	@PostMapping("/register")
	public void regUser(@RequestBody User user)
	{
		System.out.println("test works");
		userSer.regUser(user);
	}

}
