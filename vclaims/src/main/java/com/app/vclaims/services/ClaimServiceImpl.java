package com.app.vclaims.services;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.JSONObject;
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
		
		claimDetailsRep.save(claim);
		
		
	}

	
	/*
	 * @Override public void claim(String claimId, MultipartFile file) throws
	 * IOException { System.out.println("about to transfer file to given location");
	 * file.transferTo(new File(
	 * "C:\\Users\\manee\\OneDrive\\Desktop\\Project\\pictures" +
	 * file.getOriginalFilename() + claimId)); System.out.println(file.getName()); }
	 */

	@Override
	public void uploadFileForClaim(MultipartFile file) throws IOException  {
		
		file.transferTo(new File("C:\\Users\\manee\\OneDrive\\Desktop\\Project\\pictures"+file.getOriginalFilename()));
		//claimDetailsRep.save(claim);
		
		
	}
	
	
	
	
}
