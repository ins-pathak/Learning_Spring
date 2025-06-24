package com.in28minute.learningspringframework.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game){
        this.game = game;
    }
    public void run() {
        System.out.println("mario game is running ! ");
    }
    
}
