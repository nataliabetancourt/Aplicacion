package view;

import controlP5.ControlP5;
import processing.core.PApplet;

public class Main extends PApplet{
	
	//Libraries
	private ControlP5 cp5;
	
	//View classes
	private HomeScreen home;
	private IntroScreen intro;
	//Login
	private LoginScreen login;
	
	
	
	
	//Signup
	private SignUpScreen signup;
	
	
	
	//Pizza
	private DishTwoScreen pizza;
	
	
	
	//Pasta
	private DishOneScreen pasta;
	
	
	
	//Ravioli
	private DishThreeScreen ravioli;
	
	
	
	
	//Cannolis
	private DishFourScreen cannolis;
	
	
	
	
	//Payscreen
	private PaymentScreen payment;
	
	
	
	
	
	//Feedback
	private FeedbackScreen feedback;
	
	
	
	//User
	private UserScreen user;
	
	
	
	

	
	//Controllers
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Variables
	private int screen;
    private int click;
	private String username, password;
	
	
	
	
	
	
	
	
	
	
	
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
		pasta = new DishOneScreen(this);
		pizza = new DishTwoScreen(this);
		ravioli = new DishThreeScreen(this);
		cannolis = new DishFourScreen(this);
		payment = new PaymentScreen(this);
		feedback = new FeedbackScreen(this);
		user = new UserScreen(this);
		
		
		
		
		
		
		//Controllers
		
		
		
		
		
		
		
		
		
		
		//Variables
		screen = 0;
		click = 0;

		
		
	
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
			home.draw();
			break;
		//Dish one screen - PASTA
		case 4:
			pasta.draw();
			
			
			
			
			
			break;
		//Dish two screen - PIZZA
		case 5:
			pizza.draw();
			
			
			
			
			
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
			user.draw();
			
			
			
			
			
			break;
		}
		System.out.println(mouseX + "," + mouseY);
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
			login.showText();
			if (login.isBoxesFilled()) {
				for (int i = 0; i <signup.getController().getUsers().size(); i++) {
					username = signup.getController().getUsers().get(i).getUsername();
					password = signup.getController().getUsers().get(i).getPassword();
					login.validateLogin(username, password);
				}
				if (login.isMatchPassword()) {
					if (mouseX > 96 && mouseX < 221 && mouseY > 505 && mouseY < 545) {
						home.getUsername(username);
						screen = 3;
						login.hideText();
					}
				}
			}
			
			//Sign up button - goes to sign up
			if (mouseX > 114 && mouseX < 207 && mouseY > 624 && mouseY < 650) {
				screen = 2;
				login.hideText();
			}

			break;
			
		//Sign up screen
		case 2:
			signup.showText();
			if (signup.isBoxesFilled()) {
				if (mouseX > 100 && mouseX < 225 && mouseY > 578 && mouseY < 617) {
					signup.addUser();
					screen = 1;
					signup.hideText();
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
		createButton(16,39,36,57,3); //back
		createButton(179,288,640,665,8); //checkout	
		click=3;	
			
			
			
			
			
			break;
		//Dish four screen - CANNOLIS
		case 7:
		createButton(16,39,36,57,3); //back	
		createButton(179,288,640,665,8); //checkout	
		click=4;	
			
			
			
			
			
			break;
		//Payment screen
		case 8:
		if (click == 3) {
			createButton(16,39,36,57,6); //back		
		}	
			
		if (click == 4) {	
			createButton(16,39,36,57,7); //back	
		}	
			
		createButton(99,222,636,671,9); //finish	
			break;
		//Feedback screen
		case 9:
		createButton(16,39,36,57,8); //back
		createButton(157,279,639,673,10); //history (user screen)	
			
			
			
			
			
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

