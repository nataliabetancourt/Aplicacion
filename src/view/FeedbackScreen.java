package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class FeedbackScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage feedback;

	public FeedbackScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		feedback = app.loadImage("./data/Home.jpg");
	}

}
