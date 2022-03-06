package com.app.vclaims.dao;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.vclaims.entity.ClaimDetails;

@Repository
public interface AdminDashboardDaoRepository extends JpaRepository<ClaimDetails, Integer> {

	@Query(value="Select c.claim_id,c.policy_no,c.vtype,c.status, u.First_name , u.Last_name , u.Email, p.Vehicle_brand,p.Ins_Period,p.Vehicle_No,p.Ins_Start_Date From Claim_details as c"
			+ " INNER JOIN  User  as u ON u.User_id =  c.User_id "
			+ " INNER JOIN policy_details as p ON p.Policy_no=c.Policy_no"
			+ " where c.status=:status",nativeQuery=true)
	public List<Tuple> getAdminDashBoardDetails(String status);

	

}
