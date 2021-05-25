package view;

import controlP5.Button;
import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;

public class Main extends PApplet{
	
	//Libraries
	private ControlP5 cp5;
	private CheckBox checkbox;
	
	//View classes
	private HomeScreen home;
	private IntroScreen intro;
	
	//Controllers
	
	
	//Variables
	private int screen;

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	
	@Override
	public void settings() {
		size(323, 700);
		
	}
	
	@Override
	public void setup() {
		
		//Libraries
		cp5 = new ControlP5(this);
		
		//View screens
		intro = new IntroScreen(this);
		home = new HomeScreen(this, cp5);
		
		//Controllers
		
		
		//Variables
		screen = 0;
	
	}
	
	@Override
	public void draw() {
		
		//Screens
		switch (screen) {
		//Intro screen
		case 0:
			intro.draw();
			break;
		//Login screen
		case 1:
			
			break;
		//Sign up screen
		case 2:
			
			break;
		//Home screen
		case 3:
			home.draw();
			break;
		//Dish one screen
		case 4:
			
			break;
		//Dish two screen
		case 5:
			
			break;
		//Dish three screen
		case 6:
			
			break;
		//Dish four screen
		case 7:
			
			break;
		//Payment screen
		case 8:
			
			break;
		//Feedback screen
		case 9:
			
			break;
		//User screen
		case 10:
			
			break;
		}
		
	}
	
	public void mousePressed() {

	}

}
