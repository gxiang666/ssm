package com.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

	@RequestMapping("/role")
	public String role() {
		return "/page/role/role";
	}
}
