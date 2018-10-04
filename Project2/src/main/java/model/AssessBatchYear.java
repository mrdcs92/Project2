package model;

import java.util.ArrayList;

public class AssessBatchYear {
	private String name;
	private ArrayList<AssessBatchTrainer> trainers;
	public AssessBatchYear(String name, ArrayList<AssessBatchTrainer> trainers) {
		super();
		this.name = name;
		this.trainers = trainers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<AssessBatchTrainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(ArrayList<AssessBatchTrainer> trainers) {
		this.trainers = trainers;
	}
	
}
