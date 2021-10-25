package com.springcompany.biz.User.dao;

public interface User_Service {
	
	public void addService(); // 계정 등록(회원가입)
	
	public void updateService(); // 계정 수정(정보수정)
	
	public void deleteService(); // 계정 삭제(회원탈퇴)
	
	public void loginService(); // DB에 있는 데이터와 자료 비교후 로그인
	
}
