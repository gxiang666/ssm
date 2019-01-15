package com.demos.service;

import java.util.List;

import com.demos.model.Role;

public interface IRoleService {

	List<Role> list(Role role, int pageIndex, int pageSize);

	void saveRole(Role role, List<Integer> menuIdList);

	void delete(Integer id);

}
