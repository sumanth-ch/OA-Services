package com.test.springmvc;

public class DashBoardSummary {
	
	private String allProperties;
	
	private String pendingProperties;
	
	private String expiringProperties;
	
	private String expiredPropeties;

	public String getAllProperties() {
		return allProperties;
	}

	public void setAllProperties(String allProperties) {
		this.allProperties = allProperties;
	}

	public String getPendingProperties() {
		return pendingProperties;
	}

	public void setPendingProperties(String pendingProperties) {
		this.pendingProperties = pendingProperties;
	}

	public String getExpiringProperties() {
		return expiringProperties;
	}

	public void setExpiringProperties(String expiringProperties) {
		this.expiringProperties = expiringProperties;
	}

	public String getExpiredPropeties() {
		return expiredPropeties;
	}

	public void setExpiredPropeties(String expiredPropeties) {
		this.expiredPropeties = expiredPropeties;
	}
	
}
