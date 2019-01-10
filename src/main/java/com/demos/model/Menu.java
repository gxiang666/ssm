package com.demos.model;

import java.util.List;

/**
 * 菜单表
 * 
 * @author Admin
 *
 */
public class Menu {

	private Integer id;// 菜单id
	private String name;// 菜单名称
	private String parent;// 菜单的父菜单
	private Integer index;// 菜单序号
	private Integer valid;// 是否有效
	private String remake;// 备注
	private List<Role> roleList;

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

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

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", parent=" + parent + ", index=" + index + ", valid=" + valid
				+ ", remake=" + remake + ", roleList=" + roleList + "]";
	}

}
