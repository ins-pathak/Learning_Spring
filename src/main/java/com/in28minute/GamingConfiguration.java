package com.in28minute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minute.learningspringframework.game.GameRunner;
import com.in28minute.learningspringframework.game.GamingConsole;
import com.in28minute.learningspringframework.game.PackmanGame;

@Configuration
public class GamingConfiguration {

    // useing game and gameRunner as spring bean 
        //  (using all the previous game classes and create beans)
    @Bean
    public GamingConsole game(){
        var game = new PackmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    
}
