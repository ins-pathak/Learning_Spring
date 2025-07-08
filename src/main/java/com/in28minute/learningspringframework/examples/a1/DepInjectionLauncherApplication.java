package com.in28minute.learningspringframework.examples.a1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YoureBusinessClass{

    Dependency1 dependency1;
              
    Dependency2 dependency2;
    
    // gives waring bcz if  having only one constructor than no need to call it 
    // spring automatically use it for dependency injection .
    @Autowired    // class have single constructor no need to call @autowired it will automatically use for dependency injection     
    public YoureBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){             // use stringbuffer instead of string
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
