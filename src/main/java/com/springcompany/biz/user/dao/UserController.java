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
	
	// 							계정 관련 문단.
	
	// 계정 추가
	@RequestMapping("/addUser.do")
	public String AddUser(UserVO vo) { // 회원가입 후 세션에 로그인 정보 등록한 후에 홈페이지로 redirect 작업
		userService.addService(vo);
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
	  
	 //                             로그인 관련 문단.
	
	// 로그인 폼
	@RequestMapping(value = "/login.do" , method = RequestMethod.GET)
	public String LogIn() {
		return "login"; // 로그인 폼 요청시 views 에 있는 login.jsp 요청.
	}
	
	// 로그인 처리
	@RequestMapping(value = "/login.do" , method = RequestMethod.POST)
	public String LogIn(UserVO vo , HttpSession session) {
		userService.getService(vo);
		session.setAttribute("id", vo.getId()); // 세션에 등록.
		return "redirect:home.jsp";
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout.do")
	public String LogOut(HttpSession session) {
		session.invalidate(); // 로그아웃 처리.
		return "redirect:home.jsp";
	}
	
	//                 				찾기 관련 문단.
	
	//아이디 찾기 폼
	@RequestMapping("/searchId.me")
	public String SearchIdForm() {
		return "/search/searchID";
	}
	
	// 아이디 찾기 처리
	@RequestMapping(value = "/searchId.do" , method = RequestMethod.POST)
	public String SearchId(UserVO vo,HttpSession session) {
		String id = userService.getService(vo).getId();
		if((id !=null)&&(vo.getId()==id)) {
			session.setAttribute("id", id); // 일치하는 ID가 있을 때 그 값을 js를 통해 전달.
			return "redirect:searchIdPass";
		}else {
			return "searchMissID"; // 일치하는 ID 가 없을 때 js를 통해 알람창을 띄운 뒤 다시 history.go(-1); 작업.
		}
	}
	
	//비밀번호 찾기 폼
	@RequestMapping("/searchPw.me")
	public String SearchPwForm() {
		return "/search/searchPw";
	}
	
	//비밀번호 찾기 처리
	@RequestMapping(value = "/searchPw.do" , method = RequestMethod.POST)
	public String SearchPw(UserVO vo,HttpSession session) { // 아이디와 이름을 통해 정보 확인.
		
		String name = userService.getService(vo).getName(); //
		String id = userService.getService(vo).getId();
		
		//DB에 해당 아이디와 이름이 있는지 확인.
		if((name==null)||(name=="")||(id==null)||(id=="")) {
			return "searchMiss";
		}else if(name.equals(vo.getName())&&(id.equals(vo.getId()))){
			session.setAttribute("id", id); //새로운 비밀번호를 생성하기 위해 데이터 하나를 페이지에 전달.
			return "/myMenu/createPw";
		}
		return null;
	}
	
	// 비밀번호 찾기 처리 완료후 새로운 비밀번호 등록.
	@RequestMapping(value = "/createPw.do" , method = RequestMethod.POST)
	public String CreatePw(UserVO vo) { //비밀번호 입력양식 name에 반드시 pw 매칭시켜야 할 것!
		
		//Mybatis에 조건 id에 변경할 id의 데이터를 자동으로 입력.
		userService.updatePwService(vo);
		// 비밀번호가 변경되었습니다. alert 추가.
		return "redirect:login.jsp"; //로그인 창으로 바로 이동.
	}
	
	// 비밀번호 수정 페이지에서 새로운 비밀번호 등록.
	@RequestMapping(value = "/updatePw.do" , method = RequestMethod.POST)
	public String UpdatePw(UserVO vo) {
		userService.updatePwService(vo);
		return "redirect:updatePw.jsp"; // 등록 후에 다시 새로운 비밀번호 등록 페이지로 일단 구성.
	}
	
}
