package com.in28minute.learningspringframework;

import com.in28minute.learningspringframework.game.MarioGame;
import com.in28minute.learningspringframework.game.PackmanGame;
import com.in28minute.learningspringframework.game.superContra;
import com.in28minute.learningspringframework.game.GameRunner;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new superContra();
        var game = new PackmanGame();
        var gameRunner = new GameRunner(game);    // mariogame obj inside gameRunner obj
        gameRunner.run();
    }
}
