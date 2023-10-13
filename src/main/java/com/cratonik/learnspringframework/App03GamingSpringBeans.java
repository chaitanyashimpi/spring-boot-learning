package com.cratonik.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cratonik.learnspringframework.game.GameRunner;
import com.cratonik.learnspringframework.game.GamingConsole;
import com.cratonik.learnspringframework.game.MarioGame;
import com.cratonik.learnspringframework.game.PacmanGame;
import com.cratonik.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){			
			context.getBean(GamingConsole.class).up();
		}
	}

}
