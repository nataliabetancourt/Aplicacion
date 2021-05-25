package model;

import processing.core.PApplet;

public class User {

	private PApplet app;
	private String username, password, email, number;

	public User(PApplet app, String username, String password, String email, String number) {
		this.app = app;
		this.username = username;
		this.password = password;
		this.email = email;
		this.number = number;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
