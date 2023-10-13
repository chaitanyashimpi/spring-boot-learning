package com.cratonik.learnspringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("EatUp");
	}
	public void down() {
		System.out.println("EatDown");
	}
	public void left() {
		System.out.println("EatLeft");
	}
	public void right() {
		System.out.println("EatRight");
	}

}
