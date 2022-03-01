package com.app.vclaims.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.PolicyDetails;

public interface PolicyDetailsDaoRepository extends JpaRepository<PolicyDetails, Integer> {

	@Query(value="SELECT Policy_no from policy_details where User_id=:Id",nativeQuery=true)
	public List<Integer> getPolicyNumbersById(@Param("Id") int userId );
}

