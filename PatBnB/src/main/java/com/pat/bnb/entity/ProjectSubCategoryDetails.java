package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectSubCategoryDetails generated by hbm2java
 */
public class ProjectSubCategoryDetails implements java.io.Serializable {

	private Integer projectSubCatId;
	private ProjectCategoryDetails projectCategoryDetails;
	private String projectSubCatName;
	private Byte isActive;
	private Set projectSubLevelCategoryDetailses = new HashSet(0);

	public ProjectSubCategoryDetails() {
	}

	public ProjectSubCategoryDetails(ProjectCategoryDetails projectCategoryDetails, String projectSubCatName,
			Byte isActive, Set projectSubLevelCategoryDetailses) {
		this.projectCategoryDetails = projectCategoryDetails;
		this.projectSubCatName = projectSubCatName;
		this.isActive = isActive;
		this.projectSubLevelCategoryDetailses = projectSubLevelCategoryDetailses;
	}

	public Integer getProjectSubCatId() {
		return this.projectSubCatId;
	}

	public void setProjectSubCatId(Integer projectSubCatId) {
		this.projectSubCatId = projectSubCatId;
	}

	public ProjectCategoryDetails getProjectCategoryDetails() {
		return this.projectCategoryDetails;
	}

	public void setProjectCategoryDetails(ProjectCategoryDetails projectCategoryDetails) {
		this.projectCategoryDetails = projectCategoryDetails;
	}

	public String getProjectSubCatName() {
		return this.projectSubCatName;
	}

	public void setProjectSubCatName(String projectSubCatName) {
		this.projectSubCatName = projectSubCatName;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public Set getProjectSubLevelCategoryDetailses() {
		return this.projectSubLevelCategoryDetailses;
	}

	public void setProjectSubLevelCategoryDetailses(Set projectSubLevelCategoryDetailses) {
		this.projectSubLevelCategoryDetailses = projectSubLevelCategoryDetailses;
	}

}
