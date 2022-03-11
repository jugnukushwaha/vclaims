package com.app.vclaims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.vclaims.entity.ClaimApprovalStatus;
import com.app.vclaims.services.ClaimApprovalStatusServiceImpl;
import com.app.vclaims.services.ClaimServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/vclaims")
public class ClaimApprovalStatusController {

	@Autowired
	private ClaimApprovalStatusServiceImpl claimStatusAppImpl;
	
	@Autowired
	private ClaimServiceImpl claimService;
	
	
	// verify and approve the claim 
	@PostMapping("/claimApproval/accept")
	public void claimApprove(@RequestBody ClaimApprovalStatus claimApproval) {
		claimService.updateClaimStatusToAccept(claimApproval.getClaimId());
		claimStatusAppImpl.updateStatus(claimApproval);
	}
	@PostMapping("/claimApproval/reject")
	public void claimReject(@RequestBody ClaimApprovalStatus claimApproval) {
		claimService.updateClaimStatusToReject(claimApproval.getClaimId());
		claimStatusAppImpl.updateStatus(claimApproval);
	}
	@GetMapping("/reason/{claimId}")
	public String getReason(@PathVariable(value="claimId") String claimId) {
		System.out.println(claimStatusAppImpl.getReason(claimId));
		return claimStatusAppImpl.getReason(claimId);
	}

}
