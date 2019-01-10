package com.demos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demos.mapper.RoleMapper;
import com.demos.model.Role;

@Controller
public class RoleController {
	
	@Autowired
	RoleMapper roleMapper;

	@RequestMapping("/role")
	public String role() {
		return "/page/role/role";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public List<Role> test() {
		Role role = new Role();
		role.setId(1);
		List<Role> list = roleMapper.list(role,0,10);
		
		return list;
	}
	
}
