package model;

import java.util.ArrayList;

public class QualityAuditYear {
	private int id;
	private String year;
	private ArrayList<QualityAuditTrainer> trainers;
	public QualityAuditYear(int id, String year, ArrayList<QualityAuditTrainer> trainers) {
		super();
		this.id = id;
		this.year = year;
		this.trainers = trainers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
