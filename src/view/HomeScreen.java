package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class HomeScreen {
	
	private PApplet app;
	private PImage home;
	private PFont fontBold;
	private String user;

	public HomeScreen(PApplet app) {
		this.app = app;
		
		//Image
		this.home = app.loadImage("./data/images/Home.jpg");
		
		//Font
		this.fontBold = app.createFont("./data/fonts/Poppins-SemiBold.ttf", 22);

	}
	
	public void draw() {
		app.image(home, 0, 0, 323, 700);
		
		//Username
		app.textFont(fontBold);
		app.text(user, 47, 166);
	}
	
	public void getUsername(String user) {
		this.user = user;
	}

	
}
