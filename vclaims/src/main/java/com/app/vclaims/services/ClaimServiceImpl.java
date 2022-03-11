package com.app.vclaims.services;



import java.io.File;
import java.io.IOException;
import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.vclaims.dao.ClaimDetailsDaoRepository;
import com.app.vclaims.entity.ClaimDetails;

@Service
public class ClaimServiceImpl implements ClaimService {
	
    @Autowired
	private ClaimDetailsDaoRepository claimDetailsRep;
    
	
	@Override
	public List<String> getClaimbyId(int userId) {
		List<String> claimList= claimDetailsRep.getClaimbyId(userId);
		return claimList;	}

	@Override
	public List<ClaimDetails> getClaim() {
		 List<ClaimDetails> claims = claimDetailsRep.findAll();
		 return claims;
	}
	

	@Override
	public void claim(ClaimDetails claim) {
		System.out.println("Inside Claim");
		claimDetailsRep.save(claim);
	}


	@Override
	public void uploadFileForClaim(MultipartFile file) throws IOException  {
		
		file.transferTo(new File("/Users/jugnukumar/Documents/FullStackTraining/Assignments/VehicleClaimProject/VehicleClaimFinalProject/src/assets/Images/vclaim_cloud/"+file.getOriginalFilename()));
		//claimDetailsRep.save(claim);
		
		
	}

	@Override
	@Transactional
	public void updateClaimStatusToAccept(String claimId) {
		
		claimDetailsRep.updateClaimStatusToAccept(claimId);
	}
	
	@Override
	@Transactional
	public void updateClaimStatusToReject(String claimId) {
		
		claimDetailsRep.updateClaimStatusToReject(claimId);
	}
	
	
	
	
}
