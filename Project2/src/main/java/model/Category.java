package model;

public class Category {
	private String name;
	private String active;
	public Category(String name, String active) {
		super();
		this.name = name;
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	
}
