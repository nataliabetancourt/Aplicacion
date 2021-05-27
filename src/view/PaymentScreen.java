package view;


import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class PaymentScreen {
	
	private PApplet app;
	private PImage payment;
	private PImage feedback;
	private PImage product;
	private PFont font;
	private float total;

	public PaymentScreen(PApplet app) {
		this.app = app;
	
		//Image
		payment = app.loadImage("./data/images/payscreen.jpg");
		feedback = app.loadImage("./data/images/feedbackSign.png");
		
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 14);
		
	}
	
	public void drawPayment() {
		app.image(payment, 0, 0, 323, 700);
		app.image(product, 50, 175, 226, 112);
		app.textFont(font);
		app.text(total, 248, 325);
		
}
	public void drawF() {
		
		app.image(feedback, 43, 582);
		
	}
	
	public void receiveInfo(float total, String name) {
		this.total = total;
		
		if (name.equals("pasta")) {
			product = app.loadImage("./data/images/pastaSmall.jpg");
		}
		
		if (name.equals("pizza")) {
			product = app.loadImage("./data/images/pizzaSmall.jpg");
		}
		
		if (name.equals("ravioli")) {
			product = app.loadImage("./data/images/ravioliSmall.jpg");
		}
		
		if (name.equals("cannolis")) {
			product = app.loadImage("./data/images/cannolisSmall.jpg");
		}

	}

}
