package com.in28minute.learningspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole {
    public void up(){
        System.out.println(" packman up");
    }
    public void down(){
        System.out.println("packman  duck");
    }
    public void left(){
        System.out.println("packman left");
    }
    public void right(){
        System.out.println("packman bullet fire");
    }
}
