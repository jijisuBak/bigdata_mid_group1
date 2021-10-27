package com.springcompany.biz.image.dao;

import java.util.List;

import com.springcompany.biz.image.vo.ImageVO;


public interface ImageDAO {
	
	public void insert(ImageVO vo) throws Exception;
	
	public List<ImageVO> select() throws Exception;
	
}