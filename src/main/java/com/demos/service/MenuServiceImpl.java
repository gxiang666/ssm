package com.demos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demos.mapper.MenuMapper;
import com.demos.model.Menu;

@Service("menuService")
public class MenuServiceImpl implements IMenuService{

	@Autowired
	MenuMapper menuMapper;

	@Override
	public List<Menu> list(Menu menu, Integer pageIndex, Integer pageSize) {
		List<Menu> list = menuMapper.list(menu, pageIndex, pageSize);
		return list;
	}
}
