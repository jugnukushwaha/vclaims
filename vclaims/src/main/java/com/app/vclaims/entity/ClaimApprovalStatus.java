package com.app.vclaims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim_status")
public class ClaimApprovalStatus {

	//claim_id,Approved_By,reason
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="claim_id")
	private String claimId;
	
	@Column(name="Approved_By")
	private String approvedBy;
	
	@Column(name="reason")
	private String reason;
	
	public String getClaimId() {
		return claimId;
	}


	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	
	public String getApprovedBy() {
		return approvedBy;
	}


	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	
	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String toString() {
		return "ClaimApprovalStatus [claimId=" + claimId + ", approvedBy=" + approvedBy + ", reason=" + reason
				+ "]";
	}
	
	public ClaimApprovalStatus(String claimId, String approvedBy, String reason) {
		super();
		this.approvedBy = approvedBy;
		this.claimId = claimId;
		this.reason = reason;
		
	}


	public ClaimApprovalStatus() {
		super();
	}
	
}
