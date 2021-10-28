package com.springcompany.biz.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.springcompany.biz.image.dao.ImageService;
import com.springcompany.biz.image.dao.ImageVO;

@Controller
public class ImageController {
	@Autowired
	ImageService imageService;
	
	// 이미지 등록 화면
	@RequestMapping(value= "/insertImage.do", method = RequestMethod.GET)
	public String insertImageForm() {
		System.out.println("이미지 등록 화면 처리..");
		
		return "insertImageForm";
	}
	
	// 이미지 등록 처리
	@RequestMapping(value = "/insertImage.do", method = RequestMethod.POST)
	public String insertImageProc(ImageVO vo, HttpSession session) throws IOException{
		System.out.println("이미지 등록 처리..");
		
		// 이미지 업로드 처리
		String fileSaveFolder = session.getServletContext().getRealPath("/imageUpload/");
		
		MultipartFile uploadImage = vo.getUploadImage();
		
		if(!uploadImage.isEmpty()) {
			String imageName = uploadImage.getOriginalFilename();
			uploadImage.transferTo(new File(fileSaveFolder+imageName));
		}
		
		return null;
	}
}