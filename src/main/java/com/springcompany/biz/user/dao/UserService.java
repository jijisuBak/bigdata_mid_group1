package com.springcompany.biz.user.dao;

public interface UserService {
	
	public void addService(UserVO vo); // 계정 등록(회원가입)
	
	public void updateService(UserVO vo); // 계정 수정(정보수정)
	
	public void deleteService(String args); // 계정 삭제(회원탈퇴)
	
	public void getService(UserVO vo);
	
	public void addPetService();
	
	public void deletePetService();
	
	public void addFollowService();
	
	public void deleteFollowService();
	
}
