package view;

//import controlP5.CheckBox;
//import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishOneScreen extends Dish{
	
<<<<<<< HEAD
	private PApplet app;
=======
>>>>>>> 02327ad16937d919adcacc4298084705f3c0d498
	private PImage pasta;

	public DishOneScreen(PApplet app) {
			super(app);
			
<<<<<<< HEAD
			//this.app = app;
			
			pasta = app.loadImage("../data/images/DISH pasta.jpg");
	}

	public void draw() {
		
		app.image(pasta, 0, 0, 323, 700);
	
=======
			//Images
			pasta = app.loadImage("./data/images/pasta.jpg");
	}

	public void draw() {
		app.image(pasta, 0, 0, 323, 700);

>>>>>>> 02327ad16937d919adcacc4298084705f3c0d498
	}
	
}
