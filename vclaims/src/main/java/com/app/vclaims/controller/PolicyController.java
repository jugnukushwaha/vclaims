package com.app.vclaims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vclaims.entity.PolicyDetails;
import com.app.vclaims.services.PolicyServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/vclaims")
public class PolicyController {

	@Autowired
	private PolicyServiceImpl policyServiceImpl;
	
	@PostMapping("/buy")
	public void buyPolicy(@RequestBody PolicyDetails policy) {
		policyServiceImpl.buyPolicy(policy);
	}
	
	@GetMapping("/getPolicies/{userId}")
	public List<Integer> getPolicyByUserId(@PathVariable(value="userId") int userId) {
//		System.out.println("inside api");
		List<Integer> policyList = policyServiceImpl.getPolicyByUserId(userId) ;
		
		return policyList;
		
	}
	
	@GetMapping("/getPolicy")
	public List<PolicyDetails> getPolicy() {
		return policyServiceImpl.getPolicy();
	}
	
	
}
