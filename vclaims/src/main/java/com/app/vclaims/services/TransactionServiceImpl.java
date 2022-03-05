package com.app.vclaims.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.vclaims.dao.TransactioDaoRepository;
import com.app.vclaims.entity.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactioDaoRepository transactionDaoRep;

	@Override
	public void transactionDetails(Transaction transaction) {
		transactionDaoRep.save(transaction);
		
	}

	@Override
	public List<Transaction> getTransactionDetails() {
		
		return transactionDaoRep.findAll();
	}
	
}
