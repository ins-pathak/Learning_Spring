package com.in28minute;

import com.in28minute.learningspringframework.game.MarioGame;
import com.in28minute.learningspringframework.game.PackmanGame;
import com.in28minute.learningspringframework.game.superContra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import com.in28minute.learningspringframework.game.GameRunner;
import com.in28minute.learningspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (GamingConfiguration.class);){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
        
    }
}
