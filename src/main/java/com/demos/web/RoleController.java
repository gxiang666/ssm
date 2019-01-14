package com.demos.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demos.model.Role;
import com.demos.service.IRoleService;

@Controller
public class RoleController {
	
	/*@Autowired
	RoleMapper roleMapper;

	@RequestMapping("/role")
	public String role(Model model) {
		
		List<Role> roleList = roleMapper.list(null,0,10);
		model.addAttribute("roleList", roleList);
		return "/page/role/role";
	}

	@RequestMapping("/role")
	public String role(Model model) {
		
		List<Role> roleList = roleMapper.list(null,0,10);
		model.addAttribute("roleList", roleList);
		return "/page/role/role";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public List<Role> test() {
		List<Role> list = roleMapper.list(null,0,10);
		
		return list;
	}*/
	
	@Autowired
	IRoleService roleService;

	@RequestMapping("/role")
	public String role(Model model) {
		
		List<Role> roleList = roleService.list(null,0,10);
		model.addAttribute("roleList", roleList);
		return "/page/role/role";
	}

	@ResponseBody
	@RequestMapping("/test")
	public List<Role> test() {
		List<Role> list = roleService.list(null,0,10);
		
		return list;
	}
	
	@RequestMapping("/insertRole")
	public String saveRole() {

		List<Integer> list = Arrays.asList(1,2,3);
		Role role = new Role();
		role.setCode("test");
		role.setName("test");
		role.setValid(1);
		
		roleService.saveRole(role, list);
		
		return "redirect:/user/list";
	}
	
}
