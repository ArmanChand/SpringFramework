package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.ContraGame;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();
//		ContraGame game = new ContraGame();
//
//		GameRunner runner = new GameRunner(game);
		runner.runGame();

	}


}
