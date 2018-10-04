package model;

import java.util.ArrayList;

public class QualityAuditYear {
	private String year;
	private ArrayList<QualityAuditTrainer> trainers;
	public QualityAuditYear(String year, ArrayList<QualityAuditTrainer> trainers) {
		super();
		this.year = year;
		this.trainers = trainers;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public ArrayList<QualityAuditTrainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(ArrayList<QualityAuditTrainer> trainers) {
		this.trainers = trainers;
	}
	
}
