package view;

import java.awt.Checkbox;

import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class PaymentScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private Checkbox checkbox;
	private PImage payment;

	public PaymentScreen(PApplet app, ControlP5 cp5, CheckBox checkbox2) {
		this.app = app;
		this.cp5 = cp5;
		
		//Image
		payment = app.loadImage("./data/images/PAY SCREEN.png");
	}
	
	public void drawPayment() {
		app.image(payment, 0, 0, 323, 700);
}

}
