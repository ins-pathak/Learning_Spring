package com.in28minute;


import com.in28minute.learningspringframework.game.PackmanGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minute.learningspringframework.game.GameRunner;
import com.in28minute.learningspringframework.game.GamingConsole;

@Configuration
@ComponentScan("package com.in28minute.learningspringframework.game")
// this Component in pachman and  ComponentScan here will auto create and scan spring bean for us
public class App03GamingSpringBeans {
    
    
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (App03GamingSpringBeans.class);){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
        
    }
}
