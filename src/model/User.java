package model;

import processing.core.PApplet;

public class User {

	private PApplet app;
	private String username, password, email;
	private int number;

	public User(PApplet app, String username, String password, String email, int number) {
		this.app = app;
		this.username = username;
		this.password = password;
		this.email = email;
		this.number = number;
		
	}

}
