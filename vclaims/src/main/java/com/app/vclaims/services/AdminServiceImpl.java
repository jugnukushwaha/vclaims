package com.app.vclaims.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.AdminDetailsDaoRepository;
import com.app.vclaims.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDetailsDaoRepository adminDao;

	@Override
	public Admin getAdmin(String emailId) {
		return adminDao.findByemail(emailId);
	}

}
