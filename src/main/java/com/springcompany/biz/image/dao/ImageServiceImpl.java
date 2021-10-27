package com.springcompany.biz.image.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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