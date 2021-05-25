package view;

import processing.core.PApplet;
import processing.core.PImage;

public class IntroScreen {
	
	private PApplet app;
	private PImage intro;

	public IntroScreen(PApplet app) {
		this.app = app;
		
		//Image
		intro = app.loadImage("./data/images//Intro.jpg");
		
	}
	
	public void draw() {
		app.image(intro, 0, 0, 323, 700);
	}
	
	public void clickScreen(int screen) {
		if (app.mouseX > 0 && app.mouseX < 323 && app.mouseY > 0 && app.mouseY < 700 && screen == 0) {
			screen = 3;
			System.out.println("click");
		}
	}
	
}
