package com.app.vclaims.dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import com.app.vclaims.entity.ClaimDetails;

public interface ClaimDetailsDaoRepository extends JpaRepository<ClaimDetails, Integer> {

	@Query(value="SELECT Claim_id from Claim_details where User_id=:Id",nativeQuery=true)
	public List<String> getClaimbyId(@Param("Id") int userId );

//	@Query(value="Select * from Claim_details where Claim_id=:claimId",nativeQuery=true)
//	public ClaimDetails getClaimByClaimId(@Param("claimId") String claimId);

	
}
