package com.app.vclaims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.vclaims.entity.ClaimApprovalStatus;
import com.app.vclaims.services.ClaimApprovalStatusServiceImpl;
import com.app.vclaims.services.ClaimServiceImpl;

@RestController
@RequestMapping("/vclaims")
public class ClaimApprovalStatusController {

	@Autowired
	private ClaimApprovalStatusServiceImpl claimStatusAppImpl;
	
	@Autowired
	private ClaimServiceImpl claimService;
	
	
	
	// verify and approve the claim 
	@PostMapping("/claimApproval")
	public void claimApproval(@RequestBody ClaimApprovalStatus claimApproval) {
		claimService.updateClaimStatusToClose(claimApproval.getClaimId());
		claimStatusAppImpl.updateStatus(claimApproval);
	}
}
