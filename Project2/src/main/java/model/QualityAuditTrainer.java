package model;

import java.util.ArrayList;

public class QualityAuditTrainer {
	private int id;
	private String name;
	private ArrayList<QualityAuditWeek> weeks;
	public QualityAuditTrainer(int id, String name, ArrayList<QualityAuditWeek> weeks) {
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
	public ArrayList<QualityAuditWeek> getWeeks() {
		return weeks;
	}
	public void setWeeks(ArrayList<QualityAuditWeek> weeks) {
		this.weeks = weeks;
	}

}
