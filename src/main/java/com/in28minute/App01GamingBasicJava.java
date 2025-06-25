package com.in28minute;

import com.in28minute.learningspringframework.game.MarioGame;
import com.in28minute.learningspringframework.game.PackmanGame;
import com.in28minute.learningspringframework.game.superContra;
import com.in28minute.learningspringframework.game.GameRunner;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new superContra();
        var game = new PackmanGame();
        var gameRunner = new GameRunner(game);    // object creation and wireing dependencies
        gameRunner.run();
    }
}
