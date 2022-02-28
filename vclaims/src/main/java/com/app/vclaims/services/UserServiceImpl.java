package com.app.vclaims.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.UserDao;
import com.app.vclaims.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	@Override
	public List<User> getUser() {
		return userdao.findAll();
	}

	@Override
	public void regUser(User user) {
		userdao.save(user);
		
	}

}
