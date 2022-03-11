package com.app.vclaims.services;



import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.vclaims.entity.ClaimDetails;


public interface ClaimService {

	public void claim(ClaimDetails claim) ;
	
	public List<String> getClaimbyId(int userId);
	
	public List<ClaimDetails> getClaim();

//	public void claim(String claimId, MultipartFile file)  throws IOException ;
	
	public void uploadFileForClaim(MultipartFile file) throws IOException ;
	
    public void updateClaimStatusToAccept(String claimId);
    public void updateClaimStatusToReject(String claimId);
    
	
}
