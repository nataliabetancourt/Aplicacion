package view;

//import controlP5.CheckBox;
//import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishTwoScreen extends Dish{

	private PApplet app;
	private PImage pizza;

	public DishTwoScreen(PApplet app) {
			super(app);
			
			pizza = app.loadImage("./data/images/DISH pizza.png");
			
	}
		
	public void draw() {
		
		app.image(pizza, 0, 0, 323, 700);
	
	}
	
}


