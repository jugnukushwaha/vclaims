package com.app.vclaims.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.UserDetailsDaoRepository;
import com.app.vclaims.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDetailsDaoRepository userdao;
	
	@Override
	public List<User> getUser() {
		return userdao.findAll();
	}

	@Override
	public void regUser(User user) {
		userdao.save(user);
		
	}

	@Override
	public User getUserByEmail(String email) {
		
		return userdao.findByemail(email);
	}

}
