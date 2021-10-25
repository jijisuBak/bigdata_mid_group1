package com.springcompany.biz.image.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDAOImpl implements ImageDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public void insert(ImageVO vo) throws Exception {
		sqlSession.insert("", vo);
	}
}
