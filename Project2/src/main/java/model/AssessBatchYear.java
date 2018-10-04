package model;

import java.util.ArrayList;

public class AssessBatchYear {
	private int id;
	private String name;
	private ArrayList<AssessBatchTrainer> trainers;
	public AssessBatchYear(int id, String name, ArrayList<AssessBatchTrainer> trainers) {
		super();
		this.id = id;
		this.name = name;
		this.trainers = trainers;
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
	public ArrayList<AssessBatchTrainer> getTrainers() {
		return trainers;
	}
	public void setTrainers(ArrayList<AssessBatchTrainer> trainers) {
		this.trainers = trainers;
	}

	
}
