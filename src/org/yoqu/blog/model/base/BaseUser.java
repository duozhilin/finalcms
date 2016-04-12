package org.yoqu.blog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setCreateDate(java.lang.String createDate) {
		set("createDate", createDate);
	}

	public java.lang.String getCreateDate() {
		return get("createDate");
	}

	public void setRole(java.lang.Integer role) {
		set("role", role);
	}

	public java.lang.Integer getRole() {
		return get("role");
	}

}
