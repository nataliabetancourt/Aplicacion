package model;

import java.util.Date;

import processing.core.PApplet;

public class Logic {
	
	private PApplet app;
	private Product pasta, pizza, ravioli, cannolis;
	private String dateProduct, pastaImg, pizzaImg, ravioliImg, cannolisImg;

	public Logic(PApplet app) {
		this.app = app;
		
		Date date = new Date();
		
		//Variables for products
		dateProduct = date.toString();
		pastaImg = "./data/images/pastaSmall.jpg";
		pizzaImg = "./data/images/pastaSmall.jpg";
		ravioliImg = "./data/images/pastaSmall.jpg";
		cannolisImg = "./data/images/pastaSmall.jpg";
		
		//Classes
		pasta = new Pasta(app, "pasta", dateProduct, 25.00, 2.00, 6.00, 2.25, pastaImg);
	}

	public Product getPasta() {
		return pasta;
	}
	
}
