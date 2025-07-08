package com.in28minute.learningspringframework.examples.a1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YoureBusinessClass{

    @Autowired                 // @autowired on any field  -> flied injection .
    Dependency1 dependency1;

    @Autowired                 
    Dependency2 dependency2;

    public String toString(){
        return "using " + dependency1 + " and "+ dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{
}

@Configuration      // since it @confifuration , this class is a bean also .
@ComponentScan      // no need to mention the package if @componentScan in same package  .
public class DepInjectionLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (DepInjectionLauncherApplication.class);){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            
            System.out.println(context.getBean(YoureBusinessClass.class));
        }
    }
}
