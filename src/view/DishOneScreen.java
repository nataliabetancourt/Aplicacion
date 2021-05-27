package view;

//import controlP5.CheckBox;
//import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishOneScreen extends Dish{
	
	private PApplet app;
	
	private PImage pasta, pastaSmall;
	
	private String productName;
	
	private float total, basicPrice, extra1Price, extra2Price, extra3Price;
	
	
	public DishOneScreen(PApplet app) {
			super(app);
			
			this.app = app;
			
			pasta = app.loadImage("./data/images/pasta.jpg");
			
			basicPrice = controller.getLogic().getPasta().getPrice();
			extra1Price = controller.getLogic().getPasta().getExtra1();
			extra2Price = controller.getLogic().getPasta().getExtra2();
			extra3Price = controller.getLogic().getPasta().getExtra3();
			total = basicPrice;
			
			productName = controller.getLogic().getPasta().getName();
			
	}

	public void drawpasta() {
		app.image(pasta, 0, 0, 323, 700);
		
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
