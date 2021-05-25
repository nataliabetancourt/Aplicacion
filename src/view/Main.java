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
	
	
	
	
	
	//Signup
	
	
	
	
	//Pizza
	
	
	
	
	//Pasta
	
	
	
	
	//Ravioli
	private DishThreeScreen ravioli;
	
	
	
	
	//Cannolis
	private DishFourScreen cannolis;
	
	
	
	
	//Payscreen
	private PaymentScreen payment;
	
	
	
	
	
	//Feedback
	private FeedbackScreen feedback;
	
	
	
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
		
		
		
		
		ravioli = new DishThreeScreen(this);
		cannolis = new DishFourScreen(this);
		payment = new PaymentScreen(this);
		feedback = new FeedbackScreen(this);
		
		
		
		
		
		
		
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
			
			
			
			
			
			
			break;
		//Sign up screen
		case 2:
			
			
			
			
			
			break;
		//Home screen
		case 3:
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
			ravioli.drawRavioli();
			
			
			
			
			
			
			break;
		//Dish four screen - CANNOLIS
		case 7:
			cannolis.drawCannolis();
			
			
			
			
			
			
			break;
		//Payment screen
		case 8:
			payment.drawPayment();
			
			
			
			
			
			
			break;
		//Feedback screen
		case 9:
			feedback.drawFeedback();
			
			
			
			
			
			
			break;
		//User screen
		case 10:
			
			
			
			
			
			
			break;
		}
		System.out.println(mouseX + "," + mouseY);
	}
	
	public void mousePressed() {
		
		//Screens
		switch (screen) {
		//Intro screen
		case 0:
			createButton(0, 323, 0, 700, 3);
			break;
		//Login screen
		case 1:
			
			
			
			
			
			
			
			break;
		//Sign up screen
		case 2:
			
			
			
			
			
			
			
			
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
		createButton(16,39,36,57,3);	
		createButton(179,288,640,665,8);	
			
			
			
			
			
			
			break;
		//Dish four screen - CANNOLIS
		case 7:
		createButton(16,39,36,57,3);	
		createButton(179,288,640,665,8);	
			
			
			
			
			
			
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

