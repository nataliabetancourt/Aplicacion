package view;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class UserScreen {
	
	private PApplet app;
	private PImage user, products;
	private PFont font;
	private float total;

	public UserScreen(PApplet app) {
		
		this.app = app;
		
		//Image
		user = app.loadImage("./data/images/user.jpg");
		
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);
		
	}

	public void draw() {
		
		app.image(user, 0, 0, 323, 700);
		
		app.image(products, 50, 296, 226, 112);
		
		//41, 392, 226, 112
		
	}

	
	public void receiveInfo(int productNum) {
		
		switch (productNum) {
		case 1:
			products = app.loadImage("./data/images/pastaSmall.jpg");
			break;
		case 2:
			products = app.loadImage("./data/images/pizzaSmall.jpg");
			break;
		case 3:
			products = app.loadImage("./data/images/ravioliSmall.jpg");
			break;
		case 4:
			products = app.loadImage("./data/images/cannolisSmall.jpg");
			break;
		}

	}
	
}
