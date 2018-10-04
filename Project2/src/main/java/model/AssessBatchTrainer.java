package model;

import java.util.ArrayList;

public class AssessBatchTrainer {
	private int id;
	private String name;
	private ArrayList<AssessBatchWeek> weeks;
	public AssessBatchTrainer(int id, String name, ArrayList<AssessBatchWeek> weeks) {
		super();
		this.id = id;
		this.name = name;
		this.weeks = weeks;
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
	public ArrayList<AssessBatchWeek> getWeeks() {
		return weeks;
	}
	public void setWeeks(ArrayList<AssessBatchWeek> weeks) {
		this.weeks = weeks;
	}

}
