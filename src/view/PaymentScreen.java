package view;


import java.text.SimpleDateFormat;
import java.util.Date;

import controller.PaymentController;
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
	private String dateProduct;
	private PaymentController controller;

	public PaymentScreen(PApplet app) {
		this.app = app;
	
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		dateProduct = simpleDateFormat.format(new Date());
		
		controller = new PaymentController(app);
		
		
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

		
		app.image(feedback, 43, 582, 236, 40);
		
	}
	
	public void receiveInfo(float total, String name) {
		
		this.total = total;
		
		if (name.equals("pasta")) {
			
			controller.getLogic().getPasta().setDate(dateProduct);
			controller.getLogic().getPasta().setPrice(total);
			
			product = app.loadImage("./data/images/pastaSmall.jpg");
		}
		
		if (name.equals("pizza")) {
			
			controller.getLogic().getPizza().setDate(dateProduct);
			controller.getLogic().getPizza().setPrice(total);
			
			product = app.loadImage("./data/images/pizzaSmall.jpg");
		}
		
		if (name.equals("ravioli")) {
			
			controller.getLogic().getRavioli().setDate(dateProduct);
			controller.getLogic().getRavioli().setPrice(total);
			
			product = app.loadImage("./data/images/ravioliSmall.jpg");
		}
		
		if (name.equals("cannolis")) {
			
			controller.getLogic().getCannolis().setDate(dateProduct);
			controller.getLogic().getCannolis().setPrice(total);
			
			product = app.loadImage("./data/images/cannolisSmall.jpg");
		}

	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getDateProduct() {
		return dateProduct;
	}

	public void setDateProduct(String dateProduct) {
		this.dateProduct = dateProduct;
	}
	
	

}
