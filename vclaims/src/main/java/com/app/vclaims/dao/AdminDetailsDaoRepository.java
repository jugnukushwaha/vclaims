package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.Admin;

public interface AdminDetailsDaoRepository extends JpaRepository<Admin, Integer>{
	
	@Query(value="SELECT * from Admin where Admin_id=:emailId",nativeQuery=true)
	public Admin findByemail(@Param("emailId") String emailId);

}
