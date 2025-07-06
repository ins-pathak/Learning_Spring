package com.in28minute.learningspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class superContra implements GamingConsole {
    public void up(){
        System.out.println(" go up");
    }
    public void down(){
        System.out.println("go for duck");
    }
    public void left(){
        System.out.println("take left");
    }
    public void right(){
        System.out.println("bullet fire");
    }
}
