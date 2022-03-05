package com.app.vclaims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.vclaims.entity.Transaction;
import com.app.vclaims.services.TransactionServiceImpl;

//@CrossOrigin("*")
@RestController
@RequestMapping("/vclaims")
public class TransactionController {

	@Autowired
	private TransactionServiceImpl transactionServiceImpl;
	
	@PostMapping("/transaction")
	public void getTransactionDetails(@RequestBody Transaction transaction) {
		transactionServiceImpl.transactionDetails(transaction);
		System.out.println("hello");
	}
	
	@GetMapping("/getTransaction")
	public List<Transaction> getTransactionDetails() {
		return transactionServiceImpl.getTransactionDetails();
	}
}
