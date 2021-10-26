package com.springcompany.biz.image.dao;

import java.util.List;

public interface ImageService {
	
	public void insert(ImageVO vo);
	
	public List<ImageVO> selectList(ImageVO vo);
	
	public ImageVO selectObject(ImageVO vo);
	
	public void update(ImageVO vo);
	
	public void delete(ImageVO vo);

}