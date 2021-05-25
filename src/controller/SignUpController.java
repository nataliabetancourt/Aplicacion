package controller;

import java.util.ArrayList;

import model.User;
import processing.core.PApplet;

public class SignUpController {
	
	private PApplet app;
	private ArrayList<User> users;

	public SignUpController(PApplet app) {
		this.app = app;
		
		this.users = new ArrayList<>();
	}
	
	public void addUser(String username, String password, String email, String number) {
		users.add(new User(app, username, password, email, number));
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	
	
}
