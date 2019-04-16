package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

/**
 * UserPaymentDetails generated by hbm2java
 */
public class UserPaymentDetails implements java.io.Serializable {

	private Integer id;
	private ProjectDetails projectDetails;
	private UserDetails userDetails;
	private Double amount;

	public UserPaymentDetails() {
	}

	public UserPaymentDetails(ProjectDetails projectDetails, UserDetails userDetails, Double amount) {
		this.projectDetails = projectDetails;
		this.userDetails = userDetails;
		this.amount = amount;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectDetails getProjectDetails() {
		return this.projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
