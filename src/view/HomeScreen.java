package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class HomeScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private PImage home;

	public HomeScreen(PApplet app, ControlP5 cp5) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		home = app.loadImage("./data/images/Home.jpg");
		
		//Buttons
		createButtonsScreen();
	}
	
	//All the buttons that will be on the screen
	private void createButtonsScreen() {
		//Pasta button - Dish one
		createButton("pasta", 124, 175, 28, 274);
		
		//Pizza button - Dish two
		createButton("pizza", 124, 175, 171, 274);
		
		//Ravioli button - Dish three
		createButton("ravioli", 124, 175, 28, 466);
		
		//Cannolis button - Dish four
		createButton("cannolis", 124, 175, 171, 466);
		
		//User button
		createButton("user", 35, 35, 16, 35);

	}
	
	//Method to make the creation of the buttons shorter
	private void createButton(String nameButton, int width, int height, int posX, int posY) {
		cp5.addButton(nameButton)
		.setSize(width, height)
		.setPosition(posX, posY);
	}
	
	public void draw() {
		app.image(home, 0, 0, 323, 700);
	}

}
