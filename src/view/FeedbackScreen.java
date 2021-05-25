package view;


import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class FeedbackScreen {

	private PApplet app;
	private PImage feedback;

	public FeedbackScreen(PApplet app) {
		this.app = app;

		// Image
		feedback = app.loadImage("./data/images/FEEDBACK SCREEN.png");
	}

	public void drawFeedback() {
		app.image(feedback, 0, 0, 323, 700);
	}

}
