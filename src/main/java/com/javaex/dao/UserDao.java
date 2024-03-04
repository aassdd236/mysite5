package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public UserVo userSelectByIdPw(UserVo userVo) {
		System.out.println("UserDao.userSelectByIdPw()");
		
		UserVo authUser=sqlSession.selectOne("user.selectByIdPw", userVo);
		
		System.out.println(authUser);
		
		return authUser;
	}

	public int userJoin(UserVo userVo) {
		System.out.println("userDao.userJoin()");

		int count = sqlSession.insert("user.insert",userVo);
		
		return count;
	}
}
