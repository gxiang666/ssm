package com.demos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demos.model.Menu;
import com.demos.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	IMenuService menuService;

	@RequestMapping("/list")
	public String menu(Model model) {
		List<Menu> list = menuService.list(null, 0, 10);
		model.addAttribute("menuList", list);

		return "/page/menu/menu";
	}

	@ResponseBody
	@RequestMapping("/names")
	public List<Menu> getMenuName() {
		List<Menu> list = menuService.list(null, 0, 10);
		return list;
	}

}
