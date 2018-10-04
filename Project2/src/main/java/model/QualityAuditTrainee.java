package model;

public class QualityAuditTrainee {
	private String name;
	private String comment;
	private String individualFeedback;
	private String notes;
	public QualityAuditTrainee(String name, String comment, String individualFeedback, String notes) {
		super();
		this.name = name;
		this.comment = comment;
		this.individualFeedback = individualFeedback;
		this.notes = notes;
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
	public String getIndividualFeedback() {
		return individualFeedback;
	}
	public void setIndividualFeedback(String individualFeedback) {
		this.individualFeedback = individualFeedback;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
