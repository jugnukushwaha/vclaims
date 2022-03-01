package com.app.vclaims.services;

import java.util.List;

import com.app.vclaims.entity.User;

public interface UserService {
	public List<User> getUser();

	public void regUser(User user);
	
	public String getUserByEmail(String email);

}
