package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;

/**
 * EducationalCategory generated by hbm2java
 */
public class EducationalCategory implements java.io.Serializable {

	private Integer eduCatId;
	private String eduCatName;
	private Byte isActive;
	private Set educationalDetailses = new HashSet(0);

	public EducationalCategory() {
	}

	public EducationalCategory(String eduCatName, Byte isActive, Set educationalDetailses) {
		this.eduCatName = eduCatName;
		this.isActive = isActive;
		this.educationalDetailses = educationalDetailses;
	}

	public Integer getEduCatId() {
		return this.eduCatId;
	}

	public void setEduCatId(Integer eduCatId) {
		this.eduCatId = eduCatId;
	}

	public String getEduCatName() {
		return this.eduCatName;
	}

	public void setEduCatName(String eduCatName) {
		this.eduCatName = eduCatName;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	public Set getEducationalDetailses() {
		return this.educationalDetailses;
	}

	public void setEducationalDetailses(Set educationalDetailses) {
		this.educationalDetailses = educationalDetailses;
	}

}