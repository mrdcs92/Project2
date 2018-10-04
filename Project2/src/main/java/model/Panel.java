package model;

import java.util.ArrayList;

public class Panel {
	private ArrayList<TraineePanel> panels;

	public Panel(ArrayList<TraineePanel> panels) {
		super();
		this.panels = panels;
	}

	public ArrayList<TraineePanel> getPanels() {
		return panels;
	}

	public void setPanels(ArrayList<TraineePanel> panels) {
		this.panels = panels;
	}
	
}
