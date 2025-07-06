package com.in28minute.learningspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go down");
    }
    public void left(){
        System.out.println("go left");
    }
    public void right(){
        System.out.println("go right");
    }
}
