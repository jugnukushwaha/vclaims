package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.vclaims.entity.Transaction;

public interface TransactioDaoRepository extends JpaRepository<Transaction, Integer> {

}