package com.springcompany.biz.image.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class ImageRowMapper implements RowMapper<ImageVO>{

	@Override
	public ImageVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ImageVO image = new ImageVO();
		
		image.setImageKey(rs.getInt("imageKey"));
		image.setMasterId(rs.getString("masterId"));
		image.setTagList(rs.getString("tagList"));
		image.setTakenPhotoDate(rs.getDate("takenPhotoDate"));
		image.setUploadDate(rs.getDate("uploadDate"));
		
		return image;
	}

}
