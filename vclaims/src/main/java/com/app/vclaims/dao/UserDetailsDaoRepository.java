package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.vclaims.entity.User;

public interface UserDetailsDaoRepository extends JpaRepository<User, Integer> {
	
	@Query(value="SELECT * from User where Email=:emailId",nativeQuery=true)
	public User findByemail(@Param("emailId") String emailId);

}
