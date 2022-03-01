package com.app.vclaims.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.PolicyDetailsDaoRepository;
import com.app.vclaims.entity.PolicyDetails;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyDetailsDaoRepository policyDaoRep;

	@Override
	public void buyPolicy(PolicyDetails policy) {
		policyDaoRep.save(policy);
		
	}

	
	@Override
	public List<PolicyDetails> getPolicy() {
		// TODO Auto-generated method stub
		return policyDaoRep.findAll();
	}


	@Override
	public List<Integer> getPolicyByUserId(int userId) {
		// TODO Auto-generated method stub
		List<Integer> policyList= policyDaoRep.getPolicyNumbersById(userId);
		return policyList;
	}

}
