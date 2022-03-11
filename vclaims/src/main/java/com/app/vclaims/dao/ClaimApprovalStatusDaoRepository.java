package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.ClaimApprovalStatus;

public interface ClaimApprovalStatusDaoRepository extends JpaRepository<ClaimApprovalStatus, Integer>{
	
	@Query(value="SELECT reason from Claim_status where claim_id=:claimId",nativeQuery=true)
	public String getReasonById(@Param("claimId") String claimId );

}
