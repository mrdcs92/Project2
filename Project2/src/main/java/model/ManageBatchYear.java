package model;

import java.util.ArrayList;

public class ManageBatchYear {
	private String year;
	private ArrayList<Batch> batches;
	public ManageBatchYear(String year, ArrayList<Batch> batches) {
		super();
		this.year = year;
		this.batches = batches;
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
