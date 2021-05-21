package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Product {
	
	private PApplet app;
	private PImage product;
	private String name, date;
	private int price, extra1, extra2, extra3;

	public Product(PApplet app, String name, String date, int price, int extra1, int extra2, int extra3) {
		this.app = app;
		this.name = name;
		this.date = date;
		this.price = price;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.extra3 = extra3;
	}

}
