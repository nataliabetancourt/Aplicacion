package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import model.Product;
import model.ProductDate;
import model.ProductPrice;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class UserScreen {
	
	private PApplet app;
	private PImage user, products;
	private PFont font;
	private float total;
	private int productnum;
	
	private ArrayList<Product> productBought;
	
	private ProductDate productByDate;
	private ProductPrice productByPrice;

	public UserScreen(PApplet app) {
		
		this.app = app;
		
		productBought = new ArrayList<>();
		
		productByDate = new ProductDate();
		productByPrice = new ProductPrice();
		
		
		//Image
		user = app.loadImage("./data/images/user.jpg");
		
		font = app.createFont("./data/fonts/Poppins-Regular.ttf", 12);
		
	}

	public void draw() {
		
		app.image(user, 0, 0, 323, 700);
		
		for (int i = 0; i < productBought.size(); i++) { 
			
			int yTemp = 315;
			
			app.textFont(font);
			
			app.text(productBought.get(i).getName(), 37, (i * 20) + yTemp);
			
			app.text(productBought.get(i).getDate(), 122, (i * 20) + yTemp);
			
			app.text(productBought.get(i).getPrice(), 229, (i * 20) + yTemp);
		}
		
	}

	
	public void addProduct(int productNum, float total, String date) {
		
		this.productnum = productNum;
		
		switch (productNum) {
		case 1:
			productBought.add(new Product(app, "PASTA", date, total, 0, 0, 0));
			break;
		case 2:
			productBought.add(new Product(app, "PIZZA", date, total, 0, 0, 0));
			break;
		case 3:
			productBought.add(new Product(app, "RAVIOLI", date, total, 0, 0, 0));
			break;
		case 4:
			productBought.add(new Product(app, "CANNOLIS", date, total, 0, 0, 0));
			break;
		}

	}
	
	public void organizedTotal () {
		
		Collections.sort(productBought, productByPrice);
		
	}
	
	
	public void organizedDate() {
		
		Collections.sort(productBought, productByDate);

	}
	
}
