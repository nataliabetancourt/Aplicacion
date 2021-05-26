package model;

import java.util.Date;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private Product pasta, pizza, ravioli, cannolis;
	private String dateProduct;

	public Logic(PApplet app) {
		this.app = app;
		
		Date date = new Date();
		
		//Variables for products
		dateProduct = date.toString();
		
		//Classes
		pasta = new Pasta(app, "pasta", dateProduct, 25.00, 2.00, 6.00, 2.25);
	}

	public Product getPasta() {
		return pasta;
	}
	
}
