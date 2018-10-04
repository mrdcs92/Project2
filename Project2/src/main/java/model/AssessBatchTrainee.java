package model;

import java.util.ArrayList;

public class AssessBatchTrainee {
	private int id;
	private String name;
	private String comment;
	private ArrayList<Assessment> assessments;
	private String notes;
	public AssessBatchTrainee(int id, String name, String comment, ArrayList<Assessment> assessments, String notes) {
		super();
		this.id = id;
		this.name = name;
		this.comment = comment;
		this.assessments = assessments;
		this.notes = notes;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public ArrayList<Assessment> getAssessments() {
		return assessments;
	}
	public void setAssessments(ArrayList<Assessment> assessments) {
		this.assessments = assessments;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
