package com.in28minute.learningspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;     //reference variable of MarioGame
    public GameRunner(GamingConsole game){ // constructur 
        this.game = game;
    }
    public void run() {
        System.out.println("mario game is running ! ");
        game.up();
        game.down();
        game.left();
        game.right();
    }
    
}
