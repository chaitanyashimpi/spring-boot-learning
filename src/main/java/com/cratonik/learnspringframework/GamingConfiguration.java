package com.cratonik.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cratonik.learnspringframework.game.GameRunner;
import com.cratonik.learnspringframework.game.GamingConsole;
import com.cratonik.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	

	// TODO Auto-generated method stub
//	var game = new MarioGame();
//	var game = new SuperContraGame();
	
//	var game = new PacmanGame(); //1: Object Creation
	
//	var gameRunner = new GameRunner(game); 
	// 2: Object Creation + Wiring of dependencies
	// Game is a dependency of GameRunner
//	gameRunner.run();
//}

}
