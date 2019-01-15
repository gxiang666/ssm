package com.demos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demos.mapper.RelationMapper;
import com.demos.mapper.RoleMapper;
import com.demos.model.Role;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {

	@Autowired
	RoleMapper roleMapper;

	@Autowired
	RelationMapper relationMapper;
	
	@Override
	public List<Role> list(Role role, int pageIndex, int pageSize) {
		List<Role> roleList = roleMapper.list(null, 0, 10);

		return roleList;
	}

	@Override
	@Transactional
	public void saveRole(Role role, List<Integer> menuIdList) {
		roleMapper.insertRole(role);
		relationMapper.insert(role.getId(), menuIdList);
	}

	@Override
	public void delete(Integer id) {
		
		roleMapper.delete(id);
	}

}
