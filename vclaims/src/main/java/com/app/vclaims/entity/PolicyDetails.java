package com.app.vclaims.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="Policy_details")
public class PolicyDetails {

	@Id
	@SequenceGenerator(name="sequenceGenerator", initialValue = 10004 , allocationSize=1 , sequenceName="policy_seq_generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequenceGenerator")
	@Column(name="Policy_no")
	@NotNull
	private int policyId;

	@Column(name="User_id")
	@NotNull
	private int userId;

	@Column(name="VType")
	@NotNull
	private String vehicleType;

	@Column(name="Vehicle_brand")
	@NotNull
	private String vehicleBrand;

	@Column(name="Ins_Period")
	@NotNull
	private String insurancePeriod;
    
	@Column(name="Vehicle_Pur_date")
	@NotNull
	private Date vehiclePurchaseDate;
	
	@Column(name="Vehicle_value")
	@NotNull
	private Long vehicleValue;

	@Column(name="Vehicle_No")
	@NotNull
	private String vehicleNo;

	@Column(name="Ins_Start_Date")
	@NotNull
	private Date insuranceStartDate;

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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

	public Date getVehiclePurchaseDate() {
		return vehiclePurchaseDate;
	}

	public void setVehiclePurchaseDate(Date vehiclePurchaseDate) {
		this.vehiclePurchaseDate = vehiclePurchaseDate;
	}

	public Long getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(Long vehicleValue) {
		this.vehicleValue = vehicleValue;
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

	@Override
	public String toString() {
		return "PolicyDetails [policyId=" + policyId + ", userId=" + userId + ", vehicleType=" + vehicleType
				+ ", vehicleBrand=" + vehicleBrand + ", insurancePeriod=" + insurancePeriod + ", vehiclePurchaseDate="
				+ vehiclePurchaseDate + ", vehicleValue=" + vehicleValue + ", vehicleNo=" + vehicleNo
				+ ", insuranceStartDate=" + insuranceStartDate + "]";
	}

	public PolicyDetails(int policyId, int userId, String vehicleType, String vehicleBrand, String insurancePeriod,
			Date vehiclePurchaseDate, Long vehicleValue, String vehicleNo, Date insuranceStartDate) {
		this.policyId = policyId;
		this.userId = userId;
		this.vehicleType = vehicleType;
		this.vehicleBrand = vehicleBrand;
		this.insurancePeriod = insurancePeriod;
		this.vehiclePurchaseDate = vehiclePurchaseDate;
		this.vehicleValue = vehicleValue;
		this.vehicleNo = vehicleNo;
		this.insuranceStartDate = insuranceStartDate;
	}

	public PolicyDetails() {
	}

}
