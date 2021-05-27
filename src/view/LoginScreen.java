package view;

import java.util.ArrayList;

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
	private boolean box1, box2, boxesFilled, matchUsername, matchPassword, matchUser;
	private String noFill;

	public LoginScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;

		// Image
		login = app.loadImage("./data/images/LOG IN SCREEN.jpg");
		
		//Fonts
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);
		
		//Variables 
		box1 = true;							matchUsername = false;
		box2 = true;							matchPassword = false;
		boxesFilled = false;				matchUser = false;
		noFill = "";
		
		textBoxes();
		
	}

	public void draw() {
		app.image(login, 0, 0, 323, 700);
		
		fillConfirmation();
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
	
	public void hideText() {
		cp5.get(Textfield.class, "username").hide();
		cp5.get(Textfield.class, "password").hide();
		cp5.get(Textfield.class, "username").clear();
		cp5.get(Textfield.class, "password").clear();
	}
	
	public void showText() {
		cp5.get(Textfield.class, "username").show();
		cp5.get(Textfield.class, "password").show();
	}
	
	public void fillConfirmation() {
		box1 = (!noFill.equals(cp5.get(Textfield.class, "username").getText()));
		box2 = (!noFill.equals(cp5.get(Textfield.class, "password").getText()));
		
		if (box1 && box2) {
			boxesFilled = true;
		}
	}
	
	public void validateLogin(String user, String password) {
		matchUsername = user.equals(cp5.get(Textfield.class, "username").getText());
		matchPassword = password.equals(cp5.get(Textfield.class, "password").getText());
		
		if (matchUsername && matchPassword) {
			matchUser = true;
		}

	}
	
	public boolean isBoxesFilled() {
		return boxesFilled;
	}
	
	public boolean isMatchPassword() {
		return matchPassword;
	}
}
