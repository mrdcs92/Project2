package model;

import java.util.ArrayList;

public class AssessBatchWeek {
	private int id;
	private String weekNumber;
	private ArrayList<AssessBatchTrainee> trainees;
	public AssessBatchWeek(int id, String weekNumber, ArrayList<AssessBatchTrainee> trainees) {
		super();
		this.id = id;
		this.weekNumber = weekNumber;
		this.trainees = trainees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
