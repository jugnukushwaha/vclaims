package com.app.vclaims.services;

import com.app.vclaims.entity.ClaimApprovalStatus;

public interface ClaimApprovalStatusServices {

	public void updateStatus(ClaimApprovalStatus claimApproval);
	public String getReason(String claimId);
}
