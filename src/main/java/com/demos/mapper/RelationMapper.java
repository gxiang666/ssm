package com.demos.mapper;

import java.util.List;

import com.demos.model.Menu;
import com.demos.model.Relation;
import com.demos.model.Role;

public interface RelationMapper {
	
	//根据菜单id查询出角色列表
	List<Role> listRole(Integer id);
	
	//根据角色id查询出菜单列表
	List<Menu> listMenu(Integer id);
	
}