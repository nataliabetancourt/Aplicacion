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
	//Login
	private LoginScreen login;
	
	
	
	
	//Signup
	private SignUpScreen signup;
	
	
	
	//Pizza
	
	
	
	
	//Pasta
	
	
	
	
	//Ravioli
	
	
	
	
	
	//Cannolis
	
	
	
	
	
	//Payscreen
	
	
	
	
	
	
	//Feedback
	
	
	
	
	//User
	
	
	
	
	

	
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
		home = new HomeScreen(this);
		login = new LoginScreen(this, cp5);
		signup = new SignUpScreen(this, cp5);
		
		
		
		
		
		
		
		
		//Controllers
		
		
		
		
		
		
		
		
		
		
		//Variables
		screen = 0;
		
		
		
	
	}
	
	@Override
	public void draw() {
		background(255);

		//Screens
		switch (screen) {
		//Intro screen
		case 0:
			intro.draw();
			
			
			
			
			break;
		//Login screen
		case 1:
			login.draw();
			
			
			
			
			
			break;
		//Sign up screen
		case 2:
			signup.draw();
			
			
			
			
			break;
		//Home screen
		case 3:
			login.hideText();
			home.draw();
			break;
		//Dish one screen - PASTA
		case 4:
			
			
			
			
			
			
			break;
		//Dish two screen - PIZZA
		case 5:
			
			
			
			
			
			
			break;
		//Dish three screen - RAVIOLI
		case 6:
			
			
			
			
			
			
			
			break;
		//Dish four screen - CANNOLIS
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
		
		//Screens
		switch (screen) {
		//Intro screen
		case 0:
			createButton(0, 323, 0, 700, 1);
			break;
		//Login screen
		case 1:
			//Login button - goes to home
			if (login.isBoxesFilled()) {
				for (int i = 0; i <signup.getController().getUsers().size(); i++) {
					String username = signup.getController().getUsers().get(i).getUsername();
					String password = signup.getController().getUsers().get(i).getPassword();
					login.validateLogin(username, password);
				}
				if (login.isMatchPassword()) {
					if (mouseX > 96 && mouseX < 221 && mouseY > 505 && mouseY < 545) {
						screen = 3;
					}
				}
			}
			//Signup button - goes to sign up
			createButton(114, 207, 624, 650, 2);
			

			
			
			
			break;
		//Sign up screen
		case 2:
			if (signup.isBoxesFilled()) {
				if (mouseX > 100 && mouseX < 225 && mouseY > 578 && mouseY < 617) {
					signup.addUser();
					screen = 1;
				}
			}
			
			
			
			
			
			
			
			break;
		//Home screen
		case 3:
			//User button
			createButton(20, 65, 45, 90, 10);
			//Pasta button
			createButton(27, 151, 273, 448, 4);
			//Pizza button
			createButton(170, 294, 273, 448, 5);
			//Ravioli button
			createButton(27, 151, 466, 641, 6);
			//Cannolis button
			createButton(170, 294, 466, 641, 7);
			break;
		//Dish one screen - PASTA
		case 4:
			
			
			
			
			
			
			
			
			
			
			break;
		//Dish two screen - PIZZA
		case 5:
			
			
			
			
			
			
			
			
			
			break;
		//Dish three screen - RAVIOLI
		case 6:
			
			
			
			
			
			
			
			
			break;
		//Dish four screen - CANNOLIS
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
	
	public void createButton(int x1, int x2, int y1, int y2, int screenNum) {
		if (mouseX > x1 && mouseX < x2 && mouseY > y1 && mouseY < y2) {
			screen = screenNum;
		}
	}

}

