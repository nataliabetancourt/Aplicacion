package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.SignUpController;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class SignUpScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage signup;
	private PFont font;
	private SignUpController controller;
	private boolean box1, box2, box3, box4, boxesFilled;
	private String noFill;

	public SignUpScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		signup = app.loadImage("./data/images/signup.jpg");
		
		//Fonts
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);
		
		//Controller
		controller = new SignUpController(app);
		
		//Variables
		box1 = true;
		box2 = true;
		box3 = true;
		box4 = true;
		boxesFilled = false;
		noFill = "";

		textBoxes();
	
	}
	
	public void draw() {
		app.image(signup, 0, 0, 323, 700);
		
		fillConfirmation();
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
		//This hides the text when the screen changes
		cp5.get(Textfield.class, "usernameNew").hide();
		cp5.get(Textfield.class, "passwordNew").hide();
		cp5.get(Textfield.class, "number").hide();
		cp5.get(Textfield.class, "email").hide();
		
		//And then it erases it, in case the person returns to the screen
		cp5.get(Textfield.class, "usernameNew").clear();
		cp5.get(Textfield.class, "passwordNew").clear();
		cp5.get(Textfield.class, "number").clear();
		cp5.get(Textfield.class, "email").clear();
	}
	
	public void showText() {
		cp5.get(Textfield.class, "usernameNew").show();
		cp5.get(Textfield.class, "passwordNew").show();
		cp5.get(Textfield.class, "number").show();
		cp5.get(Textfield.class, "email").show();
	}
	
	public void addUser(){
		controller.addUser(cp5.get(Textfield.class, "usernameNew").getText(), 
									cp5.get(Textfield.class, "passwordNew").getText(), 
									cp5.get(Textfield.class, "email").getText(),
									cp5.get(Textfield.class, "number").getText());
	}
	
	public void fillConfirmation() {
		box1 = (!noFill.equals(cp5.get(Textfield.class, "usernameNew").getText()));
		box2 = (!noFill.equals(cp5.get(Textfield.class, "passwordNew").getText()));
		box3 = (!noFill.equals(cp5.get(Textfield.class, "email").getText()));
		box4 = (!noFill.equals(cp5.get(Textfield.class, "number").getText()));
		
		if (box1 && box2 && box3 && box4) {
			boxesFilled = true;
		}
	}
	
	public SignUpController getController() {
		return controller;
	}
	
	public boolean isBoxesFilled() {
		return boxesFilled;
	}
}
