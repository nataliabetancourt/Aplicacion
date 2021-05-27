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
		pasta = new Pasta (app, "pasta", dateProduct, 25.00, 2.00, 6.00, 2.25);
		pizza = new Pizza (app, "pizza", dateProduct, 45.00, 2.00, 6.00, 2.25);
		ravioli = new Ravioli(app, "ravioli", dateProduct, 28.00, 2.00, 6.00, 2.25);
		cannolis = new Cannolis(app, "cannolis", dateProduct, 18.00, 3.00, 3.00, 2.15);	
	}

	public Product getPasta() {
		return pasta;
	}
	
	public Product getPizza() {
		return pizza;
	}
	
	public Product getRavioli() {
		return ravioli;
	}
	
	public Product getCannolis() {
		return cannolis;
	}
	
	
	
}
