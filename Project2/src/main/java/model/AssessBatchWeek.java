package model;

import java.util.ArrayList;

public class AssessBatchWeek {
	private String weekNumber;
	private ArrayList<AssessBatchTrainee> trainees;
	public AssessBatchWeek(String weekNumber, ArrayList<AssessBatchTrainee> trainees) {
		super();
		this.weekNumber = weekNumber;
		this.trainees = trainees;
	}
	public String getWeekNumber() {
		return weekNumber;
	}
	public void setWeekNumber(String weekNumber) {
		this.weekNumber = weekNumber;
	}
	public ArrayList<AssessBatchTrainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(ArrayList<AssessBatchTrainee> trainees) {
		this.trainees = trainees;
	}
}
