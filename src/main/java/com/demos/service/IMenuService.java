package com.demos.service;

import java.util.List;

import com.demos.model.Menu;

public interface IMenuService {

	List<Menu> list(Menu menu, Integer pageIndex, Integer pageSize);
}
