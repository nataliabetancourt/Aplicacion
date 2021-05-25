package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class LoginScreen {

	private PApplet app;
	private ControlP5 cp5;
	private PImage login;
	private PFont font;

	public LoginScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;

		// Image
		login = app.loadImage("./data/images/login.jpg");
		
		//Fonts
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);
		
		textBoxes();
		
	}

	public void draw() {
		app.image(login, 0, 0, 323, 700);
		app.textFont(font);
		//app.text(cp5.get(Textfield.class, "username").getText(), 248, 35);
	}
	
	public void textBoxes() {
		//Username box
		createTextBox("username", 43, 309);
		//Password box
		createTextBox("password", 43, 410);

	}
	
	public void createTextBox(String name, int x, int y) {
		cp5.addTextfield(name)
		.setPosition(x, y)
		.setSize(248, 35)
		.setFont(font)
		.setAutoClear(true)
		.setColor(100)
		.setColorActive(app.color(255, 0, 0, 1))
		.setColorBackground(app.color(255, 255, 255, 1))
		.setColorForeground(app.color(255, 0, 0, 1))
		.getCaptionLabel()
		.hide();
	}
	
}
