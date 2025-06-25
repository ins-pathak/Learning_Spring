package com.in28minute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {
    public static void main(String[] args) {
    //1. launching spring context 
    var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    //2. configure the things that are managed by spring - @configuration 
    }
}
