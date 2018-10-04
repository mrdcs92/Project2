package model;

import java.util.ArrayList;

public class AssessBatchTrainer {
	private String name;
	private ArrayList<AssessBatchWeek> weeks;
	public AssessBatchTrainer(String name, ArrayList<AssessBatchWeek> weeks) {
		super();
		this.name = name;
		this.weeks = weeks;
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
