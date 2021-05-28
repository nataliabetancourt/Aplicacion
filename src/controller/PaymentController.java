package controller;

import model.Logic;
import processing.core.PApplet;

public class PaymentController {
	
	private PApplet app;
	private Logic logic;
	
	public PaymentController(PApplet app) {
		this.app = app;
		
		logic = new Logic(app);
	}

	public Logic getLogic() {
		return logic;
	}
	
}
