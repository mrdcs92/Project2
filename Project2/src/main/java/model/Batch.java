package model;

public class Batch {
	private String trainingName;
	private String triningType;
	private String skillType;
	private String trainer;
	private String coTrainer = null;
	private String location;
	private String startDate;
	private String endDate;
	private int goodGrade;
	private int passingGrade;
	public Batch(String trainingName, String triningType, String skillType, String trainer, String coTrainer,
			String location, String startDate, String endDate, int goodGrade, int passingGrade) {
		super();
		this.trainingName = trainingName;
		this.triningType = triningType;
		this.skillType = skillType;
		this.trainer = trainer;
		this.coTrainer = coTrainer;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.goodGrade = goodGrade;
		this.passingGrade = passingGrade;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTriningType() {
		return triningType;
	}
	public void setTriningType(String triningType) {
		this.triningType = triningType;
	}
	public String getSkillType() {
		return skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getCoTrainer() {
		return coTrainer;
	}
	public void setCoTrainer(String coTrainer) {
		this.coTrainer = coTrainer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getGoodGrade() {
		return goodGrade;
	}
	public void setGoodGrade(int goodGrade) {
		this.goodGrade = goodGrade;
	}
	public int getPassingGrade() {
		return passingGrade;
	}
	public void setPassingGrade(int passingGrade) {
		this.passingGrade = passingGrade;
	}
	
}
