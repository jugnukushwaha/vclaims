package com.app.vclaims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

@Entity
@Table(name="Transaction")
public class Transaction {

	@Column(name="Policy_no")
	@NotNull
	private int policyId;
	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="Transaction_id")
	@NotNull
	private String transactionId;
	
	@Column(name="Ins_amount")
	@NotNull
	private int insuranceAmount;
	
	public Transaction() {
		super();
	}

	public Transaction(int policyId, String transactionId, int insuranceAmount) {
		super();
		this.policyId = policyId;
		this.transactionId = transactionId;
		this.insuranceAmount = insuranceAmount;
	}
	
	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(int insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	@Override
	public String toString() {
		return "Transaction [policyId=" + policyId + ", transactionId=" + transactionId + ", insuranceAmount="
				+ insuranceAmount + "]";
	}


	
	
	
	
}
