package com.app.vclaims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vclaims.entity.Admin;
import com.app.vclaims.entity.AdminDashBoard;
import com.app.vclaims.services.AdminDashboardServicesImpl;
import com.app.vclaims.services.AdminServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/vclaims")
public class AdminController {
	
	@Autowired
	private AdminServiceImpl adminSer;
	
	@Autowired
	private AdminDashboardServicesImpl adminDashboardImpl;
	
	@GetMapping("/adminLogin/{emailId}")
	public Admin getAdmin(@PathVariable(value="emailId") String emailID)
	{
//		System.out.println("Inside email");
		Admin admin= adminSer.getAdmin(emailID);
		return admin;
	}
	
	
	@GetMapping("/adminDashboard/{status}")
	public List<AdminDashBoard> getDashboardByStatus(@PathVariable(value="status") String status) {
		return adminDashboardImpl.getAdminDashboardDetails(status);
		
		
	}

	

}
