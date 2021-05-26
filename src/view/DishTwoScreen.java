package view;

//import controlP5.CheckBox;
//import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class DishTwoScreen extends Dish{

<<<<<<< HEAD
	private PApplet app;
=======
>>>>>>> 02327ad16937d919adcacc4298084705f3c0d498
	private PImage pizza;

	public DishTwoScreen(PApplet app) {
			super(app);
			
<<<<<<< HEAD
			pizza = app.loadImage("./data/images/DISH pizza.png");
			
	}
		
	public void draw() {
		
		app.image(pizza, 0, 0, 323, 700);
	
=======
			pizza = app.loadImage("./data/images/pizza.jpg");
			
	}
			
	public void draw() {
		app.image(pizza, 0, 0, 323, 700);

>>>>>>> 02327ad16937d919adcacc4298084705f3c0d498
	}
	
}


