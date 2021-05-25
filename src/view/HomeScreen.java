package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class HomeScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage home;

	public HomeScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		home = app.loadImage("./data/images/Home.jpg");
		
	}
	
	public void draw() {
		app.image(home, 0, 0, 323, 700);
	}

	
}
