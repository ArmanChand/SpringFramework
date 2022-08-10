package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		//SpringApplication.run(LearnSpringFrameworkApplication.class, args);


		MarioGame game = new MarioGame();

		GameRunner runner = new GameRunner(game);
		runner.runGame();

	}


}
