package com.in28minute.learningspringframework.examples.f1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
    SomeDependency someDependency;
    SomeClass(SomeDependency someDependency){
        // super();
        this.someDependency = someDependency;
        System.out.println("all dependencies are ready");
    }

    // used on method to execute after dependencies injection is done
    // or any other bean use this bean 
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    // signales the instance in the process is removed by the container
    // or the resourses are released 
    @PreDestroy
    public void cleanup(){
        System.out.println("cleanup");
    }
}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("some logic using someDependency");
    }
}

@Configuration      
@ComponentScan      
public class PrePostAnnotationCongextLauncherApplication{
    
    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
        (PrePostAnnotationCongextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).
                    forEach(System.out::println);
        }
        
    }
}
