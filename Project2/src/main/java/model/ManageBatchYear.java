package model;

import java.util.ArrayList;

public class ManageBatchYear {
	private int id;
	private String year;
	private ArrayList<Batch> batches;
	public ManageBatchYear(int id, String year, ArrayList<Batch> batches) {
		super();
		this.id = id;
		this.year = year;
		this.batches = batches;
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
	public ArrayList<Batch> getBatches() {
		return batches;
	}
	public void setBatches(ArrayList<Batch> batches) {
		this.batches = batches;
	}

}
