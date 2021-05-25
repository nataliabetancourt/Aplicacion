package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class SignUpScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage signup;
	private PFont font;

	public SignUpScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		signup = app.loadImage("./data/images/signup.jpg");
		
		//Fonts
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);

		textBoxes();
		
	}
	
	public void draw() {
		app.image(signup, 0, 0, 323, 700);
	}

	public void textBoxes() {
		//Username box
		createTextBox("usernameNew", 43, 268);
		//Password box
		createTextBox("passwordNew", 43, 345);
		//Phone number
		createTextBox("number", 43, 425);
		//Email
		createTextBox("email", 37, 501);

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
	
	public void hideText() {
		cp5.get(Textfield.class, "usernameNew").hide();
		cp5.get(Textfield.class, "passwordNew").hide();
		cp5.get(Textfield.class, "number").hide();
		cp5.get(Textfield.class, "email").hide();
	}
	
}
