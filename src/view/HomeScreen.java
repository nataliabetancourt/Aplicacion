package view;

import processing.core.PApplet;
import processing.core.PImage;

public class HomeScreen {
	
	private PApplet app;
	private PImage home;

	public HomeScreen(PApplet app) {
		this.app = app;
		
		//Image
		home = app.loadImage("./data/images/Home.jpg");
		
	}
	
	public void draw() {
		app.image(home, 0, 0, 323, 700);
	}
	
}
