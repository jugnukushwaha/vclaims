package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.vclaims.entity.ClaimApprovalStatus;
import com.app.vclaims.entity.ClaimDetails;

public interface ClaimApprovalStatusDaoRepository extends JpaRepository<ClaimApprovalStatus, Integer>{

}
