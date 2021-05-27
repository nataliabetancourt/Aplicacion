package view;

import processing.core.PApplet;
import processing.core.PImage;

public class FeedbackScreen {

	private PApplet app;
	private PImage feedback, product;

	public FeedbackScreen(PApplet app) {
		this.app = app;

		// Image
		feedback = app.loadImage("./data/images/feedback.jpg");
	}

	public void drawFeedback() {
		app.image(feedback, 0, 0, 323, 700);
		app.image(product, 50, 128, 226, 112);
	}
	
	public void receiveInfo(int productNum) {
		
		switch (productNum) {
		case 1:
			product = app.loadImage("./data/images/pastaSmall.jpg");
			break;
		case 2:
			product = app.loadImage("./data/images/pizzaSmall.jpg");
			break;
		case 3:
			product = app.loadImage("./data/images/ravioliSmall.jpg");
			break;
		case 4:
			product = app.loadImage("./data/images/cannolisSmall.jpg");
			break;
		}

	}

}
