package com.learn.rest.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int userId;
	private String userName;
	private String passwd;
	@Column(name = "dob")
	private String dateOfBirth;
	private String personalMeetingId;
	private String personalMeetingIdLink;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getUserId() {
		return userId;
	}
	private void setPersonalMeetingId(String personalMeetingId) {
		this.personalMeetingId = personalMeetingId;
	}
	public String getPersonalMeetingId() {
		return personalMeetingId;
	}
	public String getPersonalMeetingIdLink() {
		return personalMeetingIdLink;
	}
	private void setPersonalMeetingIdLink(String personalMeetingIdLink) {
		this.personalMeetingIdLink = personalMeetingIdLink;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}

