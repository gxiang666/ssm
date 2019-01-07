package com.demos.model;

/**
 * 角色和权限（菜单名称）的关系表
 * 
 * @author Admin
 *
 */
public class Relation {

	private Integer id;	
	private Integer rid;	//角色id
	private Integer mid;	//菜单id

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Relation [id=" + id + ", rid=" + rid + ", mid=" + mid + "]";
	}

}
