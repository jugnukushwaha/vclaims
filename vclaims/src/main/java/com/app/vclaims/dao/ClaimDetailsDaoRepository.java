package com.app.vclaims.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.ClaimDetails;

public interface ClaimDetailsDaoRepository extends JpaRepository<ClaimDetails, Integer> {

	@Query(value="SELECT Claim_id from Claim_details where User_id=:Id",nativeQuery=true)
	public List<String> getClaimbyId(@Param("Id") int userId );
	
	@Modifying
	@Query(value="update claim_details SET status='accept' where claim_Id=:claimId",nativeQuery=true)
	public void updateClaimStatusToAccept(@Param("claimId") String claimId);
	
	@Modifying
	@Query(value="update claim_details SET status='reject' where claim_Id=:claimId",nativeQuery=true)
	public void updateClaimStatusToReject(@Param("claimId") String claimId);
	
	
	

	
}
