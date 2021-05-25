package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class FeedbackScreen {

	private PApplet app;
	private ControlP5 cp5;
	private PImage feedback;

	public FeedbackScreen(PApplet app, ControlP5 cp5, CheckBox checkbox3) {
		this.app = app;
		this.cp5 = cp5;

		// Image
		feedback = app.loadImage("./data/images/FEEDBACK SCREEN.png");
	}

	public void drawFeedback() {
		app.image(feedback, 0, 0, 323, 700);
	}

}
