package com.springcompany.biz.image.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcompany.biz.image.dao.ImageVO;

@Repository
public class ImageDAOImpl implements ImageDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(ImageVO vo) throws Exception{
		
		sqlSession.insert("imageMapper.insert", vo);
		
	}
	
	@Override
	public List<ImageVO> select() throws Exception {
		
		return sqlSession.selectList("imageMapper.select");
	}
}
