package model;

public class Category {
	private int id;
	private String name;
	private String active;
	public Category(int id, String name, String active) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
