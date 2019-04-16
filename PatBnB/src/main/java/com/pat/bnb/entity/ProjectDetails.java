package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProjectDetails generated by hbm2java
 */
public class ProjectDetails implements java.io.Serializable {

	private Integer projectId;
	private CountryDetails countryDetails;
	private ProjectSubLevelCategoryDetails projectSubLevelCategoryDetails;
	private UserDetails userDetails;
	private String projectName;
	private String projectDescription;
	private Date projectBidStartDate;
	private Date projectBidEndDate;
	private Date completionDate;
	private Set userPaymentDetailses = new HashSet(0);
	private Set projectBiddingStatuses = new HashSet(0);
	private Set projectPaymentsDetailses = new HashSet(0);
	private Set projectProgressReports = new HashSet(0);

	public ProjectDetails() {
	}

	public ProjectDetails(CountryDetails countryDetails, ProjectSubLevelCategoryDetails projectSubLevelCategoryDetails,
			UserDetails userDetails, String projectName, String projectDescription, Date projectBidStartDate,
			Date projectBidEndDate, Date completionDate, Set userPaymentDetailses, Set projectBiddingStatuses,
			Set projectPaymentsDetailses, Set projectProgressReports) {
		this.countryDetails = countryDetails;
		this.projectSubLevelCategoryDetails = projectSubLevelCategoryDetails;
		this.userDetails = userDetails;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectBidStartDate = projectBidStartDate;
		this.projectBidEndDate = projectBidEndDate;
		this.completionDate = completionDate;
		this.userPaymentDetailses = userPaymentDetailses;
		this.projectBiddingStatuses = projectBiddingStatuses;
		this.projectPaymentsDetailses = projectPaymentsDetailses;
		this.projectProgressReports = projectProgressReports;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public CountryDetails getCountryDetails() {
		return this.countryDetails;
	}

	public void setCountryDetails(CountryDetails countryDetails) {
		this.countryDetails = countryDetails;
	}

	public ProjectSubLevelCategoryDetails getProjectSubLevelCategoryDetails() {
		return this.projectSubLevelCategoryDetails;
	}

	public void setProjectSubLevelCategoryDetails(ProjectSubLevelCategoryDetails projectSubLevelCategoryDetails) {
		this.projectSubLevelCategoryDetails = projectSubLevelCategoryDetails;
	}

	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Date getProjectBidStartDate() {
		return this.projectBidStartDate;
	}

	public void setProjectBidStartDate(Date projectBidStartDate) {
		this.projectBidStartDate = projectBidStartDate;
	}

	public Date getProjectBidEndDate() {
		return this.projectBidEndDate;
	}

	public void setProjectBidEndDate(Date projectBidEndDate) {
		this.projectBidEndDate = projectBidEndDate;
	}

	public Date getCompletionDate() {
		return this.completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public Set getUserPaymentDetailses() {
		return this.userPaymentDetailses;
	}

	public void setUserPaymentDetailses(Set userPaymentDetailses) {
		this.userPaymentDetailses = userPaymentDetailses;
	}

	public Set getProjectBiddingStatuses() {
		return this.projectBiddingStatuses;
	}

	public void setProjectBiddingStatuses(Set projectBiddingStatuses) {
		this.projectBiddingStatuses = projectBiddingStatuses;
	}

	public Set getProjectPaymentsDetailses() {
		return this.projectPaymentsDetailses;
	}

	public void setProjectPaymentsDetailses(Set projectPaymentsDetailses) {
		this.projectPaymentsDetailses = projectPaymentsDetailses;
	}

	public Set getProjectProgressReports() {
		return this.projectProgressReports;
	}

	public void setProjectProgressReports(Set projectProgressReports) {
		this.projectProgressReports = projectProgressReports;
	}

}
