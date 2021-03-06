package com.pat.bnb.entity;
// Generated Apr 15, 2019 2:53:16 PM by Hibernate Tools 5.4.2.Final

/**
 * UserSecondaryAreaOfExpertiseId generated by hbm2java
 */
public class UserSecondaryAreaOfExpertiseId implements java.io.Serializable {

	private int userId;
	private Integer secondaryExprtId;

	public UserSecondaryAreaOfExpertiseId() {
	}

	public UserSecondaryAreaOfExpertiseId(int userId) {
		this.userId = userId;
	}

	public UserSecondaryAreaOfExpertiseId(int userId, Integer secondaryExprtId) {
		this.userId = userId;
		this.secondaryExprtId = secondaryExprtId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Integer getSecondaryExprtId() {
		return this.secondaryExprtId;
	}

	public void setSecondaryExprtId(Integer secondaryExprtId) {
		this.secondaryExprtId = secondaryExprtId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserSecondaryAreaOfExpertiseId))
			return false;
		UserSecondaryAreaOfExpertiseId castOther = (UserSecondaryAreaOfExpertiseId) other;

		return (this.getUserId() == castOther.getUserId())
				&& ((this.getSecondaryExprtId() == castOther.getSecondaryExprtId())
						|| (this.getSecondaryExprtId() != null && castOther.getSecondaryExprtId() != null
								&& this.getSecondaryExprtId().equals(castOther.getSecondaryExprtId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + (getSecondaryExprtId() == null ? 0 : this.getSecondaryExprtId().hashCode());
		return result;
	}

}
