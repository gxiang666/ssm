package com.demos.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demos.model.Menu;

public interface MenuMapper {
	
	List<Menu> list(@Param("menu") Menu menu, @Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);

}
