package com.app.vclaims.services;

import java.util.List;

import com.app.vclaims.entity.Transaction;

public interface TransactionService {
	
	public List<Transaction> getTransactionDetails();
	public void transactionDetails(Transaction transaction) ;
}
