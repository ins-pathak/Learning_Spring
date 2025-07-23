package com.in28minute.learningspringframework.examples.c1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration  
@ComponentScan      
public class RealWorldCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (RealWorldCongextLauncherApplication.class);){
            
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculatorService.class).findMax()); 
        }
        
    }
}
