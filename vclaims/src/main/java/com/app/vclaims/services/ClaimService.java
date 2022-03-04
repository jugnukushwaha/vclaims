package com.app.vclaims.services;



import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.vclaims.entity.ClaimDetails;


public interface ClaimService {

	public void claim(ClaimDetails claim,MultipartFile file)throws IOException ;
	
	public List<String> getClaimbyId(int userId);
	
	public List<ClaimDetails> getClaim();

//	public void claim(String claimId, MultipartFile file)  throws IOException ;
	

}
