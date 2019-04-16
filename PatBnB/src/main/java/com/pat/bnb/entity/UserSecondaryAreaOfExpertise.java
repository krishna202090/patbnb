package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

/**
 * UserSecondaryAreaOfExpertise generated by hbm2java
 */
public class UserSecondaryAreaOfExpertise implements java.io.Serializable {

	private UserSecondaryAreaOfExpertiseId id;
	private ExpertiseArea expertiseArea;
	private UserDetails userDetails;

	public UserSecondaryAreaOfExpertise() {
	}

	public UserSecondaryAreaOfExpertise(UserSecondaryAreaOfExpertiseId id, UserDetails userDetails) {
		this.id = id;
		this.userDetails = userDetails;
	}

	public UserSecondaryAreaOfExpertise(UserSecondaryAreaOfExpertiseId id, ExpertiseArea expertiseArea,
			UserDetails userDetails) {
		this.id = id;
		this.expertiseArea = expertiseArea;
		this.userDetails = userDetails;
	}

	public UserSecondaryAreaOfExpertiseId getId() {
		return this.id;
	}

	public void setId(UserSecondaryAreaOfExpertiseId id) {
		this.id = id;
	}

	public ExpertiseArea getExpertiseArea() {
		return this.expertiseArea;
	}

	public void setExpertiseArea(ExpertiseArea expertiseArea) {
		this.expertiseArea = expertiseArea;
	}

	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
