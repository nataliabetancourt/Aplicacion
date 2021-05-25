package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishFourScreen extends Dish{

	private PApplet app;
	private PImage CANNOLIS;

	public DishFourScreen(PApplet app, ControlP5 cp5, CheckBox checkbox) {
			super(app, cp5, checkbox);
			
			this.app = app;
			//Image
			CANNOLIS = app.loadImage("./data/images/CANNOLIS.png");
			
	}
	
	public void drawCannolis() {
		app.image(CANNOLIS, 0, 0, 323, 700);
}

}
