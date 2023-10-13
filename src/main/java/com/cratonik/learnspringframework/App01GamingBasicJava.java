package com.cratonik.learnspringframework;

import com.cratonik.learnspringframework.game.GameRunner;
import com.cratonik.learnspringframework.game.MarioGame;
import com.cratonik.learnspringframework.game.PacmanGame;
import com.cratonik.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game); 
		// 2: Object Creation + Wiring of dependencies
		// Game is a dependency of GameRunner
		gameRunner.run();
	}

}
