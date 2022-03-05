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
	private int policyNumber;
	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="Transaction_id")
	@NotNull
	private String transactionId;
	
	@Column(name="Ins_amount")
	@NotNull
	private int insuranceAmount;

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
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
		return "Transaction [policyNumber=" + policyNumber + ", transactionId=" + transactionId + ", insuranceAmount="
				+ insuranceAmount + "]";
	}

	public Transaction(int policyNumber, String transactionId, int insuranceAmount) {
		super();
		this.policyNumber = policyNumber;
		this.transactionId = transactionId;
		this.insuranceAmount = insuranceAmount;
	}

	public Transaction() {
		super();
	}
	
	
	
}
