package com.app.vclaims.services;

import java.util.List;

import com.app.vclaims.entity.PolicyDetails;

public interface PolicyService {

	public void buyPolicy(PolicyDetails policy) ;
	
	public List<Integer> getPolicyByUserId(int userId);
	
	public List<PolicyDetails> getPolicy();
	

}
