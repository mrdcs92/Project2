package model;

public class Assessment {
	private int id;
	private String assessmentCategory;
	private int maxPoints;
	private String assessmentType;
	public Assessment(int id, String assessmentCategory, int maxPoints, String assessmentType) {
		super();
		this.id = id;
		this.assessmentCategory = assessmentCategory;
		this.maxPoints = maxPoints;
		this.assessmentType = assessmentType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssessmentCategory() {
		return assessmentCategory;
	}
	public void setAssessmentCategory(String assessmentCategory) {
		this.assessmentCategory = assessmentCategory;
	}
	public int getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}
	public String getAssessmentType() {
		return assessmentType;
	}
	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}
	
}
