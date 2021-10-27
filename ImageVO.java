package com.springcompany.biz.image.vo;

import java.util.Date;
import java.util.Set;

import org.springframework.web.multipart.MultipartFile;

public class ImageVO {
	private String fileName;
	private int seq;
	private String writer;
	private Date takenPhotoDate;
	private Date uploadDate;
	private MultipartFile uploadImage;
	private String searchCondition;
	private String searchKeyword;
	private String uploadPath;
	private String title;
	private String content;
	
	
	public ImageVO(String fileName, String uploadPath) {
		
		super();
		this.fileName = fileName;
		this.uploadPath = uploadPath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public MultipartFile getUploadImage() {
		return uploadImage;
	}
	public void setUploadImage(MultipartFile uploadImage) {
		this.uploadImage = uploadImage;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		String value = "ImageVO[fileName="+fileName+", seq="+seq+", title="+title+", writer="+writer+", uploadPath="+uploadPath+", takenPhotoDate="+takenPhotoDate+", uploadDate="+uploadDate+"]";
		
		return value;
	}
	
}
