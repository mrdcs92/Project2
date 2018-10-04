package model;

public class TraineePanel {
	private int id;
	private String traineeName;
	private String date;
	private String panelist;
	private String panelSatus;
	private String repeatTopics;
	public TraineePanel(int id, String traineeName, String date, String panelist, String panelSatus,
			String repeatTopics) {
		super();
		this.id = id;
		this.traineeName = traineeName;
		this.date = date;
		this.panelist = panelist;
		this.panelSatus = panelSatus;
		this.repeatTopics = repeatTopics;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPanelist() {
		return panelist;
	}
	public void setPanelist(String panelist) {
		this.panelist = panelist;
	}
	public String getPanelSatus() {
		return panelSatus;
	}
	public void setPanelSatus(String panelSatus) {
		this.panelSatus = panelSatus;
	}
	public String getRepeatTopics() {
		return repeatTopics;
	}
	public void setRepeatTopics(String repeatTopics) {
		this.repeatTopics = repeatTopics;
	}
	
}
