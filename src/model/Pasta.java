package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Pasta extends Product{
	
	private PImage pasta;

	public Pasta(PApplet app, String name, String date, double d, double e, double f, double g, String img){
		super(app, name, date, d, e, f, g, img);
		
		pasta = app.loadImage(img);
		
	}

	public PImage getPasta() {
		return pasta;
	}
}
