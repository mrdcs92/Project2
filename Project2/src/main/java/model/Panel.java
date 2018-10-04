package model;

import java.util.ArrayList;

public class Panel {
	private int id;
	private ArrayList<TraineePanel> panels;
	public Panel(int id, ArrayList<TraineePanel> panels) {
		super();
		this.id = id;
		this.panels = panels;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<TraineePanel> getPanels() {
		return panels;
	}
	public void setPanels(ArrayList<TraineePanel> panels) {
		this.panels = panels;
	}
	
}
