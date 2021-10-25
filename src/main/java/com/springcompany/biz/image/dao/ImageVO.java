package com.springcompany.biz.image.dao;

import java.util.Date;
import java.util.Set;

public class ImageVO {
	private int imageKey;
	private String masterId;
	private Set<String> tagList;
	private Date takenPhotoDate;
	private Date uploadDate;
	
	public int getImageKey() {
		return imageKey;
	}
	public void setImageKey(int imageKey) {
		this.imageKey = imageKey;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	public Set<String> getTagList() {
		return tagList;
	}
	public void setTagList(Set<String> tagList) {
		this.tagList = tagList;
	}
	public Date getTakenPhotoDate() {
		return takenPhotoDate;
	}
	public void setTakenPhotoDate(Date takenPhotoDate) {
		this.takenPhotoDate = takenPhotoDate;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
}