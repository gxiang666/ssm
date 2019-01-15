package com.demos.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demos.model.Role;

public interface RoleMapper {

	List<Role> list(@Param("role") Role role, @Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);

	int insertRole(Role role);

	void delete(Integer id);

}
