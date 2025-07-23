package com.in28minute.learningspringframework.examples.a0;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      // since it @confifuration , this class is a bean also .
@ComponentScan      // no need to mention the package if @componentScan in same package  .
// this Component in pachman and  ComponentScan here will auto create and scan spring bean for us
public class SimpleSpringCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (SimpleSpringCongextLauncherApplication.class);){
            
        }
        
    }
}
