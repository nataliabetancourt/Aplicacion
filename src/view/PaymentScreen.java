package view;


import processing.core.PApplet;
import processing.core.PImage;

public class PaymentScreen {
	
	private PApplet app;
	private PImage payment;

	public PaymentScreen(PApplet app) {
		this.app = app;
	
		
		//Image
		payment = app.loadImage("./data/images/PAY SCREEN.png");
	}
	
	public void drawPayment() {
		app.image(payment, 0, 0, 323, 700);
}

}
