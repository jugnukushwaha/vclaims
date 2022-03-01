package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
  
	@Query(value="SELECT Password from User where Email=:emailId",nativeQuery=true)
	public String findByemail(@Param("emailId") String emailId);
}
