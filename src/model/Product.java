package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Product {
	
	protected PApplet app;
	protected String name, date;
	protected float price, extra1, extra2, extra3;

	public Product(PApplet app, String name, String date, double d, double e, double f, double g) {
		this.app = app;
		this.name = name;
		this.date = date;
		this.price = (float) d;
		this.extra1 = (float) e;
		this.extra2 = (float) f;
		this.extra3 = (float) g;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getDate() {
		return date;
	}
	
	public float getExtra1() {
		return extra1;
	}
	
	public float getExtra2() {
		return extra2;
	} 
	
	public float getExtra3() {
		return extra3;
	}
	
	public String getName() {
		return name;
	}
	

}
