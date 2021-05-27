package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishFourScreen extends Dish{

	private PApplet app;
	private PImage CANNOLIS;
	
	private String productName;

	private float total, basicPrice, extra1Price, extra2Price, extra3Price;

	public DishFourScreen(PApplet app) {
			super(app);
			
			this.app = app;
			//Image
			CANNOLIS = app.loadImage("./data/images/CANNOLIS.png");
			
			basicPrice = controller.getLogic().getCannolis().getPrice();
			extra1Price = controller.getLogic().getCannolis().getExtra1();
			extra2Price = controller.getLogic().getCannolis().getExtra2();
			extra3Price = controller.getLogic().getCannolis().getExtra3();
			total = basicPrice;
			
			productName = controller.getLogic().getCannolis().getName();
		
			
	}
	
	public void drawCannolis() {
		app.image(CANNOLIS, 0, 0, 323, 700);
		
		app.textFont(font);
		app.text(total, 40, 665);
}
	
	public void totalPrice(int extra) {		
		switch (extra) {
		case 1:
			total = basicPrice+extra1Price;
			break;
		case 2:
			total = basicPrice+extra2Price;
			break;
		case 3:
			total = basicPrice+extra3Price;
			break;
			
		}
	}
	
	public float getTotal() {
		return total;
	}
	
	public String getProductName() {
		return productName;
	}

}
