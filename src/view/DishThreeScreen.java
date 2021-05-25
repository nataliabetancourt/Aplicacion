package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishThreeScreen extends Dish{

	private PApplet app;
	private PImage RAVIOLI;

	public DishThreeScreen (PApplet app,ControlP5 cp5, CheckBox checkbox) {
		super(app, cp5, checkbox);
		
		this.app = app;
		//Image
		RAVIOLI = app.loadImage("./data/images/RAVIOLI.png");
	}
	
	public void drawRavioli() {
		app.image(RAVIOLI, 0, 0, 323, 700);
}
}
