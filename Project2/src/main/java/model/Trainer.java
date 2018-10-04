package model;

public class Trainer {
	private String name;
	private String email;
	private String title;
	private String tier;
	public Trainer(String name, String email, String title, String tier) {
		super();
		this.name = name;
		this.email = email;
		this.title = title;
		this.tier = tier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	
}
