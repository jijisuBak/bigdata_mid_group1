package com.springcompany.biz.user.dao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController{
	@Autowired
	UserService userService;
	
	// 계정 추가
	@RequestMapping("/addUser.do")
	public String AddUser(UserVO vo) {
		userService.addService(vo);
		
		// 회원가입 후 세션에 로그인 정보 등록한 후에 홈페이지로 redirect 작업
		return "redirect:home.go";
	}
	
	// 계정 수정
	@RequestMapping("/updateUser.do")
	public String UpdateUser(UserVO vo) {
		userService.updateService(vo);
		
		return null;
	}
	
	// 계정 삭제
	
	 @RequestMapping("/deleteUser.do") 
	  public String DeleteUser(HttpSession session) {
		  userService.deleteService((String)session.getAttribute("id"));
		  
		  return "home"; //회원 탈퇴 후 홈페이지로 이동.
	 }
	  
	
	// 로그인 폼
	@RequestMapping(value = "/login.do" , method = RequestMethod.GET)
	public String LogIn() {
		return "login"; // 로그인 폼 요청시 views 에 있는 login.jsp 요청.
	}
	
	// 로그인 처리
	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	public String LogIn(UserVO vo , HttpSession session) {
		//user_Service.Login(vo);
		userService.getService(vo);
		
		session.setAttribute("id", vo.getId());
		return "redirect:home.jsp";
	}
	
	// 로그아웃
	public String LogOut(HttpSession session) {
		session.invalidate(); // 로그아웃 처리.
		
		return "redirect:home.jsp"; //어느 페이지로 바로 이동할지는 상의후 결정.
		
	}
	
}
