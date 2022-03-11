package com.app.vclaims.entity;

import java.util.Date;

//@Entity
public class AdminDashBoard {

	private String claimId;

	private int policyNo;

	private String vType;

	private String status;
	private String imgUrl;

	private String firstName;

	private String lastName;

	private String email;

	private String vehicleBrand;

	private String insurancePeriod;

	private String vehicleNo;

	private Date insuranceStartDate;

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(String insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Date getInsuranceStartDate() {
		return insuranceStartDate;
	}

	public void setInsuranceStartDate(Date insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}

	public AdminDashBoard() {
		super();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public AdminDashBoard(String claimId, int policyNo, String vType, String status, String imgUrl, String firstName,
			String lastName, String email, String vehicleBrand, String insurancePeriod, String vehicleNo,
			Date insuranceStartDate) {
		super();
		this.claimId = claimId;
		this.policyNo = policyNo;
		this.vType = vType;
		this.status = status;
		this.imgUrl = imgUrl;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.vehicleBrand = vehicleBrand;
		this.insurancePeriod = insurancePeriod;
		this.vehicleNo = vehicleNo;
		this.insuranceStartDate = insuranceStartDate;
	}

	@Override
	public String toString() {
		return "AdminDashBoard [claimId=" + claimId + ", policyNo=" + policyNo + ", vType=" + vType + ", status="
				+ status + ", imgUrl=" + imgUrl + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", vehicleBrand=" + vehicleBrand + ", insurancePeriod=" + insurancePeriod + ", vehicleNo="
				+ vehicleNo + ", insuranceStartDate=" + insuranceStartDate + "]";
	}

}
