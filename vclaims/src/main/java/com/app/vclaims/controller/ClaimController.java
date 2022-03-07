package com.app.vclaims.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.vclaims.entity.ClaimDetails;
import com.app.vclaims.services.ClaimServiceImpl;

@RestController
@RequestMapping("/vclaims")
public class ClaimController {
	
	@Autowired
	private ClaimServiceImpl claimServiceImpl;
	
	@GetMapping("/Allclaim")
	public List<ClaimDetails> getAllClaims() {
		return claimServiceImpl.getClaim();
	}
	
	@PostMapping("/claim")
	public void myclaim(@RequestBody ClaimDetails claimdetail) {
		claimServiceImpl.claim(claimdetail);
		
	}
	
	
	@GetMapping("/claim/{userId}")
	public List<String> getClaimsOfUser(@PathVariable(value="userId") int userId){ 
		System.out.println("calling claim controller");
		return claimServiceImpl.getClaimbyId(userId);			
		
	}
	
	@PostMapping("/picture")
	public void picture(@RequestParam("file") MultipartFile fileMultipartFile)
			throws IOException {
		System.out.println("inside api");
		claimServiceImpl.uploadFileForClaim( fileMultipartFile);

	}
	
	
	
	

}
