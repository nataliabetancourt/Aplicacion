package view;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class LoginScreen {

	private PApplet app;
	private ControlP5 cp5;
	private PImage login;

	public LoginScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;

		// Image
		login = app.loadImage("./data/images/login.jpg");
	}

	public void draw() {
		app.image(login, 0, 0);
	}

}
