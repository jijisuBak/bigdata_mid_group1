package com.springcompany.biz.User.dao;

import java.util.List;

import com.springcompany.biz.image.dao.ImageVO;
import com.springcompany.biz.pet.dao.PetVO;

public class UserVO {
	private String id;
	private String password;
	private String name;
	private int profileImageKey;
	private String address;
	private String email;
<<<<<<< Updated upstream
=======
	
	private List<ImageVO> imageVO;
>>>>>>> Stashed changes
	private List<PetVO> managePetList;
	private List<PetVO> followPetList;
}
