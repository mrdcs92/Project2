package model;

import java.util.ArrayList;

public class QualityAuditWeek {
	private int id;
	private String name;
	private ArrayList<QualityAuditTrainee> trainees;
	private String categoriesCovered = null;
	private String overallFeedBack;
	private String overallNotes;
	public QualityAuditWeek(int id, String name, ArrayList<QualityAuditTrainee> trainees, String categoriesCovered,
			String overallFeedBack, String overallNotes) {
		super();
		this.id = id;
		this.name = name;
		this.trainees = trainees;
		this.categoriesCovered = categoriesCovered;
		this.overallFeedBack = overallFeedBack;
		this.overallNotes = overallNotes;
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
	public ArrayList<QualityAuditTrainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(ArrayList<QualityAuditTrainee> trainees) {
		this.trainees = trainees;
	}
	public String getCategoriesCovered() {
		return categoriesCovered;
	}
	public void setCategoriesCovered(String categoriesCovered) {
		this.categoriesCovered = categoriesCovered;
	}
	public String getOverallFeedBack() {
		return overallFeedBack;
	}
	public void setOverallFeedBack(String overallFeedBack) {
		this.overallFeedBack = overallFeedBack;
	}
	public String getOverallNotes() {
		return overallNotes;
	}
	public void setOverallNotes(String overallNotes) {
		this.overallNotes = overallNotes;
	}
	
}
