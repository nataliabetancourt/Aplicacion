package view;

//import controlP5.CheckBox;
//import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishOneScreen extends Dish{
	
	private PApplet app;
	private PImage pasta;

	public DishOneScreen(PApplet app) {
			super(app);
			
			//this.app = app;
			
			pasta = app.loadImage("../data/images/DISH pasta.jpg");
	}

	public void draw() {
		
		app.image(pasta, 0, 0, 323, 700);
	
	}
	
}
