package com.springcompany.biz.image.dao;

import java.util.List;

public interface ImageDAO {
	
	public void insert(ImageVO vo) throws Exception;
	
	public List<ImageVO> select() throws Exception;
	
	}