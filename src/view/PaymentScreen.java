package view;

import java.awt.Checkbox;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class PaymentScreen {
	
	private PApplet app;
	private ControlP5 cp5;
	private Checkbox checkbox;
	private PImage payment;

	public PaymentScreen(PApplet app, ControlP5 cp5, Checkbox checkbox) {
		this.app = app;
		this.cp5 = cp5;
		this.checkbox = checkbox;
		
		//Image
		payment = app.loadImage("./data/Home.jpg");
	}

}
