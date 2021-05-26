package controller;

import model.Logic;
import processing.core.PApplet;

public class DishController {
	
	private PApplet app;
	private Logic logic;

	public DishController(PApplet app) {
		this.app = app;
		
		logic = new Logic(app);
	}
	
	public Logic getLogic() {
		return logic;
	}

}
