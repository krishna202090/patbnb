package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * QualificationDetails generated by hbm2java
 */
public class QualificationDetails implements java.io.Serializable {

	private Integer qualId;
	private String qualName;
	private Byte isActive;
	private Set userProfileDetailses = new HashSet(0);

	public QualificationDetails() {
	}

	public QualificationDetails(String qualName, Byte isActive, Set userProfileDetailses) {
		this.qualName = qualName;
		this.isActive = isActive;
		this.userProfileDetailses = userProfileDetailses;
	}

	public Integer getQualId() {
		return this.qualId;
	}

	public void setQualId(Integer qualId) {
		this.qualId = qualId;
	}

	public String getQualName() {
		return this.qualName;
	}

	public void setQualName(String qualName) {
		this.qualName = qualName;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public Set getUserProfileDetailses() {
		return this.userProfileDetailses;
	}

	public void setUserProfileDetailses(Set userProfileDetailses) {
		this.userProfileDetailses = userProfileDetailses;
	}

}