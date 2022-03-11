package com.app.vclaims.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.vclaims.dao.AdminDashboardDaoRepository;
import com.app.vclaims.entity.AdminDashBoard;

@Service
public class AdminDashboardServicesImpl implements AdminDashboardServices {
	@Autowired
	private AdminDashboardDaoRepository adminDashboard;

	@Override
	public List<AdminDashBoard> getAdminDashboardDetails(String status) {
		List<Tuple> adminTuple = adminDashboard.getAdminDashBoardDetails(status);
		
		 List<AdminDashBoard> adminDashBoard = adminTuple.stream()
		            .map(t -> new AdminDashBoard(
		                    t.get(0, String.class), 
		                    t.get(1, Integer.class), 
		                    t.get(2, String.class),
		                    t.get(3, String.class), 
		                    t.get(4, String.class), 
		                    t.get(5, String.class), 
		                    t.get(6, String.class), 
		                    t.get(7, String.class),
		                    t.get(8, String.class), 
		                    t.get(9, String.class), 
		                    t.get(10, String.class), 
		                    t.get(11, Date.class)
		                    ))
		            .collect(Collectors.toList());
		return adminDashBoard;
	}

}
