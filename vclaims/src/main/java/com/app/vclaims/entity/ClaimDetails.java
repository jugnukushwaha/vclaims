package com.app.vclaims.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Claim_details")
public class ClaimDetails {

	@Column(name="Policy_no")
	@NotNull
	private int policyNumber;
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)

//	@GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id 
	@Column(name="Claim_id")
	@NotNull
	private String claimId;
	
	@Column(name="VType")
	@NotNull
	private String vehicleType;
	
	@Column(name="User_id")
	@NotNull
	private int userId;

	@Column(name="imgUrl")
    private String vehiclePhoto;

	public ClaimDetails() {
		super();
	}

	public ClaimDetails(int policyNumber, String claimId, String vehicleType, int userId, String vehiclePhoto) {
		super();
		this.policyNumber = policyNumber;
		this.claimId = claimId;
		this.vehicleType = vehicleType;
		this.userId = userId;
		this.vehiclePhoto = vehiclePhoto;
	}

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



	@Override
	public String toString() {
		return "ClaimDetails [policyNumber=" + policyNumber + ", claimId=" + claimId + ", vehicleType=" + vehicleType
				+ ", userId=" + userId + ", vehiclePhoto=" + vehiclePhoto + "]";
	}
	
	





	
	
	
	
}
