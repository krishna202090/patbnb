package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectCategoryDetails generated by hbm2java
 */
public class ProjectCategoryDetails implements java.io.Serializable {

	private Integer projectCatId;
	private String projectCatName;
	private Byte isActive;
	private Set projectSubCategoryDetailses = new HashSet(0);

	public ProjectCategoryDetails() {
	}

	public ProjectCategoryDetails(String projectCatName, Byte isActive, Set projectSubCategoryDetailses) {
		this.projectCatName = projectCatName;
		this.isActive = isActive;
		this.projectSubCategoryDetailses = projectSubCategoryDetailses;
	}

	public Integer getProjectCatId() {
		return this.projectCatId;
	}

	public void setProjectCatId(Integer projectCatId) {
		this.projectCatId = projectCatId;
	}

	public String getProjectCatName() {
		return this.projectCatName;
	}

	public void setProjectCatName(String projectCatName) {
		this.projectCatName = projectCatName;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public Set getProjectSubCategoryDetailses() {
		return this.projectSubCategoryDetailses;
	}

	public void setProjectSubCategoryDetailses(Set projectSubCategoryDetailses) {
		this.projectSubCategoryDetailses = projectSubCategoryDetailses;
	}

}
