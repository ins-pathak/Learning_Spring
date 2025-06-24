package com.in28minute.learningspringframework;

import com.in28minute.learningspringframework.game.MarioGame;
import com.in28minute.learningspringframework.game.GameRunner;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
