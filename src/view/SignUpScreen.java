package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class SignUpScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage signup;

	public SignUpScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		signup = app.loadImage("./data/Home.jpg");

	}

}
