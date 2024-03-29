package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.UserDao;
import com.javaex.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	// 로그인
	public UserVo exeLogin(UserVo userVo) {
		System.out.println("UserService.exeLogin()");

		UserVo authUser = (UserVo) userDao.userSelectByIdPw(userVo);

		return authUser;
	}

	public int exeJoin(UserVo userVo) {
		System.out.println("UserService.exeJoin()");
		
		int count = userDao.userJoin(userVo);

		return count;
	}

	public int exeUpdate(UserVo userVo) {
		System.out.println("UserService.exeUpdate()");
		
		int count = userDao.userUpdate(userVo);

		return count;
	}

}
