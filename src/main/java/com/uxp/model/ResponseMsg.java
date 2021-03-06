package com.uxp.model;

import java.io.Serializable;

public class ResponseMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	
	public ResponseMsg() {}
	
	public ResponseMsg(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
