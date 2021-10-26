package com.springcompany.biz.user.dao;

import java.util.List;

import com.springcompany.biz.pet.dao.PetVO;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private int profileImageKey;
	private String address;
	private List<PetVO> managePetList;
	private List<PetVO> followPetList;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProfileImageKey() {
		return profileImageKey;
	}
	public void setProfileImageKey(int profileImageKey) {
		this.profileImageKey = profileImageKey;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<PetVO> getManagePetList() {
		return managePetList;
	}
	public void setManagePetList(List<PetVO> managePetList) {
		this.managePetList = managePetList;
	}
	public List<PetVO> getFollowPetList() {
		return followPetList;
	}
	public void setFollowPetList(List<PetVO> followPetList) {
		this.followPetList = followPetList;
	}

}