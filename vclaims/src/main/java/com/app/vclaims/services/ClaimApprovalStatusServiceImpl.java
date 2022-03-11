package com.app.vclaims.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.AdminDetailsDaoRepository;
import com.app.vclaims.dao.ClaimDetailsDaoRepository;
import com.app.vclaims.dao.ClaimApprovalStatusDaoRepository;
import com.app.vclaims.entity.ClaimApprovalStatus;
import com.app.vclaims.entity.ClaimDetails;
import com.app.vclaims.entity.User;

@Service
public class ClaimApprovalStatusServiceImpl implements ClaimApprovalStatusServices{

	@Autowired
	private ClaimApprovalStatusDaoRepository claimStatusApproval;
	
	

	
	public void updateStatus(ClaimApprovalStatus claimApproval) {
		
		claimStatusApproval.save(claimApproval);
	
	}
	public String getReason(String claimId) {
		return claimStatusApproval.getReasonById(claimId);
	}



	

}
