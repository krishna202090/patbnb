package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

/**
 * UserEducationDetails generated by hbm2java
 */
public class UserEducationDetails implements java.io.Serializable {

	private UserEducationDetailsId id;
	private EducationalDetails educationalDetails;
	private UserDetails userDetails;

	public UserEducationDetails() {
	}

	public UserEducationDetails(UserEducationDetailsId id, EducationalDetails educationalDetails,
			UserDetails userDetails) {
		this.id = id;
		this.educationalDetails = educationalDetails;
		this.userDetails = userDetails;
	}

	public UserEducationDetailsId getId() {
		return this.id;
	}

	public void setId(UserEducationDetailsId id) {
		this.id = id;
	}

	public EducationalDetails getEducationalDetails() {
		return this.educationalDetails;
	}

	public void setEducationalDetails(EducationalDetails educationalDetails) {
		this.educationalDetails = educationalDetails;
	}

	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
