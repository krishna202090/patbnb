package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectStatusCategory generated by hbm2java
 */
public class ProjectStatusCategory implements java.io.Serializable {

	private Integer statusCatStatusId;
	private String projectCatStatusName;
	private Set projectProgressReports = new HashSet(0);

	public ProjectStatusCategory() {
	}

	public ProjectStatusCategory(String projectCatStatusName, Set projectProgressReports) {
		this.projectCatStatusName = projectCatStatusName;
		this.projectProgressReports = projectProgressReports;
	}

	public Integer getStatusCatStatusId() {
		return this.statusCatStatusId;
	}

	public void setStatusCatStatusId(Integer statusCatStatusId) {
		this.statusCatStatusId = statusCatStatusId;
	}

	public String getProjectCatStatusName() {
		return this.projectCatStatusName;
	}

	public void setProjectCatStatusName(String projectCatStatusName) {
		this.projectCatStatusName = projectCatStatusName;
	}

	public Set getProjectProgressReports() {
		return this.projectProgressReports;
	}

	public void setProjectProgressReports(Set projectProgressReports) {
		this.projectProgressReports = projectProgressReports;
	}

}
