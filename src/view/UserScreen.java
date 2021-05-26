package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class UserScreen {
	
	private PApplet app;
	private PImage user;


	public UserScreen(PApplet app) {
		this.app = app;
		
		//Image
		user = app.loadImage("./data/images/user.jpg");
		
	}

	public void draw() {
		app.image(user, 0, 0, 323, 700);
	}
}
