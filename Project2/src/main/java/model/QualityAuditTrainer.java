package model;

import java.util.ArrayList;

public class QualityAuditTrainer {
	private String name;
	private ArrayList<QualityAuditWeek> weeks;
	public QualityAuditTrainer(String name, ArrayList<QualityAuditWeek> weeks) {
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
	public ArrayList<QualityAuditWeek> getWeeks() {
		return weeks;
	}
	public void setWeeks(ArrayList<QualityAuditWeek> weeks) {
		this.weeks = weeks;
	}
	
}
