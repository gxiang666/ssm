package com.demos.service;

import java.util.List;

import com.demos.model.User;

public interface IUserService {
	/**
	 * 
	 * @param user  
	 * @param pageIndex		前台传过来的数据在数据库的索引
	 * @param pageSize		每页要显示的数据的条数
	 * @return
	 */
	List<User> list(User user,int pageIndex,int pageSize);
	int count(User user);
	int insert(User user);
	int update(User user);
	int delete(Integer id);
}
