package com.springcompany.biz.image.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class Method2_ImageDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	// CRUD 기능의 메서드 구현
		// 글 등록
		public void insertImage(ImageVO vo) {
			mybatis.insert("ImageDAO.insertImage", vo);
		}
		
		
		// 글 목록 조회
		public List<ImageVO> getImageList(ImageVO vo){
			
			if(vo.getSearchCondition().equals("TITLE")) {
				return mybatis.selectList("ImageDAO.getImageList_T", vo);
			}else if(vo.getSearchCondition().equals("CONTENT")) {
				return mybatis.selectList("ImageDAO.getImageList_C", vo);
			}else {
				return mybatis.selectList("ImageDAO.getImageList_T", vo);
			}
			
		}
		
		// 글 상세 조회
		public ImageVO getImage(int seq) {
			return mybatis.selectOne("ImageDAO.getImage", seq);
		}
		
		// 글 수정
		public void updateImage(ImageVO vo) {
			mybatis.update("ImageDAO.updateImage", vo);
		}
		
		// 글 삭제
		public void deleteImage(int seq) {
			mybatis.delete("ImageDAO.deleteImage", seq);
		}
	}


}
