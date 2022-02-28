package com.app.vclaims.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.vclaims.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {


}
