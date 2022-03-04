package com.app.vclaims.entity;



import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.NotNull;

@Entity
@Table(name="Claim_details")
public class ClaimDetails {

	@Column(name="Policy_no")
	//@NotNull
	private int policyNumber;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="Claim_id")
	@NotNull
	private String claimId;
	
	@Column(name="VType")
	@NotNull
	private String vehicleType;
	
	@Column(name="User_id")
	@NotNull
	private int userId;
	
/*	@Column(name="imgUrl")
	@NotNull
	private String vehiclePhoto; */
	
	@Lob //binary data
    //@Basic(fetch = FetchType.LAZY)
	@Column(name="imgUrl")
    private String vehiclePhoto;
	
	/*
	 * @Column(name="imgUrl") private Byte[] image;
	 * 
	 * 
	 * 
	 * public Byte[] getImage() { return image; }
	 * 
	 * 
	 * public void setImage(Byte[] byteObjects) { this.image = byteObjects; }
	 * 
	 */
	@Column(name="Status")
	@NotNull
	private String status;


	public int getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	public String getClaimId() {
		return claimId;
	}


	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getVehiclePhoto() {
		return vehiclePhoto;
	}


	public void setVehiclePhoto(String vehiclePhoto) {
		this.vehiclePhoto = vehiclePhoto;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	


	@Override
	public String toString() {
		return "ClaimDetails [policyNumber=" + policyNumber + ", claimId=" + claimId + ", vehicleType=" + vehicleType
				+ ", userId=" + userId + ", vehiclePhoto=" + vehiclePhoto + ", status=" + status
				+ "]";
	}


	

	public ClaimDetails(int policyNumber, String claimId, String vehicleType, int userId, String vehiclePhoto, String status) {
		super();
		this.policyNumber = policyNumber;
		this.claimId = claimId;
		this.vehicleType = vehicleType;
		this.userId = userId;
		this.vehiclePhoto = vehiclePhoto;
		this.status = status;
	}


	public ClaimDetails() {
		super();
	}
	
	
	
	
}
