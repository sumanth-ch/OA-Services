package com.test.springmvc;

public class DashBoard {
	
	private boolean validUser;
	
	private UserProfile userDetails;
	
	private DashBoardSummary propertySummary;

	public boolean isValidUser() {
		return validUser;
	}

	public void setValidUser(boolean validUser) {
		this.validUser = validUser;
	}

	public UserProfile getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserProfile userDetails) {
		this.userDetails = userDetails;
	}

	public DashBoardSummary getPropertySummary() {
		return propertySummary;
	}

	public void setPropertySummary(DashBoardSummary propertySummary) {
		this.propertySummary = propertySummary;
	}
	
}
