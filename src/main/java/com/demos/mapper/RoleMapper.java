package com.demos.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demos.model.Role;

public interface RoleMapper {

	List<Role> list(@Param("role") Role role, @Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);

	int count(@Param("role") Role role);

	int insert(Role role);

	int update(Role role);

	int delete(Integer id);
}
