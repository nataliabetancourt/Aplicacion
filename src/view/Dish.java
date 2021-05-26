package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import controller.DishController;
import processing.core.PApplet;
import processing.core.PImage;

public class Dish {

	protected PApplet app;
	protected float basicPrice, extra1, extra2, extra3, total;
	protected DishController controller;
	
	public Dish(PApplet app) {
		this.app = app;
		
		controller = new DishController(app);
	}

}
