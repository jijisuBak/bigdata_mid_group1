package com.springcompany.biz.image.dao;

import java.util.Date;
import java.util.Set;

public class ImageVO {
	private int imageKey;
	private String masterId;
	private Date takenDate;
	private Date uploadDate;
	private Set<String> tag;
}
