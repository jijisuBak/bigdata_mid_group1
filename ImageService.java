package com.springcompany.biz.image.service;

import java.util.List;

import com.springcompany.biz.image.vo.ImageVO;

public interface ImageService {
	
	public void insert(ImageVO vo) throws Exception;
	
	public List<ImageVO> selectList(ImageVO vo);
	
	public ImageVO selectObject(ImageVO vo);
	
	public void update(ImageVO vo);
	
	public void delete(ImageVO vo);


}