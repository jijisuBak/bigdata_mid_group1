package com.springcompany.biz.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void addUser() {
		
	}
	
	public void updateUser() {
		
	}
	
	public void updateUserPw(UserVO vo) {
		mybatis.update("UserDAO.updatePW", vo);
	}
	
	public void deleteUser() {
		
	}
	
	public UserVO selectUser(UserVO vo) {
		return null;
	}
	
	public void insertPet() {
		
	}
	
	public void updatePet() {
		
	}
	
	public void deletePet() {
		
	}
	
	public void insertFollow() {
		
	}
	
	public void deleteFollow() {
		
	}
	
}
