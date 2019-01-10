package com.demos.model;

import java.util.List;

/**
 * 角色表
 * 
 * @author Admin
 *
 */
public class Role {

	private Integer id;// 角色id
	private String name;// 角色名称
	private String code;// 角色code
	private Integer valid;// 是否有效
	private List<Menu> menuList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", code=" + code + ", valid=" + valid + ", menuList=" + menuList
				+ "]";
	}

}
