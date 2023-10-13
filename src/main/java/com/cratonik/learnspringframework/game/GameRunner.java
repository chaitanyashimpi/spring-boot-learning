package com.cratonik.learnspringframework.game;

public class GameRunner {
	
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
