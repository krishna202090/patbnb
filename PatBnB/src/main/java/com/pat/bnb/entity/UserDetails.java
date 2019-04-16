package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * UserDetails entity model
 */

@Entity
@Table(name = "user_details")
public class UserDetails implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer userId;

	@OneToOne(targetEntity = UserType.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "user_type_id")
	private UserType userType;

	@Column(name = "login_id")
	private String loginId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "is_active")
	private Byte isActive;

	/*
	 * private Set userProfileDetailses = new HashSet(0); private Set
	 * userSecondaryAreaOfExpertises = new HashSet(0); private Set
	 * userProfessionalQualDetailses = new HashSet(0); private Set userBankDetailses
	 * = new HashSet(0); private Set userAdminRatingsDetailsesForAdminId = new
	 * HashSet(0); private Set userEducationDetailses = new HashSet(0); private Set
	 * userPaymentDetailses = new HashSet(0); private Set userSkillsDetailses = new
	 * HashSet(0); private Set projectPaymentsDetailses = new HashSet(0); private
	 * Set projectDetailses = new HashSet(0); private Set projectBiddingStatuses =
	 * new HashSet(0); private Set userAdminRatingsDetailsesForUserId = new
	 * HashSet(0);
	 */
	public UserDetails() {
	}

	/*
	 * public UserDetails(UserType userType, String loginId, String firstName,
	 * String lastName, String emailId, String password, Byte isActive, Set
	 * userProfileDetailses, Set userSecondaryAreaOfExpertises, Set
	 * userProfessionalQualDetailses, Set userBankDetailses, Set
	 * userAdminRatingsDetailsesForAdminId, Set userEducationDetailses, Set
	 * userPaymentDetailses, Set userSkillsDetailses, Set projectPaymentsDetailses,
	 * Set projectDetailses, Set projectBiddingStatuses, Set
	 * userAdminRatingsDetailsesForUserId) { this.userType = userType; this.loginId
	 * = loginId; this.firstName = firstName; this.lastName = lastName; this.emailId
	 * = emailId; this.password = password; this.isActive = isActive;
	 * this.userProfileDetailses = userProfileDetailses;
	 * this.userSecondaryAreaOfExpertises = userSecondaryAreaOfExpertises;
	 * this.userProfessionalQualDetailses = userProfessionalQualDetailses;
	 * this.userBankDetailses = userBankDetailses;
	 * this.userAdminRatingsDetailsesForAdminId =
	 * userAdminRatingsDetailsesForAdminId; this.userEducationDetailses =
	 * userEducationDetailses; this.userPaymentDetailses = userPaymentDetailses;
	 * this.userSkillsDetailses = userSkillsDetailses; this.projectPaymentsDetailses
	 * = projectPaymentsDetailses; this.projectDetailses = projectDetailses;
	 * this.projectBiddingStatuses = projectBiddingStatuses;
	 * this.userAdminRatingsDetailsesForUserId = userAdminRatingsDetailsesForUserId;
	 * }
	 */

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	/*
	 * public Set getUserProfileDetailses() { return this.userProfileDetailses; }
	 * 
	 * public void setUserProfileDetailses(Set userProfileDetailses) {
	 * this.userProfileDetailses = userProfileDetailses; }
	 * 
	 * public Set getUserSecondaryAreaOfExpertises() { return
	 * this.userSecondaryAreaOfExpertises; }
	 * 
	 * public void setUserSecondaryAreaOfExpertises(Set
	 * userSecondaryAreaOfExpertises) { this.userSecondaryAreaOfExpertises =
	 * userSecondaryAreaOfExpertises; }
	 * 
	 * public Set getUserProfessionalQualDetailses() { return
	 * this.userProfessionalQualDetailses; }
	 * 
	 * public void setUserProfessionalQualDetailses(Set
	 * userProfessionalQualDetailses) { this.userProfessionalQualDetailses =
	 * userProfessionalQualDetailses; }
	 * 
	 * public Set getUserBankDetailses() { return this.userBankDetailses; }
	 * 
	 * public void setUserBankDetailses(Set userBankDetailses) {
	 * this.userBankDetailses = userBankDetailses; }
	 * 
	 * public Set getUserAdminRatingsDetailsesForAdminId() { return
	 * this.userAdminRatingsDetailsesForAdminId; }
	 * 
	 * public void setUserAdminRatingsDetailsesForAdminId(Set
	 * userAdminRatingsDetailsesForAdminId) {
	 * this.userAdminRatingsDetailsesForAdminId =
	 * userAdminRatingsDetailsesForAdminId; }
	 * 
	 * public Set getUserEducationDetailses() { return this.userEducationDetailses;
	 * }
	 * 
	 * public void setUserEducationDetailses(Set userEducationDetailses) {
	 * this.userEducationDetailses = userEducationDetailses; }
	 * 
	 * public Set getUserPaymentDetailses() { return this.userPaymentDetailses; }
	 * 
	 * public void setUserPaymentDetailses(Set userPaymentDetailses) {
	 * this.userPaymentDetailses = userPaymentDetailses; }
	 * 
	 * public Set getUserSkillsDetailses() { return this.userSkillsDetailses; }
	 * 
	 * public void setUserSkillsDetailses(Set userSkillsDetailses) {
	 * this.userSkillsDetailses = userSkillsDetailses; }
	 * 
	 * public Set getProjectPaymentsDetailses() { return
	 * this.projectPaymentsDetailses; }
	 * 
	 * public void setProjectPaymentsDetailses(Set projectPaymentsDetailses) {
	 * this.projectPaymentsDetailses = projectPaymentsDetailses; }
	 * 
	 * public Set getProjectDetailses() { return this.projectDetailses; }
	 * 
	 * public void setProjectDetailses(Set projectDetailses) { this.projectDetailses
	 * = projectDetailses; }
	 * 
	 * public Set getProjectBiddingStatuses() { return this.projectBiddingStatuses;
	 * }
	 * 
	 * public void setProjectBiddingStatuses(Set projectBiddingStatuses) {
	 * this.projectBiddingStatuses = projectBiddingStatuses; }
	 * 
	 * public Set getUserAdminRatingsDetailsesForUserId() { return
	 * this.userAdminRatingsDetailsesForUserId; }
	 * 
	 * public void setUserAdminRatingsDetailsesForUserId(Set
	 * userAdminRatingsDetailsesForUserId) { this.userAdminRatingsDetailsesForUserId
	 * = userAdminRatingsDetailsesForUserId; }
	 */

}
