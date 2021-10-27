package com.springcompany.biz.image.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springcompany.biz.image.dao.ImageDAO;
import com.springcompany.biz.image.vo.ImageVO;


@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageDAO dao;
	
	@Override
	public void insert(ImageVO vo) throws Exception{
		
		dao.insert(vo);
	}

	@Override
	public List<ImageVO> select() throws Exception {
		
		return dao.select();
		
	}
}