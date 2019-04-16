package com.pat.bnb.model;

import org.springframework.http.HttpStatus;

public class ResponseModel {

	Object entity;
	String code;
	public ResponseModel(Object entity, String code) {
		super();
		this.entity = entity;
		this.code = code;
	}
	public Object getEntity() {
		return entity;
	}
	public void setEntity(Object entity) {
		this.entity = entity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	

}
