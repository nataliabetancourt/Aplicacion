package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class UserScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage user;


	public UserScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		user = app.loadImage("./data/Home.jpg");
		
	}

}
