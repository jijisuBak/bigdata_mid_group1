package com.springcompany.biz.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
	// 비즈니스 로직 시작.
	@Autowired
	UserDAO userDAO;
	
	@Override
	public void addService(UserVO vo) {
		userDAO.addUser(vo);
	}

	@Override
	public void updateService(UserVO vo) {
		userDAO.updateUser(vo);
	}

	@Override
	public void deleteService(String args) {
		userDAO.deleteUser(vo);
	}

	@Override
	public void getService(UserVO vo) {
		
	}

	public void addPetService() {
		userDAO.insertPet();
	}

	public void deletePetService() {
		userDAO.deletePet();
	}

	public void addFollowService() {
		userDAO.insertFollow();
	}
	

	@Override
	public void deleteFollowService() {
		userDAO.deleteFollow();
	}
	
	
	
}
