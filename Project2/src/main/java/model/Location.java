package model;

public class Location {
	private int id;
	private String activeStatus;
	private String company;
	private String address;
	public Location(int id, String activeStatus, String company, String address) {
		super();
		this.id = id;
		this.activeStatus = activeStatus;
		this.company = company;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
