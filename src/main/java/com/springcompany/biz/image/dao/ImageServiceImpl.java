package com.springcompany.biz.image.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageServiceImpl implements ImageService {

	@Autowired
	private SqlSession sqlSession;
	
	public void insert(ImageVO vo){
		sqlSession.insert("", vo);
	}

	@Override
	public List<ImageVO> selectList(ImageVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageVO selectObject(ImageVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ImageVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ImageVO vo) {
		// TODO Auto-generated method stub
		
	}
}