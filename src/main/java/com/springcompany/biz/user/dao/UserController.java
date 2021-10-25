package com.springcompany.biz.user.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController{
	
	// 계정 추가
	@RequestMapping()
	public String AddUser() {
		
		// 회원가입 후 세션에 로그인 정보 등록한 후에 홈페이지로 redirect 작업
		return null;
	}
	
	// 계정 수정
	@RequestMapping()
	public String UpdateUser() {
		
		
		return null;
	}
	
	
	// 계정 삭제
	@RequestMapping()
	public String DeleteUser() {
		
		
		return null;
	}
	
	
	// 로그인 폼
	@RequestMapping(value = "login.do" , method = RequestMethod.GET)
	public String LogIn() {
		return "login"; //(로그인 페이지로 재요청.) (Resolver prefix(/WEB_INF/views) , subfix(.jsp) 세팅
	}
	
	// 로그인 처리
	@RequestMapping(value = "login.do" , method = RequestMethod.POST)
	public String LogIn(UserVO vo) {
		//user_Service.Login(vo);
		
		
		return null;
	}
	
	
	// 로그아웃
	public String LogOut() {
		//session.invalidate(); 로그아웃 처리.
		
		return ""; //어느 페이지로 바로 이동할지는 상의후 결정.
		
	}
	
	
	
}
