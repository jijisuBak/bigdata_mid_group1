package com.springcompany.biz.image.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAOImpl implements ImageDAO {
	
	@Autowired
	//private SqlSession sqlSession;
	private SqlSessionTemplate sqlSession; // thread-safe
	
	@Override
	public void insert(ImageVO vo) throws Exception{
		
		sqlSession.insert("imageMapper.insert", vo);
		
	}
	
	@Override
	public List<ImageVO> select() throws Exception {
		
		return sqlSession.selectList("imageMapper.select");
	}
}
