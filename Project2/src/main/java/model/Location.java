package model;

public class Location {
	private String activeStatus;
	private String company;
	private String address;
	public Location(String activeStatus, String company, String address) {
		super();
		this.activeStatus = activeStatus;
		this.company = company;
		this.address = address;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
