package org.yoqu.blog.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUrl<M extends BaseUrl<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setModule(java.lang.String module) {
		set("module", module);
	}

	public java.lang.String getModule() {
		return get("module");
	}

	public void setMehod(java.lang.String mehod) {
		set("mehod", mehod);
	}

	public java.lang.String getMehod() {
		return get("mehod");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}

	public java.lang.String getUrl() {
		return get("url");
	}

}
